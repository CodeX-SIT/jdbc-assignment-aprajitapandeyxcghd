[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/sgE29AmB)
# JDBC Assignment 
## Connecting to MySQL Database and Running Basic Queries

---

### Objective:

This assignment aims to introduce students to JDBC (Java Database Connectivity) and guide them through connecting to a MySQL database and executing queries.

### Instructions:

#### Part 1: Setup

1. Download and install MySQL: Install MySQL on your machine if you haven't already. You can download it [here](https://dev.mysql.com/downloads/).

2. Create a Database: Using MySQL Workbench or any MySQL client, create a new database named `university`.

3. Create a Table: Within the `university` database, create a table named `students` with the following columns:
   - `id` (INT, PRIMARY KEY, AUTO_INCREMENT)
   - `name` (VARCHAR)
   - `age` (INT)

#### Part 2: Java Program

Write a Java program that connects to the MySQL database and performs the following operations:

1. **Connect to the Database:**
   - Use JDBC to establish a connection to the MySQL database.

2. **Insert Data:**
   - Insert at least two records into the `students` table.

3. **Retrieve Data:**
   - Retrieve and print all records from the `students` table.

4. **Update Data:**
   - Update the age of one student.

5. **Delete Data:**
   - Delete one student from the table.

#### Part 3: Submission

Submit the Java source code file along with a screenshot of the table you created using [MySQL Shell](https://www.mysqltutorial.org/mysql-administration/mysql-show-columns/) in the same way you submitted your last assignment.

### Additional Tips:

- Use the JDBC documentation ([Oracle JDBC API](https://docs.oracle.com/en/java/javase/14/docs/api/java.sql/java/sql/package-summary.html)) as a reference guide.
- Ensure you have the MySQL Connector/J library in your project. You can download it [here](https://dev.mysql.com/downloads/connector/j/).
- If you face any issues, you can contact your technical executives and peers in the community!
