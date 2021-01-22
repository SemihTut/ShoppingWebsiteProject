Feature: Users should be able to create a new account

  Background:
    Given the user is on the web-page

  @registeredUser
  Scenario: Login as a registered user
    When the user enter email "1sKvT@uR1.vONtD" and password ""
    Then the user should be able to sigIn

  @TC1 @newAccount
  Scenario Outline: User should create a new account and login with credentials
    When the user enter emailAddress "1"
    And Click the create an account button
    And User should be on Account Creation Page
    And User enters the "<firstname>", "<lastName>","<address>","<cityName>","<stateName>","<postalCode>","<countryName>","<mobile>","<aliassAddress>"
    Then User should be logged in

    Examples:
      | firstname | lastName | address  | cityName  | stateName  | postalCode | countryName | mobile      | aliassAddress  |
      | Hans      | Peters   | address  | cityName  | stateName  |            | United      | +4564590232 | aliassAddress  |
      | Hans2     | Peters2  | address2 | cityName2 | stateName2 |            | United2     | +4564590232 | aliassAddress2 |



