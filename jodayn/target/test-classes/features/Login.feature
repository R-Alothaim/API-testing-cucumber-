Feature: Application Login
  Scenario Outline: Scenario Outline name: Home page default login
    Given Add place "<Header 1>" "<Header 2>" "<Header 3>"
    When user calls "addPlaceAPI" with "post" http request


Examples:
    | Header 1 | Header 2 | Header 3 |
    | Ryan  | English  | Riyadh  |
    | Roon  | Arabic  | Jeddah  |