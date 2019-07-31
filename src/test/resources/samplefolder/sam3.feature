Feature: Testme login with different set of data

Background: display welcome
Given display welcome message 


Scenario Outline: login with multiple inputs- TestMeApp
Given user opens testmeapp login on chrome browser
When user typing username as "<username>" and password as "<password>"
And click on Login button 
Then validates home page appear or not

Examples:
|username|password|
|Lalitha|Password123|
|Sample|Password123|