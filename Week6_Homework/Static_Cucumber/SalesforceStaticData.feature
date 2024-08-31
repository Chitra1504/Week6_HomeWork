Feature: Update Account on Salesforce
#Background:
#Given Launch the Browser and navigate to the salesforceURL

Scenario Outline: Update Account on Salesforce
When Enter the sfusername as <sfusername>
And Enter the sfpassword as <sfpassword>
And click on the LogIn button
Then verify the login is succesful

When click on toggle menu button from left corner
And click View All 
And click Sales from App Launcher 
And click on Accounts tab
And search for the account using unique account name
And click the dropdown next to the account and select Edit
Then verify the Edit Account form is shown

When select Type as <partner>  
And select Industry as <industry>
And enter the billing street in billing address as '22, Police Station Road'
And enter the billing city in billing address as 'Chennai'
And enter the billing postal code in billing address as '600078'
And enter the billing state in billing address as 'Tamilnadu'
And enter the billing country in billing address as 'India'
And enter the shipping street in shipping address as '22, Police Station Road'
And enter the shipping city in shipping address as 'Chennai'
And enter the shipping postal code in shipping address as '600078'
And enter the shipping state in shipping address as 'Tamilnadu'
And enter the shipping country in shipping address as 'India' 
And select the customer priority as <priority>
And select the SLA as <sla>
And select the Active as <active>
And enter the Phone as '9600583603'
And select the Upsell Opportunity as <opportunity>
And click Save
Then verify the phone number is '9600583603'

Examples:
|sfusername|sfpassword|partner|industry|priority|sla|active|opportunity|
|dilip@testleaf.com|testleaf@2024|Technology Partner|Healthcare|Low|Silver|No|No|
