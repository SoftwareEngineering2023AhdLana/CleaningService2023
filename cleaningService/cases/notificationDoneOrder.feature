Feature: send notification to customer
  Description: Review the customers Done order to the company
  

 
Scenario:  comany'send notification when order done   
    Given the the Time of order is after the local time now  
    And the order is pass
    Then send notofication to customer 


 