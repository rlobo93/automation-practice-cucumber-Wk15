$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "",
  "id": "register",
  "keyword": "Feature"
});
formatter.uri("SignPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4824355900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "userShouldNavigateToSignInPageSuccessFully",
  "description": "",
  "id": "login-test;usershouldnavigatetosigninpagesuccessfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify text \u003c\"AUTHENTICATION\"\u003e",
  "keyword": "Then "
});
formatter.match({
  "location": "SignSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 87826800,
  "status": "passed"
});
formatter.match({
  "location": "SignSteps.iClickOnSignInLink()"
});
formatter.result({
  "duration": 1224483900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTHENTICATION",
      "offset": 16
    }
  ],
  "location": "SignSteps.iVerifyText(String)"
});
formatter.result({
  "duration": 28137200,
  "status": "passed"
});
formatter.after({
  "duration": 603222800,
  "status": "passed"
});
formatter.uri("WomenCategory.feature");
formatter.feature({
  "line": 1,
  "name": "Category Page",
  "description": "",
  "id": "category-page",
  "keyword": "Feature"
});
});