Feature: login functionality
  Scenario: to verify that user should be able to login with valid credentials
    Given I open application url
    When  I  user enters valid username
    And   I user enters valid password
    And   I  user click on login button
    Then  I verify that user logged in successfully in application
