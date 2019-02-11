@ignored
Feature: Regular expressions in step definitions
  As a developer
  I want to see examples of regular expressions in step definitions
  So that I can write powerful Cucumber steps


  Scenario: Alternations
    Given I have a ball

  Scenario: Alternations 2
    Given I have a foot

  Scenario: Non-capturing group
    Given I have a tasty cucumber step

  Scenario: Non-capturing group 2
    Given I have a nasty cucumber step

  Scenario: Non-capturing group 3
    Given I have a rusty cucumber step

  Scenario: Capture integers and strings
    Given I have 6 carrots in my basket

  Scenario: Capture integers and strings2
    Given I have 4 carrots in my basket

  Scenario: Singular and plural
    Given There is 1 cat fed by 1 person

  Scenario: Singular and plural 2
    Given There are 2 cats fed by 1 person

  Scenario: Singular and plural 3
    Given There are 2 cats fed by 2 persons

  Scenario: Singular and plural 4
    Given There are 2 cats fed by 3 people

  Scenario: Singular and plural 5
    Given There is 1 ox fed by 4 persons

  Scenario: Singular and plural 6
    Given There are 3 oxen fed by 5 people


  Scenario: Data tables
    Given I have the following order
      | vegetable | amount | cost |
      | cucumber  |   4    |  10  |
      | carrot    |   5    |   6  |
      | potato    |   6    |   4  |

  Scenario: List of domain objects
    Given I have another order
      | vegetable | amount | cost |
      | cucumber  |   7    |  10  |
      | carrot    |   6    |   6  |
      | potato    |   5    |   4  |