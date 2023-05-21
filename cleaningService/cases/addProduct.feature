Feature: Admin add a product to the company
Description: The process of adding products to the system by the admin
Actor: Admin
Background: The company has products, each of the them has its price 
And these are the services
|Capet Wash per meter|wool|carpet1|40.0|
|Curtains Wash per C9urtain|synthetic|carpet1|70.0|
|covers Wash per Cover|fits 3-seat sofa, cotton|cover|20.0|

Scenario: Can add a product 
 	Given that the admin is logged in
 	And the product does not already exist
 	And the product is <"cake"> and its price is 60.0 
 	When admin tries to add the product to the company
 	Then the product can be added
 	Then the product is added
 	
 	
Scenario: Can not add a product
  	Given that the admin is logged in
 	And the product already exists
 	And the product is <"covers Wash per Cover"> and its price is 20.0 
 	When admin tries to add the product to the company
 	Then the product cannot be added
 	Then the product is not added
 	