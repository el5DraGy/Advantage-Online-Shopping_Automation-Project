# 🛍️ Advantage Online Shopping - Automation Project

## 📜 Overview

This project contains an automated test suite for the [Advantage Online Shopping](https://advantageonlineshopping.com/) website. It is designed to simulate user actions and verify the functionality of the e-commerce platform, from browsing products to completing a purchase.

## ✨ Features

*   **End-to-End Testing:** Covers the full user journey, including registration, login, product search, adding items to the cart, and checkout.
*   **Page Object Model (POM):** Organizes the code for better maintenance and readability.
*   **Data-Driven:** Uses external data sources for test inputs.
*   **Detailed Reporting:** Generates comprehensive Allure test reports with screenshots.

## 💻 Technologies Used

*   **Java:** Core programming language.
*   **Selenium WebDriver:** For browser automation.
*   **TestNG:** As the testing framework.
*   **Maven:** For project and dependency management.
*   **Allure:** For generating detailed test reports.
*   **Log4j:** For logging.
*   **JavaFaker:** For generating test data.

## 🛠️ Prerequisites

*   **Java Development Kit (JDK):** Version 21 or higher.
*   **Apache Maven:** To build the project and run tests.
*   **Allure Commandline:** To generate the test reports.

## 🚀 How to Run Tests

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/el5DraGy/Advantage-Online-Shopping_Automation-Project.git
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd Advantage-Online-Shopping_Automation-Project
    ```
3.  **Run the tests using Maven:**
    You can run specific test suites using Maven profiles defined in the `pom.xml`.

    *   **To run the full regression suite:**
        ```bash
        mvn clean test -PregressionProfile
        ```
    *   **To run the End-to-End scenario:**
        ```bash
        mvn clean test -PEnd2EndScenarioProfile
        ```
    *   **To run the Home page tests:**
        ```bash
        mvn clean test -PHomeProfile
        ```

## 📊 Reporting

After running the tests, you can generate an Allure report.

1.  **Generate the report:**
    ```bash
    allure serve
    ```
2.  This will generate the report and open it in your default web browser.
