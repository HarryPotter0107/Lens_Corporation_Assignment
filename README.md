# Lens Corporation Assignment

Description :- 

This repository contains the source code for a basic user authentication and authorization system implemented using Spring Boot and Spring Security. It includes functionalities such as user registration, login/logout, JWT token generation, and authentication using bcrypt password encryption.




1.Key Components:-
 
 *AuthenticationController: Handles user signup and login endpoints.
 
 *UserController: Manages endpoints related to user data and authentication status.
 
 *AuthenticationService: Implements user signup and authentication logic.
 
 *JwtService: Manages JWT token generation, validation, and extraction.
 
 *UserService: Handles user data retrieval and logout functionality.
 
 *GlobalExceptionHandler: Handles global exceptions and returns appropriate error responses.
 
 *SecurityConfig: Configures Spring Security settings, CORS, and authentication provider.
 
 *JwtAuthenticationFilter: Custom JWT authentication filter for validating JWT tokens in requests.
 
 *ApplicationConfig: Configures beans such as UserDetailsService, BCryptPasswordEncoder, and AuthenticationManager.


2.Usage:-
 
 *Clone the repository.
 
 *Configure your database settings in application.properties.
 
 *Build and run the Spring Boot application.
 
 *Access the API endpoints for user authentication and management.


3.Technologies Used:-
 
 *Java
 
 *Spring Boot
 
 *Spring Security
 
 *JWT (JSON Web Tokens)
 
 *Hibernate
 
 *MySQL (or your preferred database)




 <img width="1470" alt="Screenshot 2024-05-13 at 01 50 06" src="https://github.com/HarryPotter0107/Lens_Corporation_Assignment/assets/132452554/96e85948-9f22-4bf6-99ea-85460da3b8aa">


APIs:-


1. POST:- FOR REGISTERING
    Path:- http://localhost:8081/auth/signup
    Requirements:- Authentication not required for this.

2. POST:- FOR LOGIN
     Path:- http://localhost:8081/auth/login
     Requirements:- Authentication required for this. once you register yourself one token is generated.and you have to copy that token. Select authorisation. And then select. auth type is 
                    bearer token. Paste the token number to the token section. save the api and simply send it.

3. GET:- FOR VIEWING OUR DETAILS
     Path:- http://localhost:8081/users/me
     Requirements:-Authentication required for this. once you logged in. If token is not expired you can view your details. if the token is expired, then please kindly generate it again.
   
4. GET:- FOR VIEWING ALL USERS DETAILS
     PATH:- http://localhost:8081/users/all
     Requirements:-Authentication required for this. once you logged in. If token is not expired you can view your details. if the token is expired, then please kindly generate it again.

5. GET:- FOT LOGOUT
    Requirements:- if the token is not expired you simply logged out but it is not expired, then simply hit the path API and set the credentials. Lastly, hit the send button.Logging out 
                   successfully



