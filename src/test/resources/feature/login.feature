Feature: User Login Functionality on SauceDemo

  Scenario: Successful login with valid credentials
    Given I am on the SauceDemo login page
    When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    Then I should be navigated to the inventory page

  Scenario: Failed login with locked out credentials
    Given I am on the SauceDemo login page
    When I enter username "locked_out_user" and password "secret_sauce"
    And I click on the login button
    Then I should see an error message