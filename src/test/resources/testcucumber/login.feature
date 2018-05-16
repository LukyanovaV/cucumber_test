Feature: Login
  Scenario Outline: Trying enter in Email is not success
    Given I am on yandex login page
    When I input "<Login>" in login, "<Password>" in password
    Then I am not on email page

    Examples:
    |Login|Password|
    |akulka170@yandex.ru|65477570|

