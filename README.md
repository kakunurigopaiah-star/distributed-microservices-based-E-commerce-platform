## Project Overview

This project is a distributed e-commerce platform developed using a
microservices architecture. Each business functionality is implemented
as an independent Spring Boot service.

The services communicate through REST APIs and are registered with
Eureka Service Discovery. API Gateway provides a single entry point
for client requests.

## System Architecture

Client
   |
   v
API Gateway
   |
   +---- Auth Service
   +---- User Service
   +---- Product Service
   +---- Cart Service
   +---- Order Service
   +---- Payment Service
   +---- Notification Service
   |
   v
Eureka Server

## Service Responsibilities

### API Gateway
Routes incoming client requests to the appropriate microservice.

### Eureka Server
Provides service discovery and maintains information about available
microservice instances.

### Auth Service
Handles user authentication and authorization.

### User Service
Manages user information and user-related operations.

### Product Service
Manages product details and product operations.

### Cart Service
Handles shopping cart creation, updates, and cart items.

### Order Service
Manages order creation and order processing.

### Payment Service
Handles payment-related operations.

### Notification Service
Handles notifications related to application events.

## Database

MySQL is used for persistent data storage.

Each service can maintain its own database/schema to support the
microservices architecture.

## API Communication

The services communicate using REST APIs.

Example API Gateway routes:

- `/auth/**` → Auth Service
- `/users/**` → User Service
- `/products/**` → Product Service
- `/cart/**` → Cart Service
- `/orders/**` → Order Service
- `/payment/**` → Payment Service

## Development Tools

- Spring Tools Suite / Eclipse
- Java JDK
- Maven
- MySQL
- Git
- GitHub
- Postman

## Learning Outcomes

Through this project, I gained practical experience with:

- Microservices Architecture
- Spring Boot
- Spring Cloud
- REST API development
- Service Discovery
- API Gateway
- Database integration
- Git and GitHub
- Maven project management

## Future Enhancements

- Implement JWT-based security
- Add Docker containerization
- Add centralized configuration
- Add distributed logging
- Add automated testing
- Deploy services to AWS

## License

This project is developed for educational and learning purposes.
