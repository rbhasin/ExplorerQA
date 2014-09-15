@test

Feature: Click preview cards

Scenario: Click on citations preview dot

  Given I am on the collection site
  When I click on the second preview dot
  Then I should see the citation info


  Scenario: Click on the figures preview dot

  Given I am on the collection site
  When I click on the third preview dot
  Then I should see a figure

