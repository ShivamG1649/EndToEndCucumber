Feature: Verify admin page functionality
  @Sanity
  Scenario Outline: Verify system user search for Admin and  ESS UserRoles
    Given User is on the landing page
    When enter valid userName "<UserName>"
    And enter valid password "<Password>"
    And Click on signIn button
    And Click on admin link on left Side panel
    And Select Role "<UserRole>"
    # this is comments will not be executed by the compiler , Given , When , Then , Feature , Scenario:  And
#    And Click on Search button

    Examples:
    |UserRole|UserName |Password  |
    |Admin   | Admin   | admin123 |
    |ESS     | Admin   | admin123 |
    |ESS     |  Admin  | admin123 |
