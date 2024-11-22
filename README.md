# nawy_task
This project uses Playwright for Java to automate tests for a demo e-commerce site. It tests user registration, product purchase, and order confirmation.

Prerequisites
Java 11+.
Maven.
Playwright for Java: Install Playwright using Maven.

Project Structure
│
├── pom.xml               # Maven configuration file
├── src/
│   ├── main/java/pom/     # Page Object Model (POM) classes
│   └── test/java/tests/   # Test classes
├── testData.json         # Test data file (e.g., usernames, passwords, product details)
└── README.md             # This file

Test Scenarios
RegisterTest: Registers a user by filling user name & password.
LogInTest: Login a user by filling user name & password, then asserts that the Login is successful.
PurchaseTest: login then Adds the Apple Monitor to the cart, proceeds to checkout, enters payment details, and confirms the order.
FullScenario:Register then Login then puschase then logout

To Run Tests : there is XML file for every test scenario.
note: for testing register for second time edit username in testData.json (just add another extra number)
