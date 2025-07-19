# 🚀 Spring Boot CRUD API - User Management

This is a basic Spring Boot REST API project for managing users. It demonstrates CRUD operations using:
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`
- `@RequestBody`, `@PathVariable`
- Simple validation using `@NotBlank`, `@Email`, `@Valid`
- Tested using Postman

---

## 📁 Project Structure

src
└── main
├── java
│ └── com.example.demo_68
│ ├── controller
│ │ └── UserController.java
│ └── model
│ └── UserDto.java
└── resources
└── application.properties

yaml
Copy
Edit

---

## 🔧 API Endpoints

| Method | Endpoint       | Description            |
|--------|----------------|------------------------|
| GET    | `/users/{id}`  | Get a user by ID       |
| POST   | `/users`       | Create a new user      |
| PUT    | `/users/{id}`  | Update user by ID      |
| DELETE | `/users/{id}`  | Delete user by ID      |

---

## 🧪 Sample POST Request Body

```json
{
  "name": "Sayan",
  "email": "sayan@example.com"
}
