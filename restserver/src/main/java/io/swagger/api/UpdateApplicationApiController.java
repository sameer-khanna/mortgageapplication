package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Application;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-09T05:32:42.466Z[GMT]")
@Controller
public class UpdateApplicationApiController implements UpdateApplicationApi {

	private static final Logger log = LoggerFactory.getLogger(UpdateApplicationApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	private final UpdateApplicationApi updateApplication;

	@org.springframework.beans.factory.annotation.Autowired
	public UpdateApplicationApiController(ObjectMapper objectMapper, HttpServletRequest request,
			@Lazy UpdateApplicationApi updateApplication) {
		this.objectMapper = objectMapper;
		this.request = request;
		this.updateApplication = updateApplication;
	}

	public ResponseEntity<Void> updateApplication(
			@ApiParam(value = "Mortgage application that needs to be updated to the store", required = true) @Valid @RequestBody Application body) {
		return updateApplication.updateApplication(body);
	}

}
