# Blog REST API

A production-grade Blog REST API built with Spring Boot, featuring JWT authentication, role-based access control, pagination, and comprehensive error handling.

## 🚀 Live Demo
Base URL: `coming soon - deploying on Railway`

## 🛠️ Tech Stack
- **Java 17** + **Spring Boot 3.2**
- **Spring Security** + **JWT** (Authentication & Authorization)
- **Spring Data JPA** + **Hibernate** (ORM)
- **MySQL** (Database)
- **Lombok** (Boilerplate reduction)
- **Maven** (Build tool)

## ✨ Features
- JWT based authentication (Register/Login)
- Role based access control (ADMIN/USER)
- Full CRUD for blog posts
- Nested comments on posts
- Pagination and sorting on all list endpoints
- Search posts by title (case insensitive)
- Filter posts by category
- Global exception handling with clean error responses
- Input validation with field level error messages
- Ownership checks (users can only edit/delete their own content)

## 📁 Project Structure
src/main/java/blogapi/
├── controller/      → REST endpoints
├── service/         → Business logic
├── repository/      → Database queries
├── entity/          → JPA entities (DB tables)
├── dto/             → Request/Response objects
├── security/        → JWT filter, Security config
└── exception/       → Global error handler

## 🔑 Authentication Endpoints
| Method | URL | Description | Auth Required |
|--------|-----|-------------|---------------|
| POST | `/api/auth/register` | Register new user | No |
| POST | `/api/auth/login` | Login and get JWT token | No |

## 📝 Post Endpoints
| Method | URL | Description | Auth Required |
|--------|-----|-------------|---------------|
| GET | `/api/posts` | Get all posts (paginated) | No |
| GET | `/api/posts/{id}` | Get post by ID | No |
| GET | `/api/posts/category/{category}` | Filter by category | No |
| GET | `/api/posts/search?title= ` | Search by title | No |
| POST | `/api/posts` | Create new post | Yes |
| PUT | `/api/posts/{id}` | Update post | Yes (owner only) |
| DELETE | `/api/posts/{id}` | Delete post | Yes (owner only) |

## 💬 Comment Endpoints
| Method | URL | Description | Auth Required |
|--------|-----|-------------|---------------|
| GET | `/api/posts/{postId}/comments` | Get comments for post | No |
| POST | `/api/posts/{postId}/comments` | Add comment | Yes |
| DELETE | `/api/posts/{postId}/comments/{id}` | Delete comment | Yes (owner only) |

## ⚙️ Setup & Run Locally

### Prerequisites
- Java 17+
- MySQL 8+
- Maven

### Steps
1. Clone the repo
   git clone https://github.com/Kista9392/blog-api.git
   cd blog-api

2. Create MySQL database
   CREATE DATABASE blogdb;

3. Create application.properties in src/main/resources/
   spring.datasource.url=jdbc:mysql://localhost:3306/blogdb
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   app.jwt.secret=yoursecretkey12345678901234567890123456789012
   app.jwt.expiration=86400000

4. Run the app
   mvn spring-boot:run

5. API will be available at http://localhost:8080

## 👨‍💻 Author
**Pullagurla Kista Reddy**
- GitHub: [@Kista9392](https://github.com/Kista9392)
- LinkedIn: [kistareddy-pullagurla](https://www.linkedin.com/in/kistareddy-pullagurla/)