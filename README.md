# 🧡 OrangeHRM Workforce Automation
### Quality Assurance | Selenium WebDriver · Java · TestNG · Maven

<p align="center">
  <strong>Every employee workflow deserves to work flawlessly.</strong>
  <br/>
  Automating critical HR management journeys with a maintainable, page-oriented test framework.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-Automation-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge&logo=selenium&logoColor=white" alt="Selenium"/>
  <img src="https://img.shields.io/badge/TestNG-Test_Framework-red?style=for-the-badge" alt="TestNG"/>
  <img src="https://img.shields.io/badge/Maven-Build_Tool-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven"/>
</p>

---

## 🧭 The Mission

Human Resource Management Systems support essential business operations, from maintaining employee records to managing leave requests. When these workflows fail, the consequences extend beyond the user interface.

This project focuses on automating selected workflows in **[OrangeHRM](https://opensource-demo.orangehrmlive.com/)** using Selenium WebDriver and Java.

The objective is to validate application navigation, employee management functionality, and access to leave-management workflows while keeping test code readable, reusable, and maintainable.

> **The testing philosophy:** Don't just automate the click. Verify the outcome that matters.

## 🎯 Project Scope

### 👥 Module 01 — PIM (Personnel Information Management)

Focus: Employee record management.

| Scenario | Objective |
|---|---|
| Employee creation | Enter employee details and submit the form |
| Profile verification | Verify that the employee profile opens after saving |
| Employee identification | Establish a basis for searching and validating saved records |

**Key validation:** Verify the application response after submitting an employee record rather than treating a successful click as proof of success.

### 🗓️ Module 02 — Leave Management

Focus: Navigation and access to leave-related workflows.

| Scenario | Objective |
|---|---|
| Leave module navigation | Verify access to the Leave section |
| Apply Leave navigation | Verify that the Apply Leave page opens |
| Leave workflow readiness | Identify the available form fields and validation requirements for future test coverage |

**Current scope:** Navigation into Apply Leave is covered. Actual leave submission, approval, cancellation, and leave-balance validation are potential extensions and should only be marked complete after their tests have been implemented and executed successfully.

---

## 🏗️ Framework Architecture

The framework uses the **Page Object Model (POM)** to separate user-interface interactions from test scenarios.

```text
OrangeHRM-Workforce-Automation/
│
├── src/
│   └── test/
│       └── java/
│           ├── Base/
│           │   └── BaseTest.java
│           │
│           ├── Page/
│           │   ├── Login_Page.java
│           │   ├── PIM_Page.java
│           │   └── Leave_Page.java
│           │
│           └── tests/
│               ├── Login_tests.java
│               ├── PIM_tests.java
│               └── Leave_tests.java
│
├── pom.xml
├── README.md
└── .gitignore
```

*This structure reflects the intended organization; ensure it matches the actual files in the repository before publishing.*

### Why Page Object Model?

- **Separation of concerns:** Page interactions are kept separate from test assertions.
- **Reusability:** Common page actions can be reused across scenarios.
- **Maintainability:** Locator changes can be handled in page classes.
- **Readability:** Test methods describe business workflows instead of repeating low-level Selenium operations.

## 🧰 Technology Stack

| Technology | Role |
|---|---|
| Java | Test scripting and object-oriented design |
| Selenium WebDriver | Browser-based UI automation |
| TestNG | Test organization and assertions |
| Maven | Dependency and build management |
| Chrome | Browser under test |
| Git & GitHub | Version control and project hosting |

## 🔍 Testing Approach

The project follows a practical, workflow-driven testing approach:

1. **Initialize** — Launch the browser and open OrangeHRM.
2. **Authenticate** — Log in using the demo account.
3. **Navigate** — Access the required HR module.
4. **Execute** — Perform the target interaction or workflow.
5. **Validate** — Check URLs, visible pages, and expected application responses.
6. **Clean up** — Close the browser after each test.

TestNG assertions are used to validate expected behavior. The browser setup and teardown are handled by a reusable base test class.

## ⚙️ Getting Started

### Prerequisites

- Java JDK installed and configured
- Maven or Maven support in your IDE
- Google Chrome installed
- Eclipse or IntelliJ IDEA
- Internet access to the OrangeHRM demo environment

### Run Locally

**1. Clone the repository**

```bash
git clone https://github.com/YOUR-USERNAME/OrangeHRM-Workforce-Automation.git
```

Replace `YOUR-USERNAME` with your GitHub username.

**2. Import the project**

Import the project into your IDE as an existing Maven project.

**3. Resolve dependencies and compile tests**

```bash
mvn clean test-compile
```

**4. Execute the tests**

Run the required TestNG classes from your IDE. Maven test execution can also be configured through `pom.xml` and a TestNG suite.

**5. Review the results**

Inspect the TestNG results and console output to identify passed tests and failures.

## 📈 Quality Goals

The framework is designed to support these quality goals:

- Reliable browser initialization and teardown
- Clear separation between test logic and page interactions
- Meaningful assertions rather than click-only automation
- Readable, reusable test methods
- A foundation for expanding positive, negative, and boundary-value scenarios

## 🚀 Future Enhancements

The framework can be extended with:

- Explicit waits for dynamic UI elements
- Employee search and saved-record verification
- Employee detail editing and field-validation tests
- Leave application and validation scenarios
- Approval and cancellation tests where permissions allow
- Screenshots on test failure
- Data-driven testing and configurable test data
- Automated execution through a CI/CD pipeline
- Detailed HTML test reports

## 🧠 Skills Demonstrated

- Selenium WebDriver automation
- Java and object-oriented programming
- TestNG test development and assertions
- Page Object Model
- Functional UI testing
- HR workflow validation
- Maven project organization
- GitHub-based project documentation

## ⚠️ Test Environment & Disclaimer

This project uses the publicly available OrangeHRM demonstration environment for educational purposes.

The demo is shared and may change between executions. Test data, account permissions, and available leave balances may affect results. Employee creation and other state-changing operations should be performed cautiously.

No production employee data should be used.

---

<p align="center">
  <strong>Reliable workflows. Meaningful assertions. Better software quality. 🧡</strong>
  <br/>
  <sub>Built as part of a hands-on QA automation learning project.</sub>
</p>
