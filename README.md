﻿# Project Management System - Acceptance Tests
 
***Contributors***

- **Ofir Roditi**
- **Itamar Shapira**

---
## Overview
This project implements **Acceptance Tests** for a Project Management System using the **Bridge Pattern** with the **Known Interface approach**, as taught in the course. The focus is on creating robust and modular tests that remain decoupled from the real system's implementation.

## Methodology
### Why the Bridge Pattern (Known Interface)?
1. **Flexibility**: By using an interface (`ProjectManagementSystem`), the tests can interact with either a **stub implementation** (`StubProjectManagement`) for testing or a future **real implementation** without changing the tests.
2. **Separation of Concerns**: This design ensures that test logic is isolated from business logic, making the system more maintainable and scalable.
3. **Best Practice**: The Bridge Pattern aligns with modern software engineering principles, promoting modularity and reusability.

### Components
- **Interface**: `ProjectManagementSystem`
    - Defines all necessary methods, such as `addProject`, `trackProjectStatus`, `registerForProject`, and `confirmRegistration`.
- **Stub Implementation**: `StubProjectManagement`
    - Simulates the behavior of the real system, allowing acceptance tests to validate functionality without relying on the actual implementation.
- **Real Implementation**: A placeholder for the actual system that will be integrated in the future.

## Tests Implemented
Four acceptance tests were developed based on user stories:
1. **Add a Project**:
    - Validates successful addition of a project with complete and valid details.
    - Handles failure cases for missing or invalid data.
2. **Track Project Status**:
    - Validates successful tracking of a project with a valid project code.
    - Handles failure cases for invalid or non-existent project codes.
3. **Register for a Project**:
    - Validates successful registration with all required details.
    - Handles failure cases for missing or invalid data.
4. **Confirm Registration**:
    - Validates successful confirmation with a valid project code.
    - Handles failure cases when constraints are violated.

## Key Features
- **Stub Implementation**: The tests use `StubProjectManagement` to simulate system behavior.
- **JUnit 4**: Tests are written using the JUnit 4 framework for simplicity and compatibility.
- **Bridge Design**: The `ProjectManagementSystem` interface serves as a bridge between tests and implementations.

## How to Run the Tests
1. **Ensure Dependencies**:
    - JUnit 4 must be available in the project.
    - `StubProjectManagement` is the active implementation.
2. **Run Tests**:
    - Execute tests via IntelliJ IDEA or using the terminal:
      ```bash
      ./gradlew test
      ```
    - Or directly run JUnit tests in IntelliJ.

## How to Link Tests with Real Implementation
To integrate the real implementation:
1. Replace `StubProjectManagement` with `RealProjectManagement` in the test setup.
2. Ensure that `RealProjectManagement` fully implements the `ProjectManagementSystem` interface.
3. Re-run the tests to validate the real system.

> **Note**: Tests are designed to remain reusable and do not require recompilation as they rely on the bridge interface.

## Contributions
This project demonstrates a clean and modular design approach using the Bridge Pattern to implement and validate acceptance tests efficiently.

