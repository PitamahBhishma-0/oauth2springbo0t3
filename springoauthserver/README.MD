# OAuth2 Authorization Server

This project demonstrates an OAuth2 authorization server implemented using Spring Security and Spring Boot. The server provides token-based authentication and authorization for client applications.

## Components

### `SecurityConfig.java`

The `SecurityConfig` class defines the security configuration for the authorization server. It sets up two security filter chains:
1. **OAuth2 Authorization Server Filter Chain**
    - Configured to handle OAuth2 authorization requests.
    - Applies default security configurations from `OAuth2AuthorizationServerConfiguration`.
    - Uses JWT tokens for resource access (`OAuth2ResourceServerConfigurer::jwt`).

2. **Application Security Filter Chain**
    - Configured for general application security.
    - Enables form login and requires authentication for all HTTP requests.

### `JpaUserDetailsManager.java`

The `JpaUserDetailsManager` implements Spring Security's `UserDetailsManager` to manage user details stored in a JPA repository. It loads user information based on the provided username and constructs `UserDetails` objects for authentication.

### `JpaRegisteredClientRepository.java`

The `JpaRegisteredClientRepository` implements `RegisteredClientRepository` to manage registered clients (applications) authorized to access the server. It interacts with a JPA repository (`ClientRepository`) to save and retrieve client details.

### `JpaOAuth2AuthorizationService.java`

The `JpaOAuth2AuthorizationService` provides CRUD operations for OAuth2 authorizations. It handles the storage and retrieval of authorization details using a JPA repository (`AuthorizationRepository`). This service is responsible for managing authorization codes, access tokens, and refresh tokens.

### `JpaOAuth2AuthorizationConsentService.java`

The `JpaOAuth2AuthorizationConsentService` manages user consents for client applications. It stores and retrieves authorization consents using a JPA repository (`AuthorizationConsentRepository`). This service ensures that users have explicitly granted permissions to client applications.

## Setup and Usage

1. **Dependencies**
    - Ensure Java 17 or 17+ and Maven/Gradle are installed.
    - Spring Boot 3+.

2. **Configuration**
    - Customize `application.properties` as needed, especially the `spring.security.oauth2.resourceserver.jwt.issuer-uri` property to point to your authorization server's issuer URI.

3. **Build and Run**
    - Build the project using Maven (`mvn install`) or Gradle.
    - Start the application using Maven (`mvn spring-boot:run`) or Gradle.

## Author

Gaurav Basyal
