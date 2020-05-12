@login
Feature: Login
  As user, I want to be able to login with username and password

  Background: open login page
    Given user is on the login page

  @pos_manager
  Scenario: Login as POS manager and verify title
    When user logs in as a POS manager
    Then user should verify title

  @events_manager
  Scenario: Login as Events manager and verify title
    When user logs in as a Events manager
    Then user should verify title

  @crm_manager
  Scenario: Login as CRM manager and verify title
    When user logs in as a CRM manager
    Then user should verify title