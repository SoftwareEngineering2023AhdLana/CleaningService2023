Feature: Sign up
Actor: An outsider to the system

Scenario: The sign up is successful
Given that the customer "nonexistent" is  not logged in
And they do not have an account in the system
Then the sign up succeeds
And the customer is redirected to the login page

Scenario: The sign up is unsuccessful
Given that the customer "ayaayman" is  not logged in
And they does have an account in the system
Then the sign up fails
And the customer is prompted to try again