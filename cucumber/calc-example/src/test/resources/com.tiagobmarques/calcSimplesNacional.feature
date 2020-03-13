Feature: Calc tax Simples nacional
  Scenario: Calc nominal rate
    Given I have a revenue
    When I calc the revenue of 1000000
    Then I should get a rate of 8.45