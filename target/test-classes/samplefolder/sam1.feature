Feature: Login functionality
Description: Registered user login to the application by entering valid username and password

Mapping: John would like access the online shoupping page. He should be registered and should use
registered credentials to get logged in to the application.


Scenario: Login with valid combination
Given user opens newtours application on chrome browser
When user enters "mercury" in username and password field
And Click on SignIn Button
Then verify login result as success


Scenario: Login with invalid combination
Given user opens newtours application on chrome browser
When user enters "sample123" in username and password field
And Click on SignIn Button
Then verify login result as success
