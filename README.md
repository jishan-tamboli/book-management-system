Book Management System

A Spring Boot application that provides a simple CRUD-based API for managing books.
The system uses Spring Data JPA for database operations and MySQL as the data store.
Features

* Add new books
* Retrieve books by name, author, price, or ID
* Retrieve all books
* Update existing books
* Delete books by ID
* REST API architecture
* Layered structure (Controller → Service → Repository)

Technologies Used

* Java 17
* Spring Boot 3
* Spring Data JPA
* MySQL
* Hibernate
* Maven
* IntelliJ IDEA


API Endpoints

Create


POST /book/v1/addBook


 Read


GET /book/v1/getBookByName/{name}
GET /book/v1/getBookByAuthor/{author}
GET /book/v1/getBookByPrice/{price}
GET /book/v1/getBookById/{id}
GET /book/v1/getAllBooks


 Update


PUT /book/v1/updateBook/{id}


Delete


DELETE /book/v1/deleteBook/{id}



 Database Structure (books table)

| Column   | Type     |
| -------- | -------- |
| id       | INT (PK) |
| name     | VARCHAR  |
| author   | VARCHAR  |
| price    | DOUBLE   |
| quantity | INT      |
-----------------------

How to Run the Application

1. Clone the repository
2. Configure MySQL credentials in `application.properties`
3. Build and run the project using IntelliJ IDEA or Maven:


mvn spring-boot:run


4. Test the APIs with Postman or any REST client




