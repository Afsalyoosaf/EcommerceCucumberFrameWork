# E-Commerce Test Automation Framework (Cucumber BDD)

A robust, enterprise-grade test automation framework built for BDD (Behavior-Driven Development) using **Java**, **Selenium WebDriver**, **TestNG**, **Maven**, and the **Page Object Model (POM)** design pattern. Tested and verified against the SauceDemo e-commerce application.

---

## 🛠️ Tech Stack & Tools
* **Language:** Java (JDK 17)
* **Automation Tool:** Selenium WebDriver (4.18.1)
* **BDD Framework:** Cucumber (7.15.0)
* **Test Runner & Assertions:** TestNG (7.9.0)
* **Build Management:** Apache Maven
* **Design Pattern:** Page Object Model (POM) with PageFactory
* **IDE & OS:** Eclipse IDE on Windows 11

---

## 📁 Project Architecture

```text
EcommerceCucumberFrameWork/
│
├── src/main/java/
│   ├── base/
│   │   └── BaseClass.java          # WebDriver initialization & teardown control center
│   └── pages/
│       └── LoginPage.java          # Page Object class with @FindBy locators & actions
│
├── src/test/java/
│   ├── runners/
│   │   └── TestRunner.java         # TestNG & Cucumber execution runner engine
│   └── stepDefinitions/
│       └── LoginStep.java          # Glue code mapping Gherkin steps to Selenium actions
│
├── src/test/resources/
│   └── features/
│       └── login.feature           # Gherkin behavior files (Valid & Locked-out scenarios)
│
├── target/
│   └── cucumber-reports/
│       └── cucumber-report.html    # Generated interactive HTML test execution reports
│
└── pom.xml                         # Maven project dependencies configuration
