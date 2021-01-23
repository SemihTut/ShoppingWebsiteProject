@smoke @TC3
Feature: Checkout process

  Scenario: User should be able to buy a product
    Given User is on the web-page
    And User enters email "Yt@hcFRy-.pfa" and password ""
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
