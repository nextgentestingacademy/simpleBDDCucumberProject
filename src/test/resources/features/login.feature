Feature: Login functionality

  Background:
    Given the application is open

  @smoke
  Scenario: Valid login
    When I enter username "Admin"
    And I enter password "admin123"
    And I click the login button
    Then I should see the dashboard

  @smoke
  Scenario Outline: Invalid login
    When I enter username "<username>"
    And I enter password "<password>"
    And I click the login button
    Then I should not see the dashboard
    
    Examples:
	|username|password|
	|Admin|admin|
	|Admin123|Admin123|
	||admin123|
	|Admin|admin123|
    
    