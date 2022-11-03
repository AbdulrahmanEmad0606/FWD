@smoke
Feature: F05_hoverCategories | users could hover on main category

  Scenario: user could hover on the main category
    Given user go to home page3
    When user hover on the main category
    And click on the sub category
    Then  the page title contains the subcategory name