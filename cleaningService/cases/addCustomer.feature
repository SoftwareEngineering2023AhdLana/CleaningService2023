Feature: add a customer to the company
Description: The process of adding customer to the system

Scenario: Can add a customer
 	Given the customer "mohamad" does not already exist
 	When the customer tries to log in 
 	Then the customer can be added
 	Then the customer is added successfully 
 
Scenario: Can not add a customer
  	Given the customer "lana" already exists
 	When the customer tries to log in
 	Then the customer cannot be added
 	Then the customer login fails
 
Scenario Outline: Add a customer with valid information
 	Given I am on the add customer page
 	When I enter "<username>" and "<password>" and "<name>" and "<phone>" and "<address>" and "<email>"
 	 And I click the submit button
 	Then the customer is added Done
	
Examples:
  	| username | password | name           | phone     | address     | email             |
  	| julia    | 123456   | Julia Williams | 052345678 | Tel Aviv    | julia@company.com |
  	| david    | 654321   | David Brown    | 052123456 | Haifa       | david@company.com | 
  	| sarah    | 432156   | Sarah Lee      | 052312456 | Jerusalem   |sarah@company.com  |

Scenario Outline: Add a customer with invalid information
	Given I am on the add customer page
	When I enter "<username>" and "<password>" and "<name>" and "<phone>" and "<address>" and "<email>"
	And I submit the form
	Then I should get an error message "Please enter valid information."

Examples:
	| username | password | name | phone     | address     | email            |
	| ''       | 123456   | John | 052345678 | Tel Aviv    | john@company.com |
  | mike     | ''       | Smith| 052123456 | Haifa       | mike@company.com |
  | amy      | 654321   | ''   | ''        | Jerusalem   |amy@company.com   |
	
	
	