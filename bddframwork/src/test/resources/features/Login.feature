@Regression @Test1
Feature: Login page scenarios
@Login
Scenario: Verify that the login is successful
 Given I am on the landing page
 And I close the popup when I see it
 And I click Login
 And I enter username as mohanpalekar02@gmail.com
 And I enter password as Stble1245%
 And I click on login button
 And I click Press and Hold when asked if I am Robot
 Then I see Your account is displayed