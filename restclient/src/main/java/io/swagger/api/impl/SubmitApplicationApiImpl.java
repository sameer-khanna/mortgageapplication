package io.swagger.api.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.Period;

import io.swagger.api.SubmitApplicationApi;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MortgageApplicationApi;
import io.swagger.client.model.Application;
import io.swagger.error.CustomParameterizedException;

@Service
public class SubmitApplicationApiImpl implements SubmitApplicationApi {

	@Override
	public ResponseEntity<Void> submitApplication(Application body) {
		ApiClient client = new ApiClient();
		client.setBasePath("http://localhost:8081/restserver");
		MortgageApplicationApi api = new MortgageApplicationApi(client);
		try {
			LocalDate currentDate = OffsetDateTime.now().toLocalDate();
			LocalDate applicationOfferDate = body.getOfferDate().toLocalDate();
			Period period = Period.between(currentDate, applicationOfferDate);
			if (period.getMonths() < 6) {
				throw new CustomParameterizedException("Offer date is less than 6 months from now.");
	        }
			List<Application> mortgageApplications = api.findApplications("version");
			boolean lowerVersionApplication = false;
			if (mortgageApplications.size() > 0) {
				lowerVersionApplication = mortgageApplications.get(0).getVersion()
						.compareTo(body.getVersion()) > 0;
			}
			if (lowerVersionApplication) {
				throw new CustomParameterizedException("Lower version application was received for MortgageID "
						+ body.getMortgageID() + ". Version Received " + body.getVersion());
			}
			boolean sameVersionApplication = mortgageApplications.stream()
					.anyMatch(e -> e.getMortgageID().equalsIgnoreCase(body.getMortgageID())
							&& e.getVersion().compareTo(body.getVersion()) == 0);
			if (sameVersionApplication) {
				api.updateApplication(body);
			} else {
				api.submitApplication(body);
			}
			return ResponseEntity.ok().body(null);
		} catch (ApiException e) {
			throw new CustomParameterizedException("Exception while saving Mortgage Applications. " + e.getMessage());
		}
	}

}
