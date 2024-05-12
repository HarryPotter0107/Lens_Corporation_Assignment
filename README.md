# Lens_Corporation_Assignment

Description :- This repository contains the source code for a basic user authentication and authorization system implemented using Spring Boot and Spring Security. It includes functionalities such as user registration, login/logout, JWT token generation, and authentication using bcrypt password encryption.


Key Components:-
AuthenticationController: Handles user signup and login endpoints.
UserController: Manages endpoints related to user data and authentication status.
AuthenticationService: Implements user signup and authentication logic.
JwtService: Manages JWT token generation, validation, and extraction.
UserService: Handles user data retrieval and logout functionality.
GlobalExceptionHandler: Handles global exceptions and returns appropriate error responses.
SecurityConfig: Configures Spring Security settings, CORS, and authentication provider.
JwtAuthenticationFilter: Custom JWT authentication filter for validating JWT tokens in requests.
ApplicationConfig: Configures beans such as UserDetailsService, BCryptPasswordEncoder, and AuthenticationManager.


Usage:-
Clone the repository.
Configure your database settings in application.properties.
Build and run the Spring Boot application.
Access the API endpoints for user authentication and management.


Technologies Used:-
Java
Spring Boot
Spring Security
JWT (JSON Web Tokens)
Hibernate
MySQL (or your preferred database)
