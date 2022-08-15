@AddUser
Feature: User

  @addEmployee
  Scenario: I add a user
    Given I access to orange application
    And I am authenticated as admin "Admin" "admin123"
    When I click on PIM tab
    And I click on Add Employee tab
    And I fill the first name "Fatma"
    And I fill the last name "CHAOUACHI"
    And I fill ID user "1992"
    #And I choose a picture
    When I click on Create Login Details radio button
    And I fill a user Name "Fatma"
    And I fill a password "123456789/."
    And I Confirm password "123456789/."
    And I select a status
    And I click on save button of Add Employee section
    When I click on Employee list tab
    And I fill a Employee Name "Fatma"
    And I click on search button
    Then I check that the name of user is well displayed

