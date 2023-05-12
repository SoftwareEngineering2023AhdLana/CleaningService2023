Feature: add a customer to the company
Description: The process of adding customerto the system
Background: The company has customer
And these are the customer
|1|lana|1234|lana hasan|05234556|nablus|lana@gmail.com|
|2|lena|123|mohamad odeh|05234556|nablus|lena@gmail.com|
|3|Ahmad|3333|Ahmad Ahmad|05234556|nablus|Ahmad@gmail.com|
|4|ahd|12345|ahd ghazal|05234556|nablus|ahd@gmail.com|
@test
Scenario: Can add a customer
 	Given the customer<"mohamad"> does not already exist
 	When cutomer tries log in 
 	Then the customer can be added
 	Then the customer is added successful 
 	
 	@test
Scenario: Can not add a customer
  	Given the customer <"lana"> already exists
 	When cutomer tries log in
 	Then the customer cannot be added
 	Then the customer is log in fail
 	