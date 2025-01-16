Feature: Application login

  @Smoke
  Scenario: login in application
    Given User is on the landing page
    When enter valid userName
    And enter valid password
    And Click on signIn button
    Then verify that user is at home page

  @Regression
  Scenario: verify the title of login page
    Given User is on the landing page
    Then verify the title of login page should contain "OrangeHRM"

    @VerifyLogin
   Scenario: verify that "login" text on the login page
#      When enter valid userName
      Given User is on the landing page
      When  User verify that login text is displayed on the landing page

