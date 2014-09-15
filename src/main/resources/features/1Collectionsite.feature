@test
Feature: Collection Site

  Scenario: Open Collection site

    Given I am a Science user
    When I open a published collection site
    Then I should see the collection info
    And I should see thread and research paper cards

