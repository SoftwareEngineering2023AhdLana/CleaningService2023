Feature: customer add a request 
Description: The customer add request
Actor: customer

   |ahmedmohamed|15/4/2022|13:00| 
	 |ahdghazal|18/3/2022|12:00| 
	 |lanasamer|28/2/2022|11:00|
Scenario: customer can choose the request
 	Given that the  customer "sam" is logged in
 	And has request an appointment with date "13/10/2022" and time "13:00"
 	And the request name is "purger" with price 40.0
 	When customer tries to add the request
 	Then the request can be chosen
 	And the request is added to the customer
 	
 
  	