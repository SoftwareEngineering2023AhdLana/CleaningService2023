Feature: Admin generates reports 
Description: The admin generates the needed reports 
Actor: Admin 
Background: The company has admin
And these admin
|sami|1|
|ahd|2|
|lana|3|
|customer1|1000.0|
|customer1|90.0|
|customer1|550.0|
|Capet Wash per meter|40.0|
|Curtains Wash per Curtain|70.0|
|covers Wash per Cover|20.0|
Scenario: Admin can generate customer names report with their order details
	Given that the admin <"sami"> is logged in
	And there are customer in the company
	And at least one customer has an request
	Then the report can be generated
	