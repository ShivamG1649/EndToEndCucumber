
@featureLevelTag
Feature: login functionality

  @DemoFeatureTC1 @Regression
  Scenario: to verify that user should be able to login with valid credentials
    Given I open application url
    When  I  user enters valid username
    And   I user enters valid password
    And   I  user click on login button
    Then  I verify that user logged in successfully in application


    # This is a nagative testing ( we are using invalid password here)
  @DemoFeatureTC2 @Regression
  Scenario: verify that user should see the error messages when it enter invalid credentials
    Given I open application url
    When  I  user enters valid username
    And   I user enters inValid password
    And   I  user click on login button
    Then  verify the error message on the login page