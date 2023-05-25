Feature: Admin Generates Reports

Description: This feature allows the admin to generate the necessary reports.

Actor: Admin

Scenario: Admin Can Generate Customer Names Report with Order Details
Given that the admin is logged in
When the admin generates the customer names report with their order details
Then the report can be generated