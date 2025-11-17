Feature: Login functionality

  Background:
    Given the application is open

  Scenario: Valid login
    When I enter username "Admin"
    And I enter password "admin123"
    And I click the login button
    Then I should see the dashboard

  Scenario: Invalid login
    When I enter username "Admin"
    And I enter password "wrongpass"
    And I click the login button
    Then I should not see the dashboard
