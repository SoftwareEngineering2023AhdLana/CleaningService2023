Feature:  add discount 
  Description: Review the customer's Discount for order to the company
  Actor: User 
   Background: The company has customer
And these amount of buy
 |lana|500.0|
 |Ahmad|0.0|
 |manar|400.0|
 |lena|100.0|
 |ahd|90.0|
Scenario: The customer's order add Discount for it
    Given  that the customer <"manar"> is loggmed in to the company
    And the price <"400.0">
    Then add discount to request
    And it is stored in the customer 
    
    
    Scenario: The customer's order not add Discount for it
    Given  that the customer <"Ahmad"> is loggmed in to the company
    And the price <"0.0">
    Then not add discount to request
