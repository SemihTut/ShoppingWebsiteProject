@smoke @TC2
Feature: User should search the products and the results should be responsive

  Scenario: User should be able to search item on website
    Given User is on the web-page
    And User enters email "Yt@hcFRy-.pfa" and password ""
    And User should be logged in
    When User enters "Dress" as a search item
    And User should be able to see results and responsive products
    Then product count should be 7

