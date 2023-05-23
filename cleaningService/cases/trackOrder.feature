Feature: Track Order

Description: This feature allows the customer to track the status of their orders in the company's system.

Scenario: Customer Order Status - Order Completed

Given that the customer is logged in to the company
And the time of the order is after the current local time
When the customer checks the order status
Then the order status is marked as "Done"
And the updated order status is stored in the customer's record

Scenario: Customer Order Status - Order In Progress

Given that the customer is logged in to the company
And the time of the order is before the current local time
When the worker checks the order status
Then the order status remains unchanged as "still"

