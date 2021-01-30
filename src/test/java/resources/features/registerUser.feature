#language: en
#encoding: UTF-8

@registerUser
Feature: Register User

  @register
  Scenario: Register User
    When I click on the Admin tab
    And click on the add button
    And inform the Employee Name field the value "Fiona Grace"
    And inform the UserName field the value "fgrace"
    And inform the Password field the value "12345678"
    And inform the Confirm Password field the value "12345678"
    And click in the Save button
    Then the system will be save the user "fgrace"