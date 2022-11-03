@smoke
Feature: F07_followUs | users could follow us by social links

  Scenario: user could follow us by facebook
    Given user go to home page5
    When user navigated to the facebook link
    Then  the user must be redirected to the facebook page

  Scenario: user could follow us by twitter
    Given user go to home page5
    When user navigated to the twitter link
    Then  the user must be redirected to the twitter page

  Scenario: user could follow us by rss
    Given user go to home page5
    When user navigated to the rss link
    Then  the user must be redirected to the rss page

  Scenario: user could follow us by youtube
    Given user go to home page5
    When user navigated to the youtube link
    Then  the user must be redirected to the youtube page
