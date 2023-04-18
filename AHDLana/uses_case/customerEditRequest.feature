Feature: Edit request to  system
	Description: edit a request
	Actors: customer

Scenario: edit a date or time of request successfully 
 	Given that  the customer "leenh" is logged in 
 	And  we have date "18/4/2022" and time "12:00" in our system
 	And the new entered date "19/4/2022" and time "13:00" are available 
 	Then the date and time can be edited
 	And the date and time are edited
 	
Scenario: edit a date or time of request unsuccessfully
 	Given that  the customer "leenh" is logged in 
 	And we have date "18/10/2022" and time "12:00" in our system
 	And the new entered date "13/10/2022" and time "13:00" are unavailable 
 	Then the date and time can not be edited
 	And the date and time are not edited
 	