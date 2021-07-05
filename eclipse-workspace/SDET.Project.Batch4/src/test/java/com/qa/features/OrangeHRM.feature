Feature: Validating Orange HRM Page
Scenario: Validate Admin Menu if Dashboard is Available
Given When I am in OrangeHRP Application
Then Login to Application
When Dashboard page is available
And click on Admin menu
Then Close the Browser


