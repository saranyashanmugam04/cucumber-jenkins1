Feature: Test Calculator functionality

Scenario: Test Add function
When user enters 2
And user press plus
And user enters second valus as 3
Then user press equal
And validate output as 5