# 🔐 Secure ToDo API

A production-style REST API built with **Spring Boot**, **Spring Security**, **OAuth2/OpenID Connect**, and **Keycloak** for secure user authentication and authorization.

---

## 📖 Overview

This project is more than a simple CRUD application. Instead of implementing custom JWT authentication, it integrates **Keycloak** as an Identity Provider (IdP) using the **OAuth2 Authorization Code Flow** with **OpenID Connect (OIDC)**.

The application acts as an OAuth2 Resource Server, validating JWT access tokens before allowing users to access protected resources.

---

## ✨ Features

- OAuth2 & OpenID Connect Authentication
- Keycloak Integration
- JWT Bearer Token Authentication
- Secure CRUD Operations for ToDos
- User Authorization (Users can manage only their own tasks)
- Pagination & Filtering
- Request Validation
- Global Exception Handling
- Spring Data Auditing
- Stateless REST API

---

## 🛠 Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Keycloak
- OAuth2 / OpenID Connect
- Maven
- MySQL/PostgreSQL

---

## 🏗 Architecture

```
Client
   │
   ▼
Keycloak (Authentication)
   │
Access Token (JWT)
   │
   ▼
Spring Boot API
   │
Spring Security Filter Chain
   │
Authentication & Authorization
   │
   ▼
Database
```

---

## 🔑 Authentication Flow

1. User logs in through **Keycloak**.
2. Keycloak authenticates the user.
3. An **Access Token (JWT)** is issued.
4. The client sends the token in the `Authorization` header.
5. Spring Security validates the token before allowing access to protected endpoints.

---

## 📌 REST Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/register` | Register User |
| POST | `/login` | Authenticate User |
| GET | `/todos` | Get Todos |
| POST | `/todos` | Create Todo |
| PUT | `/todos/{id}` | Update Todo |
| DELETE | `/todos/{id}` | Delete Todo |

---

## 🔒 Security

This project helped me understand and implement:

- OAuth2 Authorization Code Flow
- OpenID Connect (OIDC)
- Spring Security Filter Chain
- JWT Authentication
- Keycloak Realms & Clients
- Client IDs & Client Secrets
- URL Authorization using `requestMatchers()`
- Stateless Authentication
- Resource Ownership Authorization

---

## 📝 Auditing

Implemented **Spring Data Auditing** to automatically maintain:

- Created Date
- Last Modified Date

---

## 📚 Learning Notes

I documented my learning in **AuthNotes.txt**, covering:

- OAuth2 Fundamentals
- OpenID Connect
- Authorization Code Flow
- OAuth2 Grant Types
- Access & Refresh Tokens
- JWT
- Keycloak
- Spring Security Architecture

---

## 🚀 Future Improvements

- Refresh Token Support
- Role-Based Access Control (RBAC)
- Swagger/OpenAPI Documentation
- Unit & Integration Testing
- Docker Compose
- Kubernetes Deployment

---

## ⭐ Conclusion

This project was built to understand **how production applications secure REST APIs** rather than simply implementing CRUD operations. It provided hands-on experience with **OAuth2, OpenID Connect, Keycloak, Spring Security, JWT authentication, and secure backend development.**

# 🔐 Secure ToDo API

A production-style REST API built with **Spring Boot**, **Spring Security**, **OAuth2/OpenID Connect**, and **Keycloak** for secure user authentication and authorization.

---

## 📖 Overview

This project is more than a simple CRUD application. Instead of implementing custom JWT authentication, it integrates **Keycloak** as an Identity Provider (IdP) using the **OAuth2 Authorization Code Flow** with **OpenID Connect (OIDC)**.

The application acts as an OAuth2 Resource Server, validating JWT access tokens before allowing users to access protected resources.

---

## ✨ Features

- OAuth2 & OpenID Connect Authentication
- Keycloak Integration
- JWT Bearer Token Authentication
- Secure CRUD Operations for ToDos
- User Authorization (Users can manage only their own tasks)
- Pagination & Filtering
- Request Validation
- Global Exception Handling
- Spring Data Auditing
- Stateless REST API

---

## 🛠 Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Keycloak
- OAuth2 / OpenID Connect
- Maven
- MySQL/PostgreSQL

---

## 🏗 Architecture

```
Client
   │
   ▼
Keycloak (Authentication)
   │
Access Token (JWT)
   │
   ▼
Spring Boot API
   │
Spring Security Filter Chain
   │
Authentication & Authorization
   │
   ▼
Database
```

---

## 🔑 Authentication Flow

1. User logs in through **Keycloak**.
2. Keycloak authenticates the user.
3. An **Access Token (JWT)** is issued.
4. The client sends the token in the `Authorization` header.
5. Spring Security validates the token before allowing access to protected endpoints.

---

## 📌 REST Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/register` | Register User |
| POST | `/login` | Authenticate User |
| GET | `/todos` | Get Todos |
| POST | `/todos` | Create Todo |
| PUT | `/todos/{id}` | Update Todo |
| DELETE | `/todos/{id}` | Delete Todo |

---

## 🔒 Security

This project helped me understand and implement:

- OAuth2 Authorization Code Flow
- OpenID Connect (OIDC)
- Spring Security Filter Chain
- JWT Authentication
- Keycloak Realms & Clients
- Client IDs & Client Secrets
- URL Authorization using `requestMatchers()`
- Stateless Authentication
- Resource Ownership Authorization

---

## 📝 Auditing

Implemented **Spring Data Auditing** to automatically maintain:

- Created Date
- Last Modified Date

---

## 📚 Learning Notes

I documented my learning in **AuthNotes.txt**, covering:

- OAuth2 Fundamentals
- OpenID Connect
- Authorization Code Flow
- OAuth2 Grant Types
- Access & Refresh Tokens
- JWT
- Keycloak
- Spring Security Architecture

---

## 🚀 Future Improvements

- Refresh Token Support
- Role-Based Access Control (RBAC)
- Swagger/OpenAPI Documentation
- Unit & Integration Testing
- Docker Compose
- Kubernetes Deployment

---

## ⭐ Conclusion

This project was built to understand **how production applications secure REST APIs** rather than simply implementing CRUD operations. It provided hands-on experience with **OAuth2, OpenID Connect, Keycloak, Spring Security, JWT authentication, and secure backend development.**
Below image is just for my reference, I have already deleted this client😉
<img width="559" height="314" alt="image" src="https://github.com/user-attachments/assets/845b8580-5fef-4eaf-8040-40babb7773a0" />


https://roadmap.sh/projects/todo-list-api
