@Login @Sanity
Feature: Login page scenarios

  Scenario: Valid Bank Login
    Given I enter the parabank username 
    And I enter the parabank password 
    And I click the login button
    Then I should be logged in successfully
