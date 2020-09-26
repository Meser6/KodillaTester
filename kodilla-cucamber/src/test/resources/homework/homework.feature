Feature: Is it divisible?

  Scenario Outline: Is it divisible by 3, 5, 15 or not?
    Given I have number <number>
    When I ask if it divisible by 3, 5, 15 or not?
    Then told <comment>
    Examples:
      | <number> | <comment> |
      | 3        | Fizz      |
      | 5        | Buzz      |
      | 15       | FizzBuzz  |
      | 10       | None      |
      | -3       | None      |
      | -5       | None      |
      | -15      | None      |
      | 0        | None      |
