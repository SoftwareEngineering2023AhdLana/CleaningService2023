Feature: Admin add a product to the company
Description: The process of adding products to the system by the admin
Actor: Admin
Background: The company has products, each of the them has its price 
And these are the services
|Carpet Wash per metre|40.0|
|Curtains Wash per curtain|120.0|
|Covers Wash per cover|70.0|

Scenario: Can add a service 
 	Given that the admin is logged in
 	And the service does not already exist
 	And the service is "Dry clean for curtains" and its price is 150.0 
 	When admin tries to add the service to the company
 	Then the service can be added
 	Then the service is added
 	
 	
Scenario: Can not add a service
  	Given that the admin is logged in
 	And the service already exists
 	And the service is "Carpet Wash per metre" and its price is 40.0 
 	When admin tries to add the service to the company
 	Then the service cannot be added
 	Then the service is not added
 	