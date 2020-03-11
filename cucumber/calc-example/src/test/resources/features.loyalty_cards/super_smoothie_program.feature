Feature: Super Smoothie Loyalty Cad Program

  The more smoothies you buy, the more points your earn.

  Background:
    Given the following drink categories:
      | Drink              | Category | Points |
      | Banana             | Regular  | 15     |
      | Triple Berry Blend | Fancy    | 20     |
      | Earl Grey          | Tea      | 30     |

  Scenario Outline: Earning points when purchasing smoothies
    Given Michael is a Morning Freshness Member
    When Michael purchases <Quantity> <Drink> drinks
    Then he should earn <Points> points
    Examples:
      | Drink              | Quantity | Points |
      | Banana             | 2        | 15     |
      | Triple Berry Blend | 1        | 20     |
      | Earl Grey          | 3        | 30     |
