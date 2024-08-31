Feature: Create Lead 
@Test
Scenario Outline: Create Lead
#Given Launch the Browser and navigate to the URL
When Enter the userName with <username>
And Enter the password with <password>
Then Verify the login is successful
When click on Crmsfa button
And click on Leads button
And click on CreateLead button
And enter the company name as <companyName>
And enter the first name as <firstName>
And enter the last name as <lastName>
And click on Submit button
Then verify the create lead page

Examples:
|username|password|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|'TestLeaf'|'Dillip'|'Kumar'|