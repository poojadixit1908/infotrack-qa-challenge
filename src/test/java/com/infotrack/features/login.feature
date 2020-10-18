# new feature
# Tags: optional

Feature: Test google account login screen

  Scenario: I want to test google account login screen with valid credential
     # Verify if a user will be able to login with a valid username and valid password.

    Given Navigate to google account login screen
    When User logged in using valid username and password
    Then User should be navigated to home page

  Scenario: I want to test google account login screen with Invalid credential

    # Verify if a user will be able to login with a invalid username
    Given User is on the google account login screen
    When User enter invalid username
    Then user should get an error message and should not be allowed to proceed further

  Scenario: I want to test google account login screen with empty data
    # Verify if a user will be able to login without entering any data in the 'email or phone' field

    Given User try to login with empty data
    When User do not enter any data in the 'email or phone' field
    And User click on next button
    Then user should get an error message also should not be allowed to proceed further




