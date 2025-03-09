
  @tag1 @Login
Feature: Sent message to Parabank costomer care 
 Scenario: Sent message to customercare of parabank
    Given I click on message box
    And I enter customer name
    And I enter customer Emailid
    And I enter customer Phone no
    And I Write message to customercare
    And I click on sent to customercare button
    Then I should be send massege succesfully

 