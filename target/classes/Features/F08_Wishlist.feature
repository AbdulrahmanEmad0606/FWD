@smokel
Feature: D08_WishlistStepDef | users could add any product to the wishlist

  Scenario: user could add any product to the wishlist
    Given user go to home page6
    When user navigated to the product
    And user add the item to the wishlist
    Then  the product added to the wishlist successfully
  Scenario: user could show his wish list
    Given user go to home page6
    When user navigated to the product
    And user add the item to the wishlist
    And user close the success message
    And user clicks on the Wishlist button
    Then  the Qty must be greater than zero
