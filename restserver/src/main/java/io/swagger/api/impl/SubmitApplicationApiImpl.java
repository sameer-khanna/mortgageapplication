package io.swagger.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.api.SubmitApplicationApi;
import io.swagger.model.Application;

@Service
public class SubmitApplicationApiImpl implements SubmitApplicationApi {
	
	@Autowired
	private List<Application> mortgageApplications;

	@Override
	public ResponseEntity<Void> submitApplication(Application body) {
		mortgageApplications.add(body);
		return ResponseEntity.ok().body(null);
	}

}
