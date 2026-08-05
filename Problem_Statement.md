# Problem Statement

## 1. Title
Visitor Entry & Gate Pass Management System

## 2. Domain
Security / Facility Management

## 3. Who is the user? (2-3 user types, with roles)
- **Admin** — manages hosts, views all visitor records and reports, approves/rejects gate passes
- **Guard** — registers visitors at the gate, checks visitors in and out, views today's approved passes

## 4. What problem are we solving?
Most small offices, apartment complexes, and colleges still track visitor entry using a paper register at the security desk. This makes it slow to check in visitors, impossible to search past records, and easy to lose track of who is currently on the premises. There is no way to quickly verify whether a visitor is authorized, and generating reports (e.g. "who visited Host X last week") means manually flipping through pages. A digital gate pass system solves this by making registration, approval, and entry/exit tracking fast, searchable, and secure.

## 5. Proposed Solution (what the application will do, feature-wise)
- Visitors are registered with their details and the host they are visiting
- A gate pass is generated and can be approved or rejected by an Admin
- Guards check visitors in and out at the gate, with timestamps logged automatically
- A live dashboard shows everyone currently inside the premises
- Search and filter visit history by visitor, host, or date range
- Role-based login so Guards and Admins see different screens and permissions

## 6. Core Entities / Database Tables (list all, minimum 5)
1. Visitor (id, name, phone, purpose, idProofNumber)
2. Host (id, name, department, contactNumber)
3. GatePass (id, visitorId, hostId, status, validFrom, validTo)
4. EntryLog (id, gatePassId, checkInTime, checkOutTime)
5. User (id, username, passwordHash, role)

## 7. User Roles & Permissions (minimum 2 distinct roles)
- **Admin**: full access — manage hosts, view all logs and reports, approve/reject gate passes, manage guard accounts
- **Guard**: register visitors, check visitors in/out, view today's approved passes only (no access to historical reports or host management)

## 8. Success Criteria
- A guard should be able to register a new visitor and check them in within 1 minute
- An admin should be able to see the full list of currently-inside visitors instantly, with no manual searching
- Zero duplicate or lost visitor records after a server restart

## 9. Out of Scope
- Payment processing (not applicable to this domain)
- Facial recognition or biometric verification (kept as a possible future enhancement, not core scope)
- Mobile native app — web-based frontend only for this project

## 10. Chosen Track
Java (Spring Boot)