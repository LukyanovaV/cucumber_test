Feature: Buying ticket on blazedemo.com

  Scenario Outline: Success buying the cheapest ticket on blazedemo
    Given User is on a blazedemo page
    And User set "<depCity>" and "<destCity>"
    When User choose the cheapest flight
    And User input his "<name>", "<address>", "<city>", "<state>", "<zipCode>", "<cardType>", "<creditCardNum>", "<month>", "<year>", "<nameOnCard>"
    Then User get his purchase

    Examples:
    | depCity | destCity | name         | address       | city   | state         | zipCode | cardType    | creditCardNum | month | year | nameOnCard   |
    | Paris   | Rome     | Ivan Maximov | Baker str. 26 | Moscow | Moscow oblast | 3472839 | Master Card | 2323343443223 | 2     | 2019 | Ivan Maximov |

