#language: en
#encoding: UTF-8

@login
Feature: Login
  Scenario: invalid user
    When I inform the user "Ad"
    And enter the password "asd"
    And click the login button
    Then the system shows the invalid user message

  @loginSucess
  Scenario: Sucess Login
    When I inform the user "Admin"
    And enter the password "admin123"
    And click the login button
    Then the system shows the logged user