Feature: customer add invoice
Description: The customer adds an invoice for each order
Actor: customer
Background: The company has customer
And these are the invoice of customer
|lana|Capet Wash per meter|29/4|40.0|
|Ahmad|Curtains Wash per Curtain|29/4|70.0|
|ahd|covers Wash per Cover|30/5|70.0|

 
  
Scenario: customer add an invoice successfully
 	Given that the customer <"lana"> is logged  in
 	And they have an order 
 	When the order tries to add the invoice 
 	Then the invoice can be generated
 	And the invoice is generated


