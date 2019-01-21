Feature: TestFeatureOne

  Scenario: scenarioOne

    Given I navigate to the login page
    And I enter the following for login
      | UserName | Password      |
      | admin    | adminpassword |
    And I click on the login button
    Then I should see the userform page


  Scenario Outline: Login with correct userName and password using Scenario Outline

    Given I navigate to the login page
    And I enter <UserName> and <Password>
    And I click on the login button
    Then I should see the userform page

    Examples:
      | UserName  | Password     |
      | execute   | automation   |
      | execute 2 | automation 2 |
      | execute 3 | automation 3 |