Feature: login feature

  # The first example has two steps
Scenario: User can login
	Given I have the following users in my company by list
	  |user12|admina  |
	  |uu2020|gge123yy|
	  |lana  |lana2002|
	  |sam   |qwerthhb|
	  |user2 |admin   |
	And that the user is not logged in
	And the id is <"user12"> and password is <"admina">
	Then the user login succeeds
	And the user is logged in

Scenario: User has the wrong password
Given I have the following users in my company by list
	  |user12|admina  |
	  |uu2020|gge123yy|
	  |lana  |lana2002|
	  |sam   |qwerthhb|
	  |user2 |admin   |
	And that the user is not logged in
	And the id is <"user12"> and password is <"wrongpass">
	Then the user login fails
	And the user is not logged in
		

	