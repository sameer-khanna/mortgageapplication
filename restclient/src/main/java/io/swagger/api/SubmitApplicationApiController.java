package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.client.model.Application;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-08T05:01:30.117Z[GMT]")
@Controller
public class SubmitApplicationApiController implements SubmitApplicationApi {

	private static final Logger log = LoggerFactory.getLogger(SubmitApplicationApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	private final SubmitApplicationApi submitApplication;

	@org.springframework.beans.factory.annotation.Autowired
	public SubmitApplicationApiController(ObjectMapper objectMapper, HttpServletRequest request,
			SubmitApplicationApi submitApplication) {
		this.objectMapper = objectMapper;
		this.request = request;
		this.submitApplication = submitApplication;
	}

	public ResponseEntity<Void> submitApplication(
			@ApiParam(value = "Mortgage application that needs to be added to the store", required = true) @Valid @RequestBody Application body) {
		return submitApplication.submitApplication(body);
	}

}
