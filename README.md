---

# 📚 Book Management System (Spring Boot)

A **RESTful Book Management System** built using **Spring Boot**, **Spring Data JPA**, **MySQL**, and **Aspect-Oriented Programming (AOP)**.
The project demonstrates clean layered architecture, proper separation of concerns, and cross-cutting logging using Spring AOP.

---

## 🚀 Features

* Add a single book
* Add multiple books at once
* Fetch all books
* Fetch book by:

  * Name
  * Author
  * Price
* Update book details
* Delete book by ID
* Centralized logging using **Spring AOP**
* Execution time measurement for service methods

---

## 🧱 Project Architecture

```
Controller  →  Service  →  Repository  →  Database
                ↑
               AOP (Logging & Timing)
```

* **Controller Layer**: Handles HTTP requests
* **Service Layer**: Contains business logic
* **Repository Layer**: JPA data access
* **AOP Layer**: Cross-cutting concerns (logging, execution time)

---

## 🛠️ Tech Stack

* **Java 17**
* **Spring Boot 3.x**
* **Spring Data JPA**
* **Spring AOP**
* **MySQL**
* **Hibernate**
* **Maven**
* **Lombok**

---

## 📦 Entity: Book

```java
Book {
  Integer id
  String name
  String author
  Double price
  Integer quantity
}
```

---

## 🔗 REST APIs

### ➕ Add Book

```
POST /book/v1/addBook
```

```json
{
  "name": "Clean Code",
  "author": "Robert C. Martin",
  "price": 499.0,
  "quantity": 10
}
```

---

### ➕ Add Multiple Books

```
POST /book/v1/addMultipleBooks
```

```json
[
  {
    "name": "Java Basics",
    "author": "James Gosling",
    "price": 299.0,
    "quantity": 5
  },
  {
    "name": "Spring Boot",
    "author": "Pivotal",
    "price": 399.0,
    "quantity": 7
  }
]
```

---

### 📖 Get All Books

```
GET /book/v1/getAllBooks
```

---

### 🔍 Get Book by Name

```
GET /book/v1/getBookByName/{name}
```

---

### 🔍 Get Book by Author

```
GET /book/v1/getBookByAuthor/{author}
```

---

### 🔍 Get Book by Price

```
GET /book/v1/getBookByPrice/{price}
```

---

### ✏️ Update Book

```
PUT /book/v1/updateBook/{id}
```

```json
{
  "name": "Updated Name",
  "author": "Updated Author",
  "price": 599.0,
  "quantity": 8
}
```

---

### ❌ Delete Book

```
DELETE /book/v1/deleteBook/{id}
```

---

## 🧩 Aspect-Oriented Programming (AOP)

The project uses **Spring AOP** to handle logging as a cross-cutting concern.

### Logged Information

* Method start
* Method completion
* Returned execution
* Exception handling
* Execution time (ms)

### Example Log Output

```
Started: addBook
Returned from: addBook
Finished: addBook
Time: 12 ms
```

---

## ⚙️ Configuration

### Database Configuration (`application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/book_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

---

## ▶️ How to Run

1. Clone the repository

   ```bash
   git clone https://github.com/jishan-tamboli/book-management-system.git
   ```
2. Open project in IntelliJ IDEA
3. Configure MySQL database
4. Run `BookApplication`
5. Test APIs using Postman or browser

---

## 🧠 Learning Highlights

* Clean layered architecture
* Proper use of Spring AOP
* Separation of concerns
* JPA repository usage
* REST API best practices
* Feature-branch Git workflow

---

## 📌 Future Enhancements

* Global exception handling (`@ControllerAdvice`)
* DTO & Mapper layer
* Swagger / OpenAPI documentation
* Pagination & sorting
* Unit & integration tests
* SLF4J Logger instead of `System.out.println`

---

