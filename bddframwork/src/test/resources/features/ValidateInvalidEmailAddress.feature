
Feature: Invalid Email Address
@Test1

Scenario: Verify that invalid email addresses are identified
 Given I click Login
 When I enter username as mohanpalekar02
 Then I verify that invalid email address error message is shown to the use