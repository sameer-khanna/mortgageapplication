package io.swagger.api.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.api.FindApplicationsApi;
import io.swagger.model.Application;

@Service
public class FindApplicationsApiImpl implements FindApplicationsApi {

	@Autowired
	private List<Application> mortgageApplications;

	@Override
	public ResponseEntity<List<Application>> findApplications(String sortBy) {

		if (sortBy.equalsIgnoreCase("offerDate")) {
			Collections.sort(mortgageApplications, new Comparator<Application>() {
				@Override
				public int compare(Application arg0, Application arg1) {
					return arg0.getOfferDate().compareTo(arg1.getOfferDate());
				}
			});
		} else if (sortBy.equalsIgnoreCase("createdDate")) {
			Collections.sort(mortgageApplications, new Comparator<Application>() {
				@Override
				public int compare(Application arg0, Application arg1) {
					return arg0.getCreatedDate().compareTo(arg1.getCreatedDate());
				}
			});
		} else if (sortBy.equalsIgnoreCase("version")) {
			Collections.sort(mortgageApplications, new Comparator<Application>() {
				@Override
				public int compare(Application arg0, Application arg1) {
					return arg0.getVersion().compareTo(arg1.getVersion());
				}
			});
		}
		return ResponseEntity.ok().body(mortgageApplications);
	}
}
