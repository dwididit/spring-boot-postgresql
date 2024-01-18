# Spring Boot and PostgreSQL Integration

This project integrates Spring Boot with PostgreSQL to manage product data.

## Description

This application is designed to showcase a simple CRUD operation using Spring Boot as the backend and PostgreSQL as the database. It allows users to manage product information including product names and prices.

## Getting Started

### Dependencies

- Java JDK 17 or later
- Spring Boot 3.1.7 or later
- PostgreSQL 16 or later


## Run Locally

Clone the project

```bash
  git clone https://github.com/dwididit/spring-boot-postgresql.git
```

Go to the project directory

```bash
  cd my-project
```

Setting up PostgreSQL
1. Install PostgreSQL
2. Create a database named `products_db` (or your preferred name)
3. Create the `products` table:

```sql
CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    price NUMERIC(10, 2) NOT NULL
);
```

Configuring Spring Boot

Update src/main/resources/application.properties with your PostgreSQL credentials:

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/products_db
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
```

Running the Application

Run the application using Maven:

```bash
./mvnw spring-boot:run
```


## Usage/Examples

After running the application, you can perform CRUD operations on the products table through the exposed endpoints.


## Contributing

Contributions are welcome! Please fork the repository and create a new branch for your feature. Then, submit a pull request.


