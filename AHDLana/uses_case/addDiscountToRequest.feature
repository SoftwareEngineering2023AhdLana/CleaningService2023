Feature: Visits
  Description: Review the customer's Discount for request to the company
  Actor: User 
   
 
Scenario: The customer's request add Discount for it
    Given  that the customer "ahd" is logged in to the company
    And the price "400.0"
    Then add discount to request
    And it is stored in the customer 