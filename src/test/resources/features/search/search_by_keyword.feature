Feature: Searching by Keyword
  Scenario Outline: Should list results related to a specified keyword
    Given User is on a home page
    When User input "<keyword>" in searching bar and click on search button
    Then User is on result list page and result list contain input "<keyword>"

    Examples:
    |keyword|
    |Василий|