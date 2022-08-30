# Hudl_Login
Post first round assessment 

Task

1. Setup an automation environment on your local machine using selenium
2. Automate any cases that you would think are good to test the functionality of validating logging into hudl.com with your credentials.
3. Push your tests to a Github repository (a public repo is fine) and share the link (please do not include any passwords in public repos).

Explanation of framework

1. Java as a programming language
2. Maven as a project build tool
3. Selenium as a UI script automation tool
4. Junit for its assertions
5. WebDriverManager/HtmlUnitDriver to set the browser for the UI automation scripts
6. Cucumber as the BDD framework helper with Gherkin feature files
7. I use a page object model design pattern and maintain a separate class for each webpage. Each page class stores the members, locators, and associated methods for each webpage. This helps with refactoring.
8. I have a base class for the common functions, hooks class, and a very useful utility class for the repetitive methods which helps me achieve better usability.
9. The runner class is used to run steps classes, run execute test suites, save reports, and more.
