# Online Food Order App

Online Food Order App is a Java Spring Boot REST API application that manages users, restaurants, food items, orders, and payments for an online food ordering system.[web:8][web:20]

---

## Features

- User registration and management (create, update, view users).[web:20]
- Restaurant management: add restaurants, manage menus, list available food items.[web:8][web:20]
- Order management with order items and order status (for example CREATED, CONFIRMED, DELIVERED).[web:20]
- Billing and payment data using dedicated DTOs (such as `BillResponse` and `PaymentDto`).[web:8]
- Consistent API responses using a generic `ResponseStructure` wrapper for success and error messages.[web:5][web:12]

---

## Tech Stack

- Java
- Spring Boot (Web, Spring Data JPA, Validation)[web:16][web:18]
- Maven
- Relational database (MySQL or PostgreSQL)[web:6]
- IDE: Eclipse IDE for Enterprise Java or IntelliJ IDEA (any Java IDE works)[web:19]

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
  Custom exceptions and global exception handlers for clean error responses.[web:16][web:18][web:20]

---

## Getting Started

### Prerequisites

- JDK 17+ installed.[web:19]
- Maven installed (if not using the Maven wrapper).[web:16]
- MySQL or PostgreSQL running locally.[web:6]
- Git installed.

### Clone the repository

