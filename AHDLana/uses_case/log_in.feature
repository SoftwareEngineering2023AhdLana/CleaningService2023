Feature: Login
Actor: User
Description: The User's login process to the system
Background: The clinic has admins and worker
And these are the users
|ahmedmohamed|ahmed2000|ahmad mohamed|nablus|050677677|
|ahdghazal|ahd2002|ahd ghazal|nablus|050677677|
|lanasamer|lana2002|lana samer|nablus|050677677|

Scenario: worker can login
Given that the worker "lana" is not logged in
When worker tries to login
And username is "lana" and password is "lana2002"
Then the worker login succeeds
And the worker is logged in

Scenario: worker cannot login
Given that the worker "lana" is not logged in
When worker tries to log in
And username is "lana" and password is "wrongpassword"
Then the worker login fails
And the worker is not logged in

Scenario: Admin can login
Given that the admin "ahd" is not logged in
When admin tries to log in
And username is "ahd" and password is "ahd2002"
Then the admin login succeeds
And the admin is logged in

Scenario: Admin cannot login
Given that the admin "ahd" is not logged in
When admin tries to log in
And username is "ahd" and password is "wrongpassword"
Then the admin login fails
And the admin is not logged in

Scenario: customer can login
Given that the customer "ahd" is not logged in
When customer tries to log in
And username is "ahd" and password is "ahd2002"
Then the customer login succeeds
And the customer is logged in

Scenario: customer cannot login
Given that the customer "ahd" is not logged in
When customer tries to log in
And username is "ahd" and password is "wrongpassword"
Then the customer login fails
And the customer is not logged in

Scenario: Credentials do not match with an admin nor worker nor customer
Given that no one is not logged in
When user tries to log in
And username is "nonexistent" and password is "wrongpassword"
Then login fails
And the user is redirected to sign up page







