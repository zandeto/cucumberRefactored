
Feature: Submit data to webdriveruniversity using contact us form

  Background:
    Given Print this first

@test
  Scenario: Submit valid data via contact us form
    Given I access webdriveruniversity contact us form
    When I enter a valid first name
    And I enter a valid last name
      | woods | jackson | jones |
    And I enter a valid email address
    And I enter comments
      | example comment 1 | example comment 2 |
    When I click on the submit button
    Then the information should successfully be submitted

