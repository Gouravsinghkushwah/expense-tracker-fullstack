# expense-tracker-fullstack
# Expense Tracker Backend

This is the backend portion of the Expense Tracker application developed using **Spring Boot** and **MySQL**. It supports user registration, login, and complete CRUD operations for managing expenses.

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok

---

## Features

- ✅ User Registration
- ✅ User Login (JWT implementation optional/in-progress)
- ✅ CRUD operations for Expenses
- ✅ RESTful APIs

---

## Database Schema

The application uses two primary entities:

### `User` Table:
- `id`: Auto-generated primary key
- `email`: Unique user email
- `password`: User password
- `name`: User name

### `Expense` Table:
- `id`: Auto-generated primary key
- `title`: Title of the expense
- `amount`: Amount spent
- `category`: Expense category
- `date`: Date of expense
- `notes`: Optional notes
- `user_id`: Foreign key referring to the `User` table

---

## Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL Database
- IDE (Spring Tool Suite / IntelliJ / VS Code)

---

## Setup Instructions

1. **Clone the Repository**

   ```bash
   git clone <your-repo-url>
   cd expense-tracker-backend
   API Endpoints

Method	Endpoint	Description
POST	/api/users/register    	Register new user
GET	/api/users/{email}	      Get user by email
GET	/api/expenses           	Get all expenses
POST	/api/expenses	          Add new expense
GET	/api/expenses/{id}      	Get expense by ID
PUT	/api/expenses/{id}      	Update expense by ID
DELETE	/api/expenses/{id}  	Delete expense by ID
