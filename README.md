🚀 Blog REST API

A scalable and production-ready Blog REST API built with Spring Boot, featuring JWT-based authentication, role-based access control, pagination, and robust error handling.

---

🌐 Live Demo

Base URL:
https://blog-api-production-1349.up.railway.app

---

🛠️ Tech Stack

- Java 17 + Spring Boot 3.2
- Spring Security + JWT (Authentication & Authorization)
- Spring Data JPA + Hibernate (ORM)
- MySQL (Database)
- Maven (Build Tool)
- Lombok (Boilerplate Reduction)

---

✨ Features

🔐 Authentication & Security

- JWT-based authentication (Register/Login)
- Role-based access control (ADMIN / USER)
- Secure API endpoints using JWT tokens

📝 Blog Functionality

- Full CRUD operations for blog posts
- Nested comments on posts
- Ownership-based authorization (users can modify only their own content)

⚡ Advanced Features

- Pagination and sorting for all endpoints
- Search posts by title (case-insensitive)
- Filter posts by category

🧼 Validation & Error Handling

- Input validation with field-level messages
- Global exception handling
- Clean and structured API responses

---

📁 Project Structure

src/main/java/blogapi/
├── controller/      → REST endpoints
├── service/         → Business logic
├── repository/      → Database queries
├── entity/          → JPA entities
├── dto/             → Request/Response objects
├── security/        → JWT filter & config
└── exception/       → Global error handler

---

🔑 Authentication Endpoints

Method| URL| Description| Auth Required
POST| "/api/auth/register"| Register user| ❌ No
POST| "/api/auth/login"| Login & get token| ❌ No

---

📝 Post Endpoints

Method| URL| Description| Auth Required
GET| "/api/posts"| Get all posts| ❌ No
GET| "/api/posts/{id}"| Get post by ID| ❌ No
GET| "/api/posts/category/{category}"| Filter by category| ❌ No
GET| "/api/posts/search?title="| Search posts| ❌ No
POST| "/api/posts"| Create post| ✅ Yes
PUT| "/api/posts/{id}"| Update post| ✅ Yes
DELETE| "/api/posts/{id}"| Delete post| ✅ Yes

---

💬 Comment Endpoints

Method| URL| Description| Auth Required
GET| "/api/posts/{postId}/comments"| Get comments| ❌ No
POST| "/api/posts/{postId}/comments"| Add comment| ✅ Yes
DELETE| "/api/posts/{postId}/comments/{id}"| Delete comment| ✅ Yes

---

🧪 API Usage

1️⃣ Register

POST /api/auth/register

{
  "name": "test",
  "email": "test@gmail.com",
  "password": "123456"
}

---

2️⃣ Login

POST /api/auth/login

{
  "email": "test@gmail.com",
  "password": "123456"
}

👉 Response:

{
  "token": "your_jwt_token_here"
}

---

3️⃣ Use Token

Add header:

Authorization: Bearer <your_token>

---

🌐 Deployment

Deployed on Railway with:

- MySQL cloud database
- Environment variables for secure config
- Production-ready setup

---

⚙️ Run Locally

Prerequisites

- Java 17+
- MySQL
- Maven

---

Steps

git clone https://github.com/Kista9392/blog-api.git
cd blog-api

CREATE DATABASE blogdb;

spring.datasource.url=jdbc:mysql://localhost:3306/blogdb
spring.datasource.username=root
spring.datasource.password=yourpassword

app.jwt.secret=your_secret_key
app.jwt.expiration=86400000

mvn spring-boot:run

---

👨‍💻 Author

Pullagurla Kista Reddy

- GitHub: https://github.com/Kista9392
- LinkedIn: https://www.linkedin.com/in/kistareddy-pullagurla/

---

⭐ Final Note

This project demonstrates:

- Real-world backend architecture
- Secure authentication with JWT
- Clean layered design
- Production deployment using Railway

👉 Built for interview readiness and real-world backend skills
