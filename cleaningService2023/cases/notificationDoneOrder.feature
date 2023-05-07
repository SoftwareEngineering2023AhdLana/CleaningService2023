Feature: send notification to customer
  Description: Review the customers Done order to the company
  
Background: The company has product
And these are the Order and customer
|lana|Capet Wash per meter|lanahasan1712@gmail.com|29/4|40.0|
|ahd|Curtains Wash per Curtain|ahd@gmail.com|30/5|70.0|
|mohamad|covers Wash per Cover|mohamad@gmail.com|1/6|20.0|
 
   
 
Scenario:  comany'send notification when order done   
    Given the the Time of order is after the local time now  
    And the order is pass
    Then send notofication to customer 


 