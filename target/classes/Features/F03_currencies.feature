@smoke
Feature: F03_Currencies | user could change the currency of the products
  Scenario: user could change the currency of the products
    Given user go to home page
    When user select currency type
    Then  products price in selected currency
