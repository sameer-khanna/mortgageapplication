package io.swagger.api.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.api.UpdateApplicationApi;
import io.swagger.model.Application;

@Service
public class UpdateApplicationApiImpl implements UpdateApplicationApi {

	@Autowired
	private List<Application> mortgageApplications;

	@Override
	public ResponseEntity<Void> updateApplication(Application body) {
		Optional<Application> applicationOptional = mortgageApplications.stream()
				.filter(e -> e.getVersion().equals(body.getVersion())).findFirst();
		if (applicationOptional.isPresent()) {
			int index = mortgageApplications.indexOf(applicationOptional.get());
			mortgageApplications.set(index, body);
		}
		return ResponseEntity.ok(null);
	}
}
