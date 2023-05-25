Feature: Customer Add Invoice

Description: This feature allows the customer to add an invoice for each order they have.

Actor: Customer

Scenario: Customer Adds an Invoice Successfully

Given that the customer is logged in
And they have an order
When the customer tries to add the invoice
Then the invoice can be generated
And the invoice is successfully generated