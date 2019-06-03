Feature: Login Action

  Scenario Outline: Sucesful login with valid credentials
    Given User opens app
    When User click on sign in
    And user enters "<username>" and "<password>"
    Then Msg displayed login suces

    Examples: 
      | username | password    |
      | lalitha  | password123 |
      | admin    | password456 |
