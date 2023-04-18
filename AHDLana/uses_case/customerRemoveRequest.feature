Feature: Remove request to system
	Description: edit a request
	Actors: customer

Background:
Given we have customer request table. 
 	 |sam|13/10/2022|13:00| 
	 |Ahmed|18/10/2022|12:00| 
	 |leen|20/10/2022|11:00|


Scenario: remove a date or time of request successfully 
 	Given that the customer  "leen" is logged in 
 	And the entered date is "19/10/2022" and time is "13:00"
 	And the date and time exist in the customer's request's
 	Then the date and time can be removed
 	And the date and time are removed
 	
Scenario: remove a date or time of appointement unsuccessfully
 	Given that the customer  "leen" is logged in 
 	And the entered date is "13/10/2022" and time is "13:00"
 	And the date and time do not exist in the customer's request's
 	Then the date and time can not be removed
 	And the date and time are not removed