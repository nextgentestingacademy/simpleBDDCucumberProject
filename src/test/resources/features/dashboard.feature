Feature: Validate Dashboard page

  Background:
    Given the application is open
    When I enter username "Admin"
    And I enter password "admin123"
    And I click the login button
    Then I should see the dashboard

  @smoke
  Scenario: Validate all buttons on Quick Launch section
    Then I should see Assign Leave button
    Then I should see Leave List button
    Then I should see Timesheets button
    Then I should see Apply Leave button
    Then I should see My Leave button
    Then I should see My Timesheet button
