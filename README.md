# Task Manager Application

A task management app built with **Spring Boot**, using **REST APIs** for CRUD operations to manage tasks efficiently.

## Features
- **Create tasks**: Allows users to add new tasks.
- **Read tasks**: Retrieve all tasks or get a task by its ID.
- **Update tasks**: Edit existing tasks.
- **Delete tasks**: Remove tasks from the list.

## Technologies Used
- **Spring Boot**: To build the backend application.
- **Spring Data JPA**: For interacting with the database.
- **H2 Database**: An in-memory database for development purposes.
- **Maven**: For dependency management.

## Setup & Installation

### 1. Clone the repository
```bash
git clone https://github.com/yourusername/task-manager-application.git
cd task-manager-application
```

### 2. Install dependencies
```bash
mvn clean install
```

### 3. Run the application
```bash
mvn spring-boot:run
```

By default, the application will start on port 8080.

### 4. Access the API

- GET /api/tasks - Get all tasks
- GET /api/tasks/{id} - Get a task by ID
- POST /api/tasks - Create a new task
- PUT /api/tasks/{id} - Update a task by ID
- DELETE /api/tasks/{id} - Delete a task by ID

## Setup & Installation
This project is licensed under the MIT License - see the LICENSE file for details.

