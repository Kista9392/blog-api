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
- Secure API endpoints with token validation

📝 Blog Functionality

- Full CRUD operations for blog posts
- Nested comments system
- Ownership-based authorization (users can modify only their own content)

⚡ Advanced Features

- Pagination and sorting for all list endpoints
- Search posts by title (case-insensitive)
- Filter posts by category

🧼 Validation & Error Handling

- Input validation using annotations
- Global exception handling with structured error responses
- Clean and consistent API response format

---

📁 Project Structure

src/main/java/blogapi/
├── controller/      → REST endpoints
├── service/         → Business logic
├── repository/      → Database queries
├── entity/          → JPA entities (DB tables)
├── dto/             → Request/Response objects
├── security/        → JWT filter & security configuration
└── exception/       → Global exception handling

---

🔑 Authentication Endpoints

Method| URL| Description| Auth Required
POST| "/api/auth/register"| Register new user| ❌ No
POST| "/api/auth/login"| Login & get JWT token| ❌ No

---

📝 Post Endpoints

Method| URL| Description| Auth Required
GET| "/api/posts"| Get all posts (paginated)| ❌ No
GET| "/api/posts/{id}"| Get post by ID| ❌ No
GET| "/api/posts/category/{category}"| Filter by category| ❌ No
GET| "/api/posts/search?title="| Search posts by title| ❌ No
POST| "/api/posts"| Create new post| ✅ Yes
PUT| "/api/posts/{id}"| Update post| ✅ Yes (Owner only)
DELETE| "/api/posts/{id}"| Delete post| ✅ Yes (Owner only)

---

💬 Comment Endpoints

Method| URL| Description| Auth Required
GET| "/api/posts/{postId}/comments"| Get comments| ❌ No
POST| "/api/posts/{postId}/comments"| Add comment| ✅ Yes
DELETE| "/api/posts/{postId}/comments/{id}"| Delete comment| ✅ Yes (Owner only)

---

🧪 API Usage (Quick Start)

1️⃣ Register User

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
  "token": "eyJhbGciOiJIUzI1NiIs..."
}

---

3️⃣ Use Token for Protected APIs

Add header:

Authorization: Bearer <your_token>

---

🌐 Deployment

The application is deployed on Railway with:

- Cloud-based MySQL database
- Environment variable configuration for security
- Production-ready setup with externalized configs

---

⚙️ Setup & Run Locally

Prerequisites

- Java 17+
- MySQL 8+
- Maven

---

Steps

1. Clone the repository:

git clone https://github.com/Kista9392/blog-api.git
cd blog-api

2. Create database:

CREATE DATABASE blogdb;

3. Configure "application.properties":

spring.datasource.url=jdbc:mysql://localhost:3306/blogdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

app.jwt.secret=your_secret_key
app.jwt.expiration=86400000

4. Run the application:

mvn spring-boot:run

5. Access API:

http://localhost:8080

---

👨‍💻 Author

Pullagurla Kista Reddy

- GitHub: https://github.com/Kista9392
- LinkedIn: https://www.linkedin.com/in/kistareddy-pullagurla/

---

⭐ Final Note

This project demonstrates:

- Real-world backend architecture
- Secure authentication using JWT
- Clean code practices with layered architecture
- Production deployment with cloud database integration

---

👉 Built with focus on interview readiness and real-world backend development
