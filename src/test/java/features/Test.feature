Feature: TestFeatureOne

  Scenario: scenarioOne

    Given I navigate to the login page
    And I enter the following for login
      | UserName | Password      |
      | admin    | adminpassword |
    And I click on the login button
    Then I should see the userform page