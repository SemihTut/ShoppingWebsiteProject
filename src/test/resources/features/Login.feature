@smoke
Feature: Users should be able to create a new account && user can login successfully after
  the account creation

  Background:
    Given User is on the web-page

  @registeredUser
  Scenario: Login as a registered user
    When User enters email "MWvAjF@hkSx.XWvmL" and password ""
    Then User should be logged in

  @TC1
  Scenario Outline: User should create a new account and login with credentials
    When the user enter emailAddress ""
    And Click the create an account button
    And User should be on Account Creation Page
    And User enters the "<firstname>", "<lastName>","<address>","<cityName>","<stateName>","<postalCode>","<countryName>","<mobile>","<aliassAddress>"
    And User should be logged in
    When User should be logged out
    And User enters email "" and password ""
    Then User should be logged in

    Examples:
      | firstname | lastName | address | cityName | stateName | postalCode | countryName | mobile      | aliassAddress |
      | Ahmet     | Toprak   | address | cityName | stateName |            | United      | +4444444444 | aliassAddress |
      #| Hansss    | Petersss | address2 | cityName2 | stateName2 |            | United2     | +4564590232 | aliassAddress2 |



