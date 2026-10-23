# Spring Boot Setter Injection

## 📌 About the Project

This project demonstrates Setter-Based Dependency Injection in Spring Boot. It uses a setter method annotated with `@Autowired` to inject the `CustomerService` dependency into the `CustomerController`.

The application also demonstrates how `@Primary` selects the default service implementation when multiple beans implement the same interface.

Customer details are saved to a database using Spring Data JPA.

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

## 📂 Project Structure

```text
com.example.setter
├── controller
│   └── CustomerController.java
├── entity
│   └── Customer.java
├── repository
│   └── CustomerRepo.java
└── service
    ├── CustomerService.java
    ├── CustomerServiceImpl.java
    └── PremiumCustomerServiceImpl.java
```

## 🧩 Concepts Covered

* Dependency Injection (DI)
* Inversion of Control (IoC)
* Setter-Based Dependency Injection
* `@Autowired` annotation
* `@Service` annotation
* `@Primary` annotation
* Interface-based programming
* Multiple service implementations
* Spring Data JPA
* Entity mapping using `@Entity` and `@Id`

## 👤 Customer Entity

The `Customer` entity contains the following fields:

| Field   | Data Type |
| ------- | --------- |
| id      | int       |
| name    | String    |
| email   | String    |
| address | String    |
| type    | String    |

## ⚙️ Service Implementations

### 1. CustomerService

An interface that declares the `addCustomer()` method.

### 2. CustomerServiceImpl

* Implements the `CustomerService` interface.
* Uses `@Service` to register the class as a Spring bean.
* Uses `@Primary` to make it the preferred implementation when Spring must choose between multiple matching beans.

### 3. PremiumCustomerServiceImpl

* Also implements the `CustomerService` interface.
* Uses `@Service` to register the class as a Spring bean.

Both implementations save customer details using `CustomerRepo`.

## 💉 Setter Injection

The `CustomerController` uses the following setter method to receive its dependency:

```java
@Autowired
public void setCustomerService(CustomerService customerService) {
    this.customerService = customerService;
}
```

Spring injects the matching `CustomerService` bean through this method. Because `CustomerServiceImpl` is annotated with `@Primary`, Spring selects it by default.

## 🌐 API Endpoint

| HTTP Method | Endpoint    | Description     |
| ----------- | ----------- | --------------- |
| POST        | `/customer` | Adds a customer |

## 📥 Sample Request

```json
{
  "id": 1,
  "name": "Rahul",
  "email": "rahul@example.com",
  "address": "Pune",
  "type": "Regular"
}
```

## 📤 Expected Response

```text
Customer Added
```

## ▶️ How to Run

1. Clone this repository.
2. Import the project into Spring Tool Suite (STS) as an existing Maven project.
3. Configure the database connection in `application.properties`.
4. Ensure the database is running.
5. Run the Spring Boot application.
6. Send a POST request to `/customer` using Postman.

## 🎯 Learning Objective

The main objective is to understand how Setter-Based Dependency Injection works in Spring Boot and how `@Primary` helps Spring select a default bean when multiple implementations of the same interface exist.
