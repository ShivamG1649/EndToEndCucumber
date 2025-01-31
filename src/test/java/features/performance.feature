Feature: performance page test cases

  @PerformanceVerification
  Scenario: verify that search button on the page
    Given enter valid userName
    And enter valid password
    And Click on signIn button
    When Click on performance link on left panel
    Then Verify that Search button on the page
