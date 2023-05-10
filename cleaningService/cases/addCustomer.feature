Feature: add a customer to the company
Description: The process of adding customerto the system
Background: The company has customer
And these are the customer
|1|lana|05234556|nablus|lana@gmail.com|1234|
|2|lena|05234556|nablus|lena@gmail.com|123|
|3|Ahmad|05234556|nablus|Ahmad@gmail.com|3333|
|4|ahd|05234556|nablus|ahd@gmail.com|12345|

Scenario: Can add a customer
 	Given the customer<"mohamad"> does not already exist
 	When cutomer tries log in 
 	Then the customer can be added
 	Then the customer is added successful 
 	
 	
Scenario: Can not add a customer
  	Given the customer <"lana"> already exists
 	When cutomer tries log in
 	Then the customer cannot be added
 	Then the customer is log in fail
 	