package io.swagger.api;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import io.swagger.model.Application;

@Configuration
public class ApplicationScopeBeanConfig {

	@Bean(name = "mortgageApplications")
	@ApplicationScope()
	public List<Application> mortgageApplication() {
		List<Application> applicationList = new LinkedList<Application>();
		return applicationList;
	}

}
