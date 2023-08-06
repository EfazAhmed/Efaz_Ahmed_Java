# Table of Contents
1. [Module 1 Challenge](#Module-1-Challenge)
2. [Module 2 Challenge](#Module-2-Challenge)
3. [Summative Project 1 Spring Boot and REST](#Summative-Project-1-Spring-Boot-and-REST)
    - [Video Walkthough](https://www.youtube.com/watch?v=XEws_rIi1y0)
5. [Module 5 Challenge](#Module-5-Challenge)
6. [Module 6 Challenge](#Module-6-Challenge)
7. [Summative Project 2 Bookstore Inventory](#Summative-Project-2-Bookstore-Inventory)
    - [Video Walkthough](https://www.youtube.com/watch?v=uWoGKZG06Jg)

# Module 1 Challenge

### Application Overview
This application is a command-line application that will parse accounting information and output user-readable reports.

### Goals
The goal of this Challenge is to reinforce your knowledge of Git, GitHub, and Java. Specifically, you will do the following:
- Iterate through collections using fundamental Java concepts.
- Convert raw data into Java classes.
- Print specific data using control flow statements or streams.
- Commit code to a Git repository.
- Push your local repository to a remote repository.

### Requirements
- Your solution must reside in an IntelliJ project called M1-Challenge-Lastname-Firstname
- Code is clean (follows general patterns as presented in class) 
- Created a List where there is only one object for each customer
- Added the charges for each Customer to the appropriate Customer List
- Updated the getBalance() function in Customer and sums all AccountRecord charges
- Updated the toString method in Customer so that it prints the Customer id, name, and balance
- Prints out all accounts that have a positive balance
- Prints out all accounts that have a negative balance
- Test case verification of getBalance() functionality
- Test case verification of toString() functionality
    
    
# Module 2 Challenge
    
### User Stories
- As a user, I would like to get a list of all users so I know which users are on Chatter Book.
- As a user, I would like to get information about a specific user to learn more about that user.
- As a user, I would like to get all chatterPosts for a user so I know what they post about.

### Requirements
- Solution resides in a Spring Boot project created via Spring Initializr
- Code is clean (follows general patterns as presented in class)
- ChatterPost class created.
- User class created.
- Controller created and contains necessary Spring annotations.
- Dummy Data integrated into controller constructor.
- A GET route implemented which returns a list of all users.
- A GET route implemented which returns a single user by username.
- A GET route implemented which returns a list of chatterPosts for a user by username.
- API is documented using OpenAPI.


# Summative Project 1 Spring Boot and REST

### User Stories
- As an API user, I want to request a random quote so that I can expand my knowledge.
- As an API user, I want to request a random word and its definition so that I can expand my vocabulary.
- As an API user, I want to request a random answer to a question so that I can be entertained.

### Requirements
- Solution is in an IntelliJ project called Summative-1-Lastname-Firstname, built using Spring Boot and Spring MVC, and Initialized using start.spring.io
- In-memory data follows the pattern shown in the module.
- REST API accepts and returns data in JSON format where appropriate.
- REST API is documented with Swagger. Saved .yaml file in root of project directory.
- Video Summary
- Quote API
    - Code is clean
    - The Quote API provides a quote of the day service and implements the provided route.
    - The Quote model includes: id, author, and quote
    - Service contains at least 10 quotes
    - Quotes are served at random
    - Uses mockMvc to test Quote API
- Word API
    - Code is clean
    - The Word API provides a word of the day service and implements the provided route.
    - The Word model includes: id, word, and definition
    - Service contains at least 10 words and their definitions
    - Words and definitions are served at random
    - Uses mockMvc to test Word API
- Magic 8 Ball API
    - Code is clean
    - The Word API provides a magic 8 ball service and implements the provided route.
    - The Answer model includes: id, question, and answer
    - Service contains at least 6 different Magic 8 Ball responses
    - Magic 8 Ball answers are served at random
    - Uses mockMvc to test Magic 8 Ball API

### Video Submission
- [YouTube Link for Summative Project 1 Walkthough](https://www.youtube.com/watch?v=XEws_rIi1y0)
    - Created by [Efaz Ahmed](https://www.linkedin.com/in/eahmed2024/) and [Reuben Agogoe](https://www.linkedin.com/in/reubenagogoe/)
    - For more information regarding the video submission, please take a look at description of the YouTube Video.

# Module 5 Challenge

### Overview
In this Challenge, you will create SQL queries to answer various questions. All of your queries will be run against the Northwind database.

### Goals

The goal of this Challenge is to reinforce your knowledge of SQL. You'll do the following:
- Use SELECT statements in SQL queries.
- Create specific queries using the WHERE clause and LIKE operator.
- Sort query results using the ORDER BY keyword.

### Requirements
- Your queries must be in a file named northwind-queries-firstname-lastname.sql, in a folder named M5-Challenge-Lastname-Firstname.
- SQL queries are clean (follow general patterns as presented in class), with the question you are answering in a SQL comment above each of your SQL queries.
- Query returns all of the product categories
- Query Returns all of the products made by Dell
- Query returns all orders shipped to Pennsylvania
- The query returns the first name and last name of all employees with last names that start with the letter W.
- The query returns all customers from zip codes that start with 55.
- The query returns all customers from zip codes that end with 0.
- The query returns the first name, last name, and email for all customers with a ".org" email address.
- The query returns the first name, last name, and phone number of all customers from the 202 area code.
- The query returns the first name, last name, and phone number for all customers from the 202 area code, ordered by last name, and first name.

# Module 6 Challenge

### Goals
- The goal of this challenge is to reinforce your knowledge of Spring Data JPA. Specifically, you'll do the following:
    - Automatically create a database using Spring Data JPA.
    - Manipulate relational data using Spring Data JPA.
    - Configure a Spring Boot project to connect with a MySQL database.
    - Set up and execute unit/integration tests for Spring Data JPA.

### User Stories
- As a user, I would like to be able to filter customers by state.
- As a user, I would like to be able to find a specific customer by id.
- As a user, I would like to be able to delete customers.
- As a user, I would like to be able to edit customers.
- As a user, I would like to be able to add new customers.

### Requirements
- Your application must track the following data for each customer:
    - Customer Id
    - First name
    - Last name
    - Email
    - Company
    - Phone
    - Address 1
    - Address 2
    - City
    - State
    - Postal code
    - Country
- The REST API must have the following features:
    - Create a new customer record.
    - Update an existing customer record.
    - Delete an existing customer record.
    - Find a customer record by id.
    - Find customer records by state.

# Summative Project 2 Bookstore Inventory

### User Stories
- As an API user, I would like to create, read, update, and delete authors.
- As an API user, I would like to create, read, update, and delete publishers.
- As an API user, I would like to create, read, update, and delete books.
- As an API user, I would like to find all books by a given author.

### Requirements
- Solution must be in an IntelliJ project called Summative-2-Lastname-Firstname.
- Project must be built using Spring Web, Spring Data JPA, and Spring for GraphQL. Initialize the project using start.spring.io using project options as demonstrated previously in class.
- Project must use Spring Data JPA that follows the pattern shown in class.
- The REST API must accept and return data in JSON format where appropriate.
- The REST API must be documented with Swagger. Save the .yaml file in the root of your project directory.
- Provide a 1-3 minute Video Summary of the project.
- Book API
    - Code is clean (follows general patterns as presented in class).
    - Implementation of Book model
    - Implementation of Book repository and controller for:
        - Create
        - Read by Id
        - Read All
        - Update
        - Delete
        - Search Book by Author Id
    - Test of Book repository and MockMvc test cases for:
        - Create
        - Read by Id
        - Read All
        - Update
        - Delete
        - Search Book by Author Id
- Author API
    - Code is clean (follows general patterns as presented in class)
    - Implementation of Author model
    - Implementation of Author repository and controller for:
        - Create
        - Read by Id
        - Read All
        - Update
        - Delete
    - Test of Author repository and MockMvc test cases for:
        - Create
        - Read by Id
        - Read All
        - Update
        - Delete
- Publisher API
    - Code is clean (follows general patterns as presented in class)
    - Implementation of Publisher model
    - Implementation of Publisher repository and controller for:
        - Create
        - Read by Id
        - Read All
        - Update
        - Delete
    - Test of Publisher repository and MockMvc test cases for:
        - Create
        - Read by Id
        - Read All
        - Update
        - Delete
- GraphQL
    - Implementation of:
        - Find Publisher by Id
        - Including books for the publisher and authors for the books.
        - Find Author by Id
        - Including books by the author.
        - Find Book by Id
        - Including the author and publisher of the book

### Video Submission
- [YouTube Link for Summative Project 2 Walkthough](https://www.youtube.com/watch?v=uWoGKZG06Jg)
    - Created by [Efaz Ahmed](https://www.linkedin.com/in/eahmed2024/) and [Reuben Agogoe](https://www.linkedin.com/in/reubenagogoe/)
    - For more information regarding the video submission, please take a look at description of the YouTube Video.
