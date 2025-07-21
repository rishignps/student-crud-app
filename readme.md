# 🎓 Student CRUD App

A fully functional **Student Management System** built with **Spring Boot**, featuring full **CRUD operations**, elegant **Bootstrap 5 frontend**, and optional **Spring Security login**.

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2-success)
![PostgreSQL](https://img.shields.io/badge/H2/PSQL-Supported-brightgreen)
![License](https://img.shields.io/badge/License-MIT-lightgrey.svg)

---

## ✨ Features

- Add, update, delete students
- View all students in a responsive Bootstrap table
- Search by name, email, or ID (live filter)
- Secure login with Spring Security (optional)
- REST API endpoints (`GET`, `POST`, `PUT`, `DELETE`)
- Toast notifications on all actions
- H2 in-memory DB (easy to switch to PostgreSQL or MySQL)

---

## 🖼️ Preview

> Add screenshots here later (optional)

---

## ⚙️ Tech Stack

| Layer            | Technology                  |
|------------------|-----------------------------|
| Backend          | Java 17, Spring Boot        |
| Database         | H2 (or switch to PostgreSQL)|
| ORM              | Spring Data JPA, Hibernate  |
| Frontend         | HTML5, CSS, Bootstrap 5     |
| Tools            | IntelliJ IDEA, Postman, Git |

---

## 🧪 REST API Endpoints

| Method | Endpoint             | Description             |
|--------|----------------------|-------------------------|
| GET    | `/students`          | List all students       |
| GET    | `/students/{id}`     | Get a student by ID     |
| POST   | `/students`          | Add new student         |
| PUT    | `/students/{id}`     | Update student info     |
| DELETE | `/students/{id}`     | Delete a student        |

---

## 🔐 Login (Spring Security Enabled)

> Login is required to access the app.

**Default Credentials:**

```text
Username: admin
Password: 1234
