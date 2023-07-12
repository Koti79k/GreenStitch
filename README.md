<h1> Signup and Login API </h1> 

This is backend application that provides RESTful APIs for user login and signup functionalities. 
It includes security features and JWT-based authentication. 
This application is built with the Spring Boot framework, H2 database for data storage and Postman tool for testing API.

## Technology Used
### SpringBoot
### H2-database
### Postman
### JWT Authentication

## Prerequisites

Before running the application, ensure that you have the following prerequisites installed:

- Java Development Kit (JDK) 8
- Postman or any REST API testing tool

## Installation and Setup

Follow these steps to install and set up the application:

1. Clone the repository:
	git clone <repository-url>

2. Open any Ide of your choice and import the project

3. Download all the Maven dependencies

4. Run the Spring boot project 


The application will start running on http://localhost:8080`.

## About the application
This Spring Boot app is a login-signup service which uses JWT Authentication.
This application uses Spring boot, H2 Database, Spring Security, JWT
JSON Web Tokens (JWT) are the JSON Object which is used to securely transfer information over the web.

## API Endpoints

The following API endpoints are available:

- **POST http://localhost:8080/signUp : Creates a new user account.
 ```
    {
        "username": "Koti",
        "password": "Koti@123"
    }
```

- **POST http://localhost:8080/login : Authenticates a user and generates a JWT token.
  ```
    {
        "username": "Koti",
        "password": "Koti@123"
    }
  
## Testing the APIs

You can test the APIs using a tool like Postman:

1. Open Postman or any REST API testing tool.

2. Send a POST request to `http://localhost:8080/signUp with the user details in the request body.

3. Send a POST request to `http://localhost:8080/login with the user credentials in the request body. You will receive a JWT token in the response.
