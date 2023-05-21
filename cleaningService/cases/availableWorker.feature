Feature: show if available worker now in system
Description: The process show available worker in the system

Scenario: show if available worker
 	Given  i have workers in system
 	When the user  is log in 
 	And need to show avilable worker
 	Then print available worker or not
 
