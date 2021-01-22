@smoke
Feature: Checkout process

  Scenario: User should be able to make a shopping
    Given the user is on the web-page
    And the user enter email "1sKvT@uR1.vONtD" and password ""
    And User should be logged in
    When User enters "Dress" as a search item
    And User select one of the item from the list
    And User adds the item to the shopping cart
    And User proceeds to checkout
    And User proceeds to checkout from Summary
    And User proceeds to checkout from Address
    And User proceeds to checkout from Shipping
    And User selects the payment type as "Pay by bank wire"
    Then User confirms the order