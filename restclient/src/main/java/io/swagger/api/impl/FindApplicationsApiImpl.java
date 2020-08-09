package io.swagger.api.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.api.FindApplicationsApi;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MortgageApplicationApi;
import io.swagger.client.model.Application;
import io.swagger.error.CustomParameterizedException;

@Service
public class FindApplicationsApiImpl implements FindApplicationsApi {

	@Override
	public ResponseEntity<List<Application>> findApplications(String sortBy) {
		ApiClient client = new ApiClient();
		client.setBasePath("http://localhost:8081/restserver");
		MortgageApplicationApi api = new MortgageApplicationApi(client);
		try {
			return ResponseEntity.ok().body(api.findApplications(sortBy));
		} catch (ApiException e) {
			throw new CustomParameterizedException("Exception while looking up Mortgage Applications. " + e.getMessage());
		}
	}
}
