Feature: Login with parameters

  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username "librarian13@library"
    And I enter password '9rf6axdD'
    And click the sign in button
    And there should be 5564 users #numbercan be whatever you have there
    Then dashboard should be displayed

  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian13@library"and "9rf6axdD"
    Then dashboard should be displayed
    And there should be 5564 users #number can be whatever you have there

  Scenario: verify default values in Users page
    When I click on "Users"link
    Then show records default value should be 10
    And show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |


