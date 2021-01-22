@smoke
Feature: User should search the products and the results should be responsive

  Scenario: User should be able to search item on website
    Given the user is on the web-page
    And the user enter email "1sKvT@uR1.vONtD" and password ""
    And User should be logged in
    When User enters "Dress" as a search item
    And User should be able to see results and responsive products
    Then product count should be 7

