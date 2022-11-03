@smoke
Feature: F06_homeSliders | users could click on the slider

  Scenario: user could click on the Nokia slider
    Given user go to home page4
    When user clicks on the Nokia slider
    Then  the page url must be contains Nokia


  Scenario: user could click on the iphone slider
    Given user go to home page4
    When user clicks on the iphone slider
    Then  the page url must be contains iphone