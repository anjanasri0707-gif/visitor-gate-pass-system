# Visitor Entry & Gate Pass Management System

A Spring Boot REST API for managing visitor registration, gate passes, and entry/exit logging.

## Tech Stack
- **Backend**: Spring Boot 4.x, Java 21
- **Database**: MySQL/JPA
- **Authentication**: Spring Security (JWT coming in Phase 2)
- **Build**: Maven

## Project Overview
This system allows security guards to register visitors, approve/reject gate passes, and log entry/exit times. Admins can view all visitor records and generate reports.

## Features (MVP)
- User login (Guard/Admin roles)
- Visitor registration
- Gate pass approval workflow
- Entry/exit logging
- Visitor search and filtering

## Entity Diagram
See `/docs/diagrams/ER_Diagram.png`

## Architecture Diagram
See `/docs/diagrams/Architecture_Diagram.png`

## How to Run Locally

### Prerequisites
- Java 21
- Maven
- MySQL (or H2 for testing)

### Setup
1. Clone the repository
git clone https://github.com/yourusername/visitor-gate-pass-system.git
cd visitor-gate-pass-system

2. Configure database in 'application.properties'
spring.datasource.url=jdbc:mysql://localhost:3306/gate_pass_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=create-drop

3. Build and run
mvn clean install
mvn spring-boot:run

4. API runs on `http://localhost:8080`

## API Endpoints

### Authentication
- `POST /api/auth/login` — User login (returns user ID and role)
- `GET /api/auth/health` — Health check

### Response Format
```json
{
  "status": "success",
  "userId": 1,
  "role": "ADMIN"
}
```

## Testing
Test endpoints using Postman or cURL:
```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username":"admin","password":"pass123"}'
```

## Next Steps (Phase 2)
- JWT authentication
- Role-based access control
- Visitor CRUD endpoints
- Gate pass approval endpoints
- Entry/exit logging

## Author
Your Name

## License
MIT

## Entity Diagram
See `/docs/diagrams/ER_Diagram.png`

## Architecture Diagram
See `/docs/diagrams/Architecture_Diagram.png`