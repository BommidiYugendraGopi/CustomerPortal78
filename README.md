## ***** Customer Portal – Spring Boot REST API *****

## 1. Project Overview

Customer Portal is a Java Spring Boot application that provides REST APIs to manage customer information.

This project performs basic CRUD operations (Create, Read, Update, Delete) using Spring Boot, Spring Data JPA, and a database.

Users can create customer records, view all customers, search customers by ID or email, update customer details, and delete customer records.

## 2. Technologies Used

- **Java** – Programming language
- **Spring Boot** – Application development framework
- **Spring Web** – Creating REST APIs
- **Spring Data JPA** – Database operations
- **Hibernate** – ORM (Object Relational Mapping)
- **MySQL** – Database (if configured)
- **Lombok** – Reducing boilerplate code (NoArgsConstructor)
- **Maven** – Project build and dependency management

## 3. Project Structure

```text
Customerportal
│
├── src/main/java
│   │
│   └── com.vcube.customerportal
│       │
│       ├── CustomerportalApplication.java
│       │
│       ├── controller
│       │   └── CustomerController.java
│       │
│       ├── model
│       │   └── Customer.java
│       │
│       ├── repo
│       │   └── CustomerRepo.java
│       │
│       └── service
│           ├── CustomerService.java
│           └── CustomerServiceImpl.java
│
└── src/main/resources
    └── application.properties
```

## 4. Customer Model

The Customer class represents customer information stored in the database.

| Field | Data Type | Description |
|---|---|---|
| cid | Integer | Customer ID (Primary Key) |
| name | String | Customer Name |
| age | Integer | Customer Age |
| email | String | Customer Email |
| state | String | Customer State |
| phone | Long | Customer Phone Number |
| city | String | Customer City |

**Database Table Name:** `customer78`

## 5. Project Architecture

The project follows a layered architecture.

1. **Controller Layer:** Receives HTTP requests from the client and sends responses.
2. **Service Layer:** Contains the business logic and handles customer operations.
3. **Repository Layer:** Communicates with the database using Spring Data JPA.
4. **Model Layer:** Represents the customer data and database table.

### Request Flow

```text
Client (Postman)
       |
       v
CustomerController
       |
       v
CustomerService
       |
       v
CustomerServiceImpl
       |
       v
CustomerRepo
       |
       v
Database (MySQL)
```

## 6. REST API Endpoints

Base URL:

`http://localhost:8080/customer`

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/wel` | Display welcome message |
| POST | `/create` | Create a new customer |
| GET | `/allcustomerinfo` | Get all customers |
| GET | `/fbi/{id}` | Find customer by ID |
| GET | `/fbe/{email}` | Find customer by email |
| PUT | `/update/{id}` | Update customer details |
| DELETE | `/del/{cid}` | Delete customer by ID |

## 7. API Testing Using Postman

### 1. Welcome API

- Method: GET
- URL: `http://localhost:8080/customer/wel`

Response:

```text
hi ra
```

### 2. Create Customer

- Method: POST
- URL: `http://localhost:8080/customer/create`
- Body: Select raw → JSON

Request:

```json
{
    "name": "Yugendra",
    "age": 22,
    "email": "yu@gmail.com",
    "state": "Odisha",
    "phone": 9876543210,
    "city": "Bhubaneswar"
}
```

### 3. Get All Customers

- Method: GET
- URL: `http://localhost:8080/customer/allcustomerinfo`

Returns the list of all customers stored in the database.

### 4. Find Customer By ID

- Method: GET
- URL: `http://localhost:8080/customer/fbi/15`

Returns customer information whose ID is 15.

### 5. Find Customer By Email

- Method: GET
- URL: `http://localhost:8080/customer/fbe/yu@gmail.com`

Returns customer information using the email address.

### 6. Update Customer

- Method: PUT
- URL: `http://localhost:8080/customer/update/18`
- Body: Select raw → JSON

Request:

```json
{
    "name": "Yugendra Updated",
    "age": 23,
    "email": "updated@gmail.com",
    "state": "Odisha",
    "phone": 9876543210,
    "city": "Cuttack"
}
```

Updates the existing customer information for ID 18.

### 7. Delete Customer

- Method: DELETE
- URL: `http://localhost:8080/customer/del/15`

Deletes the customer whose ID is 15.

## 8. How to Run the Project

Follow these steps to execute the application.

1. Clone or download the project.
2. Open the project in Spring Tool Suite (STS), Eclipse, or IntelliJ IDEA.
3. Configure your database in `application.properties`.
4. Make sure the required dependencies are available in `pom.xml`.
5. Run `CustomerportalApplication.java` as a Spring Boot application.
6. The application starts on port 8080 by default.
7. Open Postman and test the REST API endpoints.

## 9. Database Configuration

Example MySQL configuration for `application.properties`:

```properties
spring.application.name=customerportal
 server.port=8080
 #database related info
 spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
 spring.datasource.url=jdbc:mysql://localhost:3306/sb
 spring.datasource.username=root
 spring.datasource.password=root
 
 #jpa retated info
spring.jpa.hibernate.ddl-auto=update
 spring.jpa.show-sql=true
```

Make sure the MySQL database `customerdb` exists before running the application.

## 10. CRUD Operations

CRUD stands for:

- **Create:** Insert new customer information.
- **Read:** Retrieve customer information.
- **Update:** Modify existing customer information.
- **Delete:** Remove customer information.

## 11. Conclusion

The Customer Portal project demonstrates how to develop RESTful web services using Java Spring Boot.

It explains the implementation of layered architecture, dependency injection, REST API annotations, Spring Data JPA, and database connectivity.

This project provides practical knowledge of developing backend applications using Spring Boot.
