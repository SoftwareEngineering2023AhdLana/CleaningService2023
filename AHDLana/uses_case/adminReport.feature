Feature: Admin generates reports 
Description: The admin generates the needed reports 
Actor: Admin 

Scenario: Admin can generate customer' names report with their request details
	Given that the admin "sam" is logged in
	And there are customer in the company
	And at least one customer has an request
	Then the report can be generated
	And the report is generated

Scenario: Admin can display products 
	Given that the admin "sam" is logged in
	And there are products
	Then the products report can be generated
	And the report of the product is generated
