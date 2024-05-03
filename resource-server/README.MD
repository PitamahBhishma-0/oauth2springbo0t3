# OAuth2 Resource Server with Spring Boot

This project implements a Spring Boot application acting as a resource server in an OAuth2 authorization flow.

## Features
- Retrieves the authenticated user's name from the security context.
- Secured with Spring Security OAuth2 Resource Server.

## Prerequisites
- Java 17+
- Spring Boot 3+
- Maven or Gradle (for building the project)

## Getting Started
1. Clone this repository.
2. Install the project dependencies by running `mvn install` (for Maven) or your equivalent command for Gradle.
3. Configure the `spring.security.oauth2.resourceserver.jwt.issuer-uri` property in `application.properties` to point to your authorization server's issuer URI. By default, it's set to `http://localhost:8080`.
4. Start the application by running `mvn spring-boot:run` (for Maven) or your equivalent command for Gradle. The application will run on port `9009` by default.

## Usage
Once the resource server is running, you can access the `/` endpoint to retrieve the authenticated user's name. This endpoint requires a valid access token from your authorization server in the request header (typically as a Bearer token in the Authorization header). Spring Security will extract the user information from the token and make it available to the resource server.

**Note:** This is a basic example and doesn't include logic for token validation. You'll need to implement token validation based on your specific authorization server implementation.

## Testing
This project includes unit tests for the `GetPrincipal` controller class. You can run the tests using your preferred testing framework (e.g., JUnit).

## Author
Gaurav Basyal
