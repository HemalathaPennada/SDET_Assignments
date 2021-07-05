Feature: Validating Orange HRM Page

Background: I am logged into Orange Application
Given the Browser is Invoked
Then Orange should be loaded
Then Enter the credentials
Then User should be successfully logged in

@smoke
Scenario: Validate Job Title in Orange HRM Page
Given When I click on Admin Link
Then Click on Job
And validate text Job Title
Then Close Orange Browser

Scenario: Enter UserName in Admin Page
Given When I click on Admin Link
Then Enter the UserName "Hemalatha"
Then Close Orange Browser

Scenario Outline: Enter Employee Name in Admin Page
Given When I click on Admin Link
Then Enter the UserName details "<UserName>"
Then Close Orange Browser
Examples:
|UserName|
|Broadridge|
|Hemalatha123|
|Company|

@Regression
Scenario: Enter UserName in Admin Page
Given When I click on Admin Link
Then Enter the UserName in the textbox
|Broadridge|
|info|
Then Close Orange Browser
