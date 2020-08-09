# Mortgage System

## Summary
* Developed a client REST API (business layer) that acts as an entry point to the application, handles the business validations and the to & fro communication with the server REST API (data layer). 
* The Data layer maintains the mortgage applications in an Application scoped Spring Bean. 
* OpenAPI specification 3 has been used for creating the API documentation and for auto generation of client and server stubs. 

## Deployment
* Both the Client and Server are Spring Boot applications and can be deployed as JAR files utilizing the embedded Tomcat Container. 
* For On-Prem deployment these can be installed on UNIX containers as executable JAR files using either init.d or systemd service.  
* For Cloud deployment AWS Beanstalk can be used to easily provision all the required underlying AWS services like VPC, EC2, ELB etc.
* The Data layer application should be deployed in a Private Subnet and the Business Layer application in a Public Subnet. The firewall rules should be configured to allow the access to the Data layer application only from the Business layer application. Business layer application will be accessed from the Internet.

## Scope Of Improvement
* Implement authentication/authorization using Spring Security.
* Add filters and JSON Deserializer for handling OWASP vulnerabilities (SQL Injection, XSS etc.).
* Add Mapstruct configuration for simplifying object mappings.
* Maintain configurable items in an external configuration file.
* Re-factor code.
