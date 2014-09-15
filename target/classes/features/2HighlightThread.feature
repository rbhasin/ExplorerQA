@test
Feature: Highlight thread/Research articles


  Scenario: Highlight thread

    Given I am on the collection site
    When I click on highlight for any thread
    Then I should see research papers that belong to that thread


  Scenario: Click Map
    When I click on the map area
    Then the explorer should be reset


  Scenario: Highlight Article
    When i click on highlight for any research article
    Then i should see threads highlighted that correspond to that article


  Scenario: Explorer reset
    When I click on the map area
    Then the explorer should be reset