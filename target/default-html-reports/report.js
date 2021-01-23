$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FullShopping.feature");
formatter.feature({
  "name": "Checkout process",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@TC3"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to buy a product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@TC3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the web-page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_is_on_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email \"Yt@hcFRy-.pfa\" and password \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Dress\" as a search item",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ProductsStepDef.user_enters_as_a_search_item(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select one of the item from the list",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ShoppingStepDef.User_select_one_of_the_item_from_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds the item to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ShoppingStepDef.user_adds_the_item_to_the_shopping_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeds to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ShoppingStepDef.user_proceeds_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeds to checkout from Summary",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ShoppingStepDef.user_proceeds_to_checkout_from_Summary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeds to checkout from Address",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ShoppingStepDef.user_proceeds_to_checkout_from_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeds to checkout from Shipping",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ShoppingStepDef.user_proceeds_to_checkout_from_Shipping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the payment type as \"Pay by bank wire\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ShoppingStepDef.user_selects_the_payment_type_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirms the order",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ShoppingStepDef.user_confirms_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Users should be able to create a new account \u0026\u0026 user can login successfully after",
  "description": "  the account creation",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the web-page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_is_on_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a registered user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@registeredUser"
    }
  ]
});
formatter.step({
  "name": "User enters email \"Yt@hcFRy-.pfa\" and password \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should create a new account and login with credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "name": "the user enter emailAddress \"\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click the create an account button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be on Account Creation Page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters the \"\u003cfirstname\u003e\", \"\u003clastName\u003e\",\"\u003caddress\u003e\",\"\u003ccityName\u003e\",\"\u003cstateName\u003e\",\"\u003cpostalCode\u003e\",\"\u003ccountryName\u003e\",\"\u003cmobile\u003e\",\"\u003caliassAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "And "
});
formatter.step({
  "name": "User should be logged out",
  "keyword": "When "
});
formatter.step({
  "name": "User enters email \"\" and password \"\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastName",
        "address",
        "cityName",
        "stateName",
        "postalCode",
        "countryName",
        "mobile",
        "aliassAddress"
      ]
    },
    {
      "cells": [
        "Hans",
        "Peters",
        "address",
        "cityName",
        "stateName",
        "",
        "United",
        "+4564590232",
        "aliassAddress"
      ]
    },
    {
      "cells": [
        "Hansss",
        "Petersss",
        "address2",
        "cityName2",
        "stateName2",
        "",
        "United2",
        "+4564590232",
        "aliassAddress2"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the web-page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_is_on_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should create a new account and login with credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "name": "the user enter emailAddress \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.click_the_create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be on Account Creation Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_on_Account_Creation_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"Hans\", \"Peters\",\"address\",\"cityName\",\"stateName\",\"\",\"United\",\"+4564590232\",\"aliassAddress\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_enters_the(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged out",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email \"\" and password \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the web-page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_is_on_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should create a new account and login with credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "name": "the user enter emailAddress \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.click_the_create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be on Account Creation Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_on_Account_Creation_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"Hansss\", \"Petersss\",\"address2\",\"cityName2\",\"stateName2\",\"\",\"United2\",\"+4564590232\",\"aliassAddress2\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_enters_the(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged out",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email \"\" and password \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/PDFDownload.feature");
formatter.feature({
  "name": "PDF Downloader",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "User should download the paymentsPDF",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@wip"
    },
    {
      "name": "@TC4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the web-page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_is_on_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email \"Yt@hcFRy-.pfa\" and password \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the link \"My orders\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.PDFDownloadStepDef.user_clicks_the_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the order details",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.PDFDownloadStepDef.user_clicks_the_order_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should make sure that the PDF is downloaded",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.PDFDownloadStepDef.user_should_make_sure_that_the_PDF_is_downloaded()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/SearchBar.feature");
formatter.feature({
  "name": "User should search the products and the results should be responsive",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@TC2"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to search item on website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@TC2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the web-page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_is_on_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email \"Yt@hcFRy-.pfa\" and password \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Dress\" as a search item",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ProductsStepDef.user_enters_as_a_search_item(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see results and responsive products",
  "keyword": "And "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ProductsStepDef.user_should_be_able_to_see_results_and_responsive_products()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.AlphaSense.step_definitions.ProductsStepDef.user_should_be_able_to_see_results_and_responsive_products(ProductsStepDef.java:32)\r\n\tat ✽.User should be able to see results and responsive products(file:///C:/Users/yalaa/Downloads/AlphaSenseProject/src/test/resources/features/SearchBar.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "product count should be 7",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.ProductsStepDef.product_count_should_be(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});