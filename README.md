# backend-spring-authentication

This Spring Boot project is designed to serve as a robust backend with authentication functionality, allowing users to log in as Admin or User.

## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot) - A Java framework for backend development.
- [Spring Security](https://spring.io/projects/spring-security) - For authentication and authorization management.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - For data access layer.
- [Hibernate](https://hibernate.org/) - An ORM framework for entity management.
- [MySQL](https://www.mysql.com/) - A relational database for storing user information.
- [JSON Web Tokens (JWT)](https://jwt.io/) - For token-based authentication.

## Features

- JWT-based authentication for Admin and User roles.
- User management (CRUD) for administrators.
- User profile management for regular users.
- Secure endpoints for various functionalities.
- MySQL database configuration for storing user information.

## Configuration

1. Clone this repository to your local machine.
2. Ensure you have a running MySQL instance and update the connection settings in the `application.properties` file.
3. Import the project into your preferred IDE as a Spring Boot project.
4. Run the application.

## Usage

1. Register an Admin account using the registration API.
2. Use the login API to obtain a JWT token.
3. Use this token to access secure endpoints as either an Admin or a User.

## API Examples

### Register a New User

```http
POST /auth/signup
...
