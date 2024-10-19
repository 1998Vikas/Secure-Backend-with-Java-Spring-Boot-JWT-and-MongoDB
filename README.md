Secure-Backend-with-Java-Spring-Boot-JWT-and-MongoDB
Spring boot Application for user Registration and Jwt Authentication

1.Features JWT-based authentication. Role-based access control (Admin, User roles). Secure RESTful API endpoints. CRUD operations for users. MongoDB integration.

2.Technologies Used: Java 17 Spring Boot 3 Spring Security JWT (JSON Web Token) MongoDB Maven

3.Testing the APIs with Postman Import Postman Collection: Use the provided Postman collection to test the APIs. Import the collection into Postman.

Register and Login: First, register a new user using the /register endpoint, then use the /login endpoint to obtain a JWT token.

JWT Token: Use the JWT token in the Authorization header as Bearer for secured endpoints.

Access the API: Test other API endpoints like /users and /users/{id} using the token.

Postman JWT Setup After logging in, copy the JWT token from the response. In Postman, go to the Authorization tab, select Bearer Token, and paste the token.
