Feature: To validate the OangeHRM Application Functionality

Scenario Outline: To validate the login functionality

Given Open the browser and naviate to url
When To verify the page title
Then Enter "<username" and "<password>"
Then Click on login button
Then Take screenshot and close the browser

Examples:
|username|password|
|Admin|admin123|