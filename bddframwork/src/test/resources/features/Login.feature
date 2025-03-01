#Author: your.email@your.domain.com

@BDD
Feature: Login page scenarios

Scenario: Verify that the login is successful
Given i click Login
And I enter username as mohanpalekar02@gmail.com
And I enter password as ffffercdfv
And I click on login button
Then I see Your account is displayed