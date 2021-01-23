$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
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
  "name": "User enters email \"1sKvT@uR1.vONtD\" and password \"\"",
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
});