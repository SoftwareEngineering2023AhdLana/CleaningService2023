Feature: customer add invoice
Description: The customer adds an invoice for each request
Actor: customer


Scenario: customer can add an invoice successfully
 	Given that the customer "leen" is logged  in
 	And they have an request with date "13/10/2022" and time is "13:00"
 	And its status is 1
 	When the customer tries to add the invoice 
 	Then the invoice can be generated
 	And the invoice is generated
 	 	
Scenario: customer can not add invoice successfully
    Given that the customer "sam" is logged  in
 	And they have an request with date "31/10/2022" and time is "11:00"
 	And its status is 0
 	When the customer tries to add the invoice 
 	Then the invoice cannot be generated
 	And the invoice is not generated

Scenario: customer can not add invoice
	Given that the customer "ahd" is logged  in 
	And they do not have an request 
 	When the customer tries to add the invoice 
 	Then the invoice cannot be generated
 	And the invoice is not generated 	