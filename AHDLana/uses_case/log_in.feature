Feature: Admin log in
Scenario: Admin can login
Given that the admin "miraj" is not logged in
When admin tries to log in
And username is "miraj" and password is "1212001"
Then the admin login succeeds
And the admin is logged in

Scenario: Admin cannot login
Given that the admin "miraj" is not logged in
When admin tries to log in
And username is "miraj" and password is "wrongpassword"
Then the admin login fails
And the admin is not logged in