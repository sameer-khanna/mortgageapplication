/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.client.model.Application;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-08T05:01:30.117Z[GMT]")
@Api(value = "findApplications", description = "the findApplications API")
public interface FindApplicationsApi {

    @ApiOperation(value = "Returns Mortgage Applications", nickname = "findApplications", notes = "", response = Application.class, responseContainer = "List", tags={ "Mortgage Application", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Application.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid Request") })
    @RequestMapping(value = "/findApplications",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Application>> findApplications(@NotNull @ApiParam(value = "Sort by this Parameter", required = true) @Valid @RequestParam(value = "sortBy", required = true) String sortBy
);

}

