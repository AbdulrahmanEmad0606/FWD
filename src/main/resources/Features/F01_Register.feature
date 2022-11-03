@smoke
Feature: F01_Register | users could register with new accounts

  Scenario Outline: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name <name> and last name <lastName>
    And user enter date of birth
    And user enter <Email> field
    And user fills Password fields <password> <confirmPassword>
    And user clicks on register button
    Then success message is displayed
    Examples:
      | name         | lastName | Email              | password   | confirmPassword |
      | "automation" | "tester" | "test@example.com" | "P@ssw0rd" | "P@ssw0rd"      |