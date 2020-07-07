$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Eclipse/Cucumber/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "To validate the OangeHRM Application Functionality",
  "description": "",
  "id": "to-validate-the-oangehrm-application-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To validate the login functionality",
  "description": "",
  "id": "to-validate-the-oangehrm-application-functionality;to-validate-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and naviate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "To verify the page title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter \"\u003cusername\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Take screenshot and close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "to-validate-the-oangehrm-application-functionality;to-validate-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "to-validate-the-oangehrm-application-functionality;to-validate-the-login-functionality;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 13,
      "id": "to-validate-the-oangehrm-application-functionality;to-validate-the-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "To validate the login functionality",
  "description": "",
  "id": "to-validate-the-oangehrm-application-functionality;to-validate-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and naviate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "To verify the page title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter \"\u003cusername\" and \"admin123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Take screenshot and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage_TestCase.open_the_browser_and_naviate_to_url()"
});
});