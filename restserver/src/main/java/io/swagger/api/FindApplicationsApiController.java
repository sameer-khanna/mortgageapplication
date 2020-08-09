package io.swagger.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Application;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-08T05:01:30.117Z[GMT]")
@Controller
public class FindApplicationsApiController implements FindApplicationsApi {

	private static final Logger log = LoggerFactory.getLogger(FindApplicationsApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	private final FindApplicationsApi findApplicationsApi;

	@org.springframework.beans.factory.annotation.Autowired
	public FindApplicationsApiController(ObjectMapper objectMapper, HttpServletRequest request,
			FindApplicationsApi findApplicationsApi) {
		this.objectMapper = objectMapper;
		this.request = request;
		this.findApplicationsApi = findApplicationsApi;
	}

	public ResponseEntity<List<Application>> findApplications(
			@NotNull @ApiParam(value = "Sort by this Parameter", required = true) @Valid @RequestParam(value = "sortBy", required = true) String sortBy) {

		return findApplicationsApi.findApplications(sortBy);
	}

}
