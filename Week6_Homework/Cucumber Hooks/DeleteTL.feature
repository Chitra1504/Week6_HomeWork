Feature: Delete Lead 
@Test
Scenario Outline: Delete Lead
#Given Launch the Browser and navigate to the URL
When Enter the userName with <username>
And Enter the password with <password>
Then Verify the login is successful

When click on Crmsfa button
And click on Leads button
And click on FindLeads link
And Enter the phone no as <phno>
And click FindLeads button
And store the leadId in variable
Then click on first record shown in results

When click on Delete button
And click on FindLeads link
And enter the leadId in the Name and ID tab
And click FindLeads button
Then verify the lead is deleted

Examples:
|username|password|phno|
|DemoSalesManager|crmsfa|99|