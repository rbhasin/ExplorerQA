@test

Feature: Thread

  Scenario: Open Thread

    Given I am a Science user
    When I click on a thread title
    Then I should see the thread article opening in the same window
    Then I open a published collection site
