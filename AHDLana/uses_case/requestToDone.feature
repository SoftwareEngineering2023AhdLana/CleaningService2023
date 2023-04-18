Feature: Visits
  Description: Review the customer's Done request to the company
  Actor: User 
   
 
Scenario: The customer's request turns into a Done
    Given  that the customer "ahd" is logged in to the company
    And the date "13/4/2022" and time "13:00" of the request have passed
    Then the request is turned into a Done
    And it is stored in the customer 