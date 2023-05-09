Feature: trackOrder
  Description: Review the customer's Done order to the company
Background: The company has product
And these are the Order
|lana|Capet Wash per meter|29/4|40.0|
|ahd|Curtains Wash per Curtain|30/5|70.0|
|mohamad|covers Wash per Cover|1/6|20.0|
 
Scenario: The customer's order status 
    Given  that the customer is logged in to the company
    And the Time of order is after the local time now  
    Then the request is turned into a Done
    And it is stored in the customer 


 
Scenario: The customer's order status 
    Given  that the customer is logged in to the company
    And the Time of order is befor the local time now 
    Then the request is still
    