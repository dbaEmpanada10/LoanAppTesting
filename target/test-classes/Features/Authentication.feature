@Authentication
Feature: Authentication

  Scenario: Login with user details
    Given I am at the login page
    When User enters their credentials and submits
    Then I am redirected to the home page

  Scenario: Login with admin credentials
    Given I am at the login page
    When Admin enters their credentials and submits
    Then I am redirected to the home page

  Scenario: Logout
    Given I am logged in as user
    When I logout
    Then I am redirected to the login page