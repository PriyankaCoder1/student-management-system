# Student Management System

This is a Spring Boot based Student Management System application that allows managing students, courses, and enrollments.

## Features

- Manage Students: Add, update, delete, and view student details.
- Manage Courses: Add, update, delete, and view course details.
- Manage Enrollments: Enroll students in courses, view enrollments.
- Web UI built with Thymeleaf templates.
- REST API endpoints for Students, Courses, and Enrollments.
- Uses H2 in-memory database for development and testing.
- JPA/Hibernate for ORM and data persistence.

## Technologies Used

- Java 17
- Spring Boot 3.5.3
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven

## Running the Application

1. Clone the repository.
2. Build and run the application using Maven Wrapper:

   ```bash
   ./mvnw spring-boot:run   # On Unix/Linux/Mac
   mvnw.cmd spring-boot:run # On Windows
   ```

3. Access the web UI at: `http://localhost:8080`
4. Access the H2 console at: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:studentdb`)

## API Endpoints

- `/api/students` - Manage students
- `/api/courses` - Manage courses
- `/api/enrollments` - Manage enrollments

## Notes

- The application uses an in-memory H2 database, so data will be lost on application shutdown.
- Enrollment IDs are auto-generated to avoid primary key conflicts.
- The project includes Thymeleaf templates for UI pages like student list, course list, and enrollments.

## Contribution

- Create a new branch for your changes.
- Commit and push your changes.
- Open a pull request for review.

## Contact

For any issues or questions, please open an issue on the GitHub repository.

---
