Feature: Add Discount

Description: This feature allows the user to review and apply a discount to a customer's order in the company's system.

Actor: User

Scenario: Apply Discount to Customer's Order

Given that the customer is logged in to the company
And the price of the order is greater than 100
When the user applies a discount to the order
Then the discount is added to the order request

Scenario: Do Not Apply Discount to Customer's Order

Given that the customer is logged in to the company
And the price of the order is less than 100
When the user attempts to apply a discount to the order
Then the discount is not added to the order request