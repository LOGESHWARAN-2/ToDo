A basic To-Do web application built using Spring Boot, MySQL, and Thymeleaf. This application allows to add, toggle (mark as completed), and delete tasks with real-time reflection on both the frontend and the database.

Features

    • Add new tasks to the To-Do list.
    • Toggle task status (mark as completed or uncompleted).
    • Delete tasks from the list.
    • Real-time task display using Thymeleaf.
    • All task data is stored and updated in a MySQL database.

Tech Stack

    • Backend: Java, Spring Boot
    • Frontend: HTML, CSS BootStrap, Thymeleaf
    • Database: MySQL
    • Tools Used: Spring Initializr, Spring Boot DevTools, Maven

Task Structure in Database

    • ID: Auto-incremented unique identifier.
    • Task Detail: String containing task description.
    • Status: Integer field
        • 0 → Task added but not completed.
        • 1 → Task marked as completed (strikethrough in UI).

User Interface

    • Add Task: Input field with submit button.
    • Toggle Task: Clicking a task toggles its completion status.
    • Delete Task: Button to permanently remove the task.
