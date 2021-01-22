$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SearchBar.feature");
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
  "name": "User enters email \"1sKvT@uR1.vONtD\" and password \"\"",
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
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.AlphaSense.step_definitions.ProductsStepDef.user_should_be_able_to_see_results_and_responsive_products(ProductsStepDef.java:34)\r\n\tat ✽.User should be able to see results and responsive products(file:///C:/Users/yalaa/Downloads/AlphaSenseProject/src/test/resources/features/SearchBar.feature:9)\r\n",
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