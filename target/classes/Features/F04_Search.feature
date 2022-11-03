@smoke
Feature: F04_Search | users could search for a specific product by name

  Scenario Outline: user could search using product name
    Given user go to home page2
    When user search with product name <productName>
    And user press on search button
    Then  user get the search results successfully
    Examples:
      | productName |
      | "book"      |
      | "laptop"    |
      | "nike"      |

  Scenario Outline: user could search using product SKU
    Given user go to home page2
    When user search with SKU name <productSKU>
    And user press on search button for second scenario
    Then user can find the SKU of the product
    Examples:
      | productSKU  |
      | "SCI_FAITH" |
      | "APPLE_CAM" |
      | "SF_PRO_11" |

