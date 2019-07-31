Feature: Flight Booking through online 

@login @dryrun @regression
Scenario: flight login
When user login to flight booking site
And verify login to flight booking site is success

@search @regression
Scenario: search flight
When user searches flight giving required details
And verify search related flight is displayed
@order @regression
Scenario: Order Flight
When user clicks on order button
And verify Flight details get added to cart
@payment @regression
Scenario: Payment
When user clicks on cart 
And verify payment page displayed
And user selects netbanking
Then user completes payment
Then Verify payment success
