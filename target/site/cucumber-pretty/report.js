$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Test google account login screen",
  "description": "",
  "id": "test-google-account-login-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1888236578,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "I want to test google account login screen with valid credential",
  "description": "",
  "id": "test-google-account-login-screen;i-want-to-test-google-account-login-screen-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "# Verify if a user will be able to login with a valid username and valid password."
    }
  ],
  "line": 9,
  "name": "Navigate to google account login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User logged in using valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should be navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.navigateToGoogleAccountLoginScreen()"
});
formatter.result({
  "duration": 1178692175,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.userLoggedInUsingValidUsernameAndPassword()"
});
formatter.result({
  "duration": 2052994568,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.userShouldBeNavigatedToHomePage()"
});
formatter.result({
  "duration": 4803936677,
  "status": "passed"
});
formatter.after({
  "duration": 99965758,
  "status": "passed"
});
formatter.before({
  "duration": 1076801122,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "I want to test google account login screen with Invalid credential",
  "description": "",
  "id": "test-google-account-login-screen;i-want-to-test-google-account-login-screen-with-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "# Verify if a user will be able to login with a invalid username"
    }
  ],
  "line": 16,
  "name": "User is on the google account login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enter invalid username",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user should get an error message and should not be allowed to proceed further",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.userIsOnTheGoogleAccountLoginScreen()"
});
formatter.result({
  "duration": 1378393868,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.userEnterInvalidUsername()"
});
formatter.result({
  "duration": 222988503,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.userShouldGetAnErrorMessageAndShouldNotBeAllowedToProceedFurther()"
});
formatter.result({
  "duration": 605758744,
  "status": "passed"
});
formatter.after({
  "duration": 84740389,
  "status": "passed"
});
formatter.before({
  "duration": 1019284788,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "I want to test google account login screen with empty data",
  "description": "",
  "id": "test-google-account-login-screen;i-want-to-test-google-account-login-screen-with-empty-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "# Verify if a user will be able to login without entering any data in the \u0027email or phone\u0027 field"
    }
  ],
  "line": 23,
  "name": "User try to login with empty data",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User do not enter any data in the \u0027email or phone\u0027 field",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user should get an error message also should not be allowed to proceed further",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.userTryToLoginWithEmptyData()"
});
formatter.result({
  "duration": 1523767144,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.userDoNotEnterAnyDataInTheEmailOrPhoneField()"
});
formatter.result({
  "duration": 54462296,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.userClickOnNextButton()"
});
formatter.result({
  "duration": 147433134,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.userShouldGetAnErrorMessageAlsoShouldNotBeAllowedToProceedFurther()"
});
formatter.result({
  "duration": 45700108,
  "status": "passed"
});
formatter.after({
  "duration": 80795344,
  "status": "passed"
});
});