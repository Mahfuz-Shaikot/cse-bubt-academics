# Lab Task 02

## Lab Title: Project Team selection & requirements gathering

### 1. Project Title: Firearm Information Repository System (FIRS)

### 2. Team Description:

| Sl. no | Roll            | Name                        | Role                         |
| :----- | :-------------- | :-------------------------- | :--------------------------- |
| 1      | 2024510\*\*\*\* | Al Adid                     | Documention Manager/ Tester  |
| 2      | 2024510\*\*\*\* | Md Fahim Islam              | Frontend Developer           |
| 3      | 2024510\*\*\*\* | Md. Mahfuzul Bashar Shaikot | Backend Developer            |
| 4      | 2024510\*\*\*\* | Md. Sakibur Rahman          | Database Manager             |
| 5      | 2024510\*\*\*\* | Abu Ahmad Mahfuzor Rahman   | Team Leader/ Product Manager |

### 3. Project Scope selection:

#### Problem Statement

Managing firearm-related data manually or using scattered documents causes data inconsistency, loss of records, lack of security, and slow access to information. There is no centralized system to store, track, and retrieve firearm information efficiently.

#### Motivation:

- Improve law enforcement efficiency in tracking firearms.
- Enhance public safety by better regulating firearm distribution.
- Ensure regulatory compliance with firearm laws.
- Improve evidence tracking for legal proceedings.

#### Who will use this software?

- Law enforcement agencies
- Authorized firearm dealers
- Government regulatory bodies
- System administrators

### 4. My Role: Frontend Developer

### Sample Questions (These are just general questions)

- **Company name:** Firearm Information Repository System
- **Date:** 14-01-2026
- **Person completing the questionnaire:** Md. Mahfuzul Bashar Shaikot
- **Department/Division:** B.Sc. Engg. in CSE

#### Questions & Answers

| Questions                                                                                                                                     | Answers                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| :-------------------------------------------------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1. What is the name of the system?                                                                                                            | Firearms Information Repository System (FIRS).                                                                                                                                                                                                                                                                                                                                                                                                                    |
| 2. What geographic scope does the system cover (local, state, national)?                                                                      | National                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| 3. Does the system cover only commercial sales, or also private transfers and imports?                                                        | It covers all legal channels                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| 4. In one word, what is the system's core value: Tracking, Prevention, or Compliance?                                                         | Compliance.                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| 5. What is the system's primary purpose or problem it solves? (e.g., tracks ownership, prevents illegal sales, ensures regulatory compliance) | To trace crime guns and ensure legal compliance.                                                                                                                                                                                                                                                                                                                                                                                                                  |
| 6. Is the biggest cost driver maintenance, modernization, or personnel?                                                                       | Maintenance of the legacy infrastructure and integration layers.                                                                                                                                                                                                                                                                                                                                                                                                  |
| 7. What is the most frequent user complaint about the system?                                                                                 | Slow system response times during peak hours, such as end-of-month reporting periods.                                                                                                                                                                                                                                                                                                                                                                             |
| 8. Who are the system's primary users? (e.g., law enforcement, licensed dealers, regulatory agency staff)                                     | Bangladesh Military & paramilitary forces, Police, Home Ministry officials, and licensed arms dealers.                                                                                                                                                                                                                                                                                                                                                            |
| 9. Where are the main opportunities for improvement in the system?                                                                            | Integrating with the national citizen database for real-time identity verification and developing a mobile interface for field officers.                                                                                                                                                                                                                                                                                                                          |
| 10. Which areas could be made more efficient?                                                                                                 | The manual data entry process for legacy paper records and the time required for inter-departmental approval workflows.                                                                                                                                                                                                                                                                                                                                           |
| 11. What are the major challenges the system currently faces?                                                                                 | Incomplete historical data from paper records and ensuring consistent, reliable connectivity for all police stations nationwide.                                                                                                                                                                                                                                                                                                                                  |
| 12. How reliable is the tracing data for older or second-hand firearms?                                                                       | Low, due to incomplete historical paper records for firearms sold or transferred before the digital system's launch.                                                                                                                                                                                                                                                                                                                                              |
| 13. What are the key components or modules of the system?                                                                                     | Citizen/Dealer Application Portal, Police Admin Dashboard, Central Firearms Database, and Reporting/Analytics Module.                                                                                                                                                                                                                                                                                                                                             |
| 14. What are the system's main functionalities or features?                                                                                   | The system's main features are digital license management, firearm registration to an owner, secure dealer transaction logging, and a searchable portal for police investigations.                                                                                                                                                                                                                                                                                |
| 15. Is the system mandatory for firearm transactions, or is it a voluntary tool?                                                              | The system is mandatory, as firearm transactions must be officially recorded and regulated under the Arms Act, 1878 and Arms Rules, 1924.                                                                                                                                                                                                                                                                                                                         |
| 16. What government regulations or acts does this system directly support?                                                                    | The system directly supports The Arms Act, 1878, which regulates the possession, licensing, transfer, and control of firearms in Bangladesh, and the Arms Rules, 1924, which define the procedures for firearm licensing, registration, and record maintenance under the Act.                                                                                                                                                                                     |
| 17. How is data stored and structured within the system (e.g., databases)?                                                                    | Data is stored in a secure relational database to ensure integrity and easy retrieval. Key tables include firearms, owners, licenses, transactions, and incidents. Each firearm and owner has a unique identifier to track history and transfers. Relationships between tables maintain data consistency and avoid duplication. The structure supports fast querying, reporting, and audit capabilities for authorities.                                          |
| 18. What design methodologies or principles guided the system's creation?                                                                     | The system is built using a modular and layered architecture for maintainability. It follows security-first, scalability, and usability principles. The design allows easy updates and integration with other government systems. Legal compliance with the Arms Act and Arms Rules guided its workflow. The system is optimized for efficient data processing and reporting.                                                                                     |
| 19. How does the system ensure security and data protection?                                                                                  | The system uses role-based access control and user authentication to restrict data access. Data is encrypted at rest and in transit to prevent unauthorized access. All activities are logged through audit trails for accountability. Regular backups and recovery procedures ensure data integrity. Compliance with the Arms Act and Arms Rules guarantees lawful data handling.                                                                                |
| 20. What are the system's primary inputs and outputs?                                                                                         | The system receives firearm details, owner information, license data, transfer records, and incident reports as inputs. It records all firearm-related transactions and changes in ownership. Users can query the database for firearm verification and history. The system generates license verification, transfer approvals, violation alerts, and analytical reports. These outputs support law enforcement, government oversight, and regulatory compliance. |

---

## Table of Contents

- **SRS Document**
- **System Features** | 6
  - Firearm Record Management | 6
  - User Authentication and Role Management | 6
  - Search and Reporting | 6
- **Other Nonfunctional Requirements** | 7
  - Performance Requirements | 7
  - Safety Requirements | 7
  - Security Requirements | 7
  - Software Quality Attributes: | 8
  - Other Requirements: | 8

---

## System Features

### Firearm Record Management

#### Description and Priority:

This feature allows authorized users to manage firearm records, including adding, updating, viewing, and deleting information. **Priority: High.**

- **Benefit:** 9
- **Penalty if missing:** 8
- **Cost:** 7
- **Risk:** 5

#### Functional Requirements:

- **REQ-1:** Allow users to add new firearm details, ensuring all required fields are completed.
- **REQ-2:** Enable users to update existing firearm information when changes occur.
- **REQ-3:** Allow authorized users to delete firearm records, with confirmation prompts.
- **REQ-4:** Validate all inputs and display clear error messages for incorrect entries.
- **REQ-5:** Maintain a complete audit trail of all changes to firearm records.

### User Authentication and Role Management

#### Description and Priority:

This feature ensures only authorized personnel can access the system and enforces role-based permissions. **Priority: High.**

- **Benefit:** 9
- **Penalty if missing:** 9
- **Cost:** 6
- **Risk:** 8

#### Functional Requirements:

- **REQ-6:** Users must log in using a username and password.
- **REQ-7:** Passwords must be encrypted for security.
- **REQ-8:** System access must be restricted based on user roles (Admin, Special, General).
- **REQ-9:** Admins can add, update, or remove user accounts.
- **REQ-10:** Log and monitor unauthorized login attempts.

### Search and Reporting

#### Description and Priority:

This feature enables users to efficiently search firearm records and generate reports. **Priority: Medium.**

- **Benefit:** 7
- **Penalty if missing:** 6
- **Cost:** 5
- **Risk:** 5

#### Functional Requirements:

- **REQ-11:** Allow users to search firearm records using keywords.
- **REQ-12:** Provide filters to narrow search results by category, date, or owner.
- **REQ-13:** Generate printable reports of search results or record summaries.
- **REQ-14:** Display results quickly and accurately with error handling for invalid queries.

---

## Other Nonfunctional Requirements

### Performance Requirements

- The system shall respond to user requests within 2 seconds under normal conditions.
- The system shall support up to 500 concurrent users.
- Firearm record searches shall return results quickly using indexed data.
- The system shall maintain 99% availability with minimal downtime.

### Safety Requirements

- Access to firearm information shall be limited to authorized users only.
- The system shall prevent unauthorized modification or deletion of records.
- Regular data backups shall be performed to prevent data loss.
- All system activities shall be logged for monitoring and accountability.
- The system shall comply with applicable firearm data handling regulations.

### Security Requirements

- Users shall be authenticated using secure login credentials.
- Role-based access control shall restrict system functions based on user roles.
- Sensitive data shall be encrypted during storage and transmission.
- The system shall maintain audit logs of user access and activities.
- Security incidents shall be detected and reported promptly.

### Software Quality Attributes:

- **Reliability:** System uptime $\ge99\%$.
- **Maintainability:** Code organized for easy updates.
- **Portability:** Operable on Windows, Linux & Android.
- **Testability:** Each module can be tested independently.
- **Usability:** Interfaces must be user-friendly and intuitive.

### Other Requirements:

- Database must be well-structured and normalized.
- System must be flexible to support future updates or integration with other government systems.
- Must comply with Bangladesh Arms Act, 1878 and related legal regulations for firearm data protection.
