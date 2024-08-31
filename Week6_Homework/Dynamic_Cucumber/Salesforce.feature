Feature: Create Account on Salesforce
Background:
Given Launch the Browser and navigate to the salesforceURL

Scenario Outline: Create Account on Salesforce
When Enter the sfusername as <sfusername>
And Enter the sfpassword as <sfpassword>
And click on the LogIn button
Then verify the login is succesful

When click on toggle menu button from left corner
And click View All 
And click Sales from App Launcher 
And click on Accounts tab
And click on New button
Then verify the New Account creation form is shown

When Enter Account Name as <accname>
And Select ownership as <ownership>
And click Save
Then verify the Account is created with <accname>

Examples:
|sfusername|sfpassword|accname|ownership|
|dilip@testleaf.com|testleaf@2024|"Chitra"|Public|
|dilip@testleaf.com|testleaf@2024|"Ram"|Public|
