# Online Food Order App

Online Food Order App is a Java Spring Boot REST API application that manages users, restaurants, food items, orders, and payments for an online food ordering system.

---

## Features

- User registration and management (create, update, view users).
- Restaurant management: add restaurants, manage menus, list available food items.
- Order management with order items and order status (for example CREATED, CONFIRMED, DELIVERED).
- Billing and payment data using dedicated DTOs (such as `BillResponse` and `PaymentDto`).
- Consistent API responses using a generic `ResponseStructure` wrapper for success and error messages.

---

## Tech Stack

- Java
- Spring Boot (Web, Spring Data JPA, Validation)
- Maven
- Relational database (MySQL or PostgreSQL)
- IDE: Eclipse IDE for Enterprise Java or IntelliJ IDEA (any Java IDE works)

---

## Project Structure

The main packages are:

- `orderApp.controller`  
  REST controllers for handling HTTP requests (for example `FoodController`, `OrderController`, `RestaurantController`, `UserController`).

- `orderApp.dto`  
  Data Transfer Objects such as:
  - `BillResponse`
  - `OrderItemRequest`
  - `OrderRequest`
  - `PaymentDto`
  - `ResponseStructure`

- `orderApp.entity`  
  JPA entities that map to database tables:
  - `Food`
  - `Order`
  - `OrderItem`
  - `OrderStatus`
  - `Restaurant`
  - `User`

- `orderApp.repository`  
  Spring Data JPA repositories for database operations.

- `orderApp.service` and `orderApp.service.impl`  
  Service interfaces and implementations containing business logic.

- `orderApp.exception`  
  Custom exceptions and global exception handlers for clean error responses.

---

## Getting Started

### Prerequisites

- JDK 17+ installed.
- Maven installed (if not using the Maven wrapper).
- MySQL or PostgreSQL running locally.
- Git installed.

### Clone the repository

```
git clone https://github.com/mdmashoodalam/OnlineFoodOrderApp.git
cd OnlineFoodOrderApp
```



### Configure the database

Edit `src/main/resources/application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/online_food_order
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Adjust the values to match your local database configuration.

### Build and run

```
mvn clean install
mvn spring-boot:run
```

By default the app runs on:

```
http://localhost:8080
```

---

## API Overview

Base URL (example): `http://localhost:8080/api`

Example endpoints (adapt to your actual mappings):

### User APIs

- `POST /users` – Create a new user.
- `GET /users` – Get all users.
- `GET /users/{id}` – Get a user by id.
- `PUT /users/{id}` – Update user details.
- `DELETE /users/{id}` – Delete a user.

### Restaurant & Food APIs

- `POST /restaurants` – Create a restaurant.
- `GET /restaurants` – Get all restaurants.
- `POST /restaurants/{id}/foods` – Add a food item to a restaurant.
- `GET /foods` – List all food items.

### Order & Payment APIs

- `POST /orders` – Place a new order using `OrderRequest` and `OrderItemRequest`.
- `GET /orders/{id}` – Get order details and bill information (`BillResponse`).
- `PUT /orders/{id}/status` – Update the order status.
- `POST /payments` – Capture payment details using `PaymentDto` (if implemented).

Use Postman, curl, or any REST client to test these endpoints.

---

## Running Tests

If tests are present, run:

```
mvn test
```

---

## Future Improvements

- Add authentication and authorization using JWT.
- Implement role-based access for admin and customers.
- Add pagination and filtering for restaurants and food items.
- Build a frontend (React / Angular / Vue) to consume these APIs.
- Integrate a real payment gateway and order tracking.
```

If you want, the database name, base URL, or endpoint paths can be adjusted to exactly match your code.
