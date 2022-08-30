Feature: Automate Login Page

  Background:
    Given user navigates to "https://www.hudl.com/login"
    Then user should see the title "Log In"

  @Smoke
  Scenario: Validate Valid Login Attempt
    And under "Email" user types "kayceedegraaf@outlook.com" in input box
    And under "Password" user types "KayceeHudl1!" in input box
    Then user selects remember me checkbox
    When user clicks on "Log In" button
    Then user navigates to "https://www.hudl.com/home"


  @Smoke
  Scenario Outline: Validate Invalid Login Attempt
    And under <input> user types <field> in input box
    And under <input1> user types <field1> in input box
    When user clicks on <buttonName> button
   Then user should see the title <currentPage>
    Examples:
          | input   | field     | input1     | field1  | buttonName | currentPage |
      | "Email" | "kayceeD" | "Password" | "12345" | "Log In"   | "Log In"    |
      | "Email" | "user123@gmail.com"| "Password" | "User123!" | "Log In" | "Log In"|


  @Regression
  Scenario: Validate Invalid Organization Login Attempt
        When user clicks on "Log In with an Organization" button
        And under "Organization Email" user types "user123@gmail.com" in input box
        When user clicks on "Login In in Organization Page" button
        Then user should see the title "Log In"
        Then user should see alert "This account can't log in with an organization yet. Please log in using your email and password." message


  @Regression
  Scenario: Validate Sign Up Link
      When user clicks on "Sign up" button
      When user clicks on "High Schools, Clubs & Colleges" button
      Then user should see the title "Register"













      






