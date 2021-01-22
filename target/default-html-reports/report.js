$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginPage.feature");
formatter.feature({
  "name": "Users should be able to create a new account",
  "description": "",
  "keyword": "Feature"
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
  "name": "the user is on the web-page",
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
      "name": "@registeredUser"
    }
  ]
});
formatter.step({
  "name": "the user enter email \"1sKvT@uR1.vONtD\" and password \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to sigIn",
  "keyword": "Then "
});
formatter.match({
  "location": "com.AlphaSense.step_definitions.LoginStepDefs.the_user_should_be_able_to_sigIn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});