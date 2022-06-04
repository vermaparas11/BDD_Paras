@demo1features
Feature: Demo1 features

@Login1linkvalidation
Scenario: Validation for Register page
Given User navigates to the application
When user enters Login Username "<Username>" and Password "<Password>"
Then verify the Home Page is displayed correctly

Examples:
|Username|Password|
|Test@test.com|******|
