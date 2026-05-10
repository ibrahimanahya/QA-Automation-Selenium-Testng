# QA Automation Selenium TestNG

This is a QA automation project built with Java, Selenium WebDriver, TestNG, and Maven.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

## Project Structure

- `BaseTest` handles browser setup, teardown, test data, and screenshots.
- `BasePage` contains reusable actions like click, type, and select.
- `SignupPage` contains signup page locators and actions.
- `LoginPage` contains login page locators and actions.
- `MyTest` contains the test scenarios.

## Test Scenarios

- User registration test
- User login test
- Screenshot capture during test execution
- Assertions using TestNG

## Notes

The tested website may sometimes show bot verification because it detects automated browser activity.

## How to Run

Run the tests using:

```bash
mvn tes





## Note

This project was created for QA automation practice and portfolio purposes.

The tested website may sometimes show bot verification or block automated execution, so some tests may not run consistently every time. The main goal of this project is to demonstrate automation structure, Selenium usage, TestNG, Maven, and Page Object Model.t
