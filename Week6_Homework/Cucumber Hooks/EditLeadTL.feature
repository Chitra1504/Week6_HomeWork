Feature: Edit Lead 
@Test
Scenario Outline: Edit Lead
#Given Launch the Browser and navigate to the URL
When Enter the userName with <username>
And Enter the password with <password>
Then Verify the login is successful

When click on Crmsfa button
And click on Leads button
And click on FindLeads link
And Enter the phone no as <phno>
And click FindLeads button
Then click on first record shown in results

When click on Edit button
And update leadCompanyName with <cmpName>
And click Update button
Then verify the companyName is updated successfully

Examples:
|username|password|phno|cmpName|
|DemoSalesManager|crmsfa|99|TCS|