@smoke
Feature: PDF Downloader
  @wip @TC4
  Scenario: User should download the paymentsPDF
    Given User is on the web-page
    And User enters email "1sKvT@uR1.vONtD" and password ""
    And User should be logged in
    When User clicks the link "My orders"
    And User clicks the order details
    Then User should make sure that the PDF is downloaded

