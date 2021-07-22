Feature: Login
  As a User i should be able to login
  #@librarian
  Scenario: Login as a librarian
    Given I am on login page
    When I login as librarian
    Then dashboard should be displayed

   # @student
    Scenario: Login as student
      Given I am on login page
      When I login as student
      Then dashboard should be displayed



