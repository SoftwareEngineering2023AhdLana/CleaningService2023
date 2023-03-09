Feature: Admin log in 
 


  Scenario: Admin logs to enter into company
    Given Admin  is not log in
    And password is"1234"
    When  Admin in broswer

    Then Admin  is log in success