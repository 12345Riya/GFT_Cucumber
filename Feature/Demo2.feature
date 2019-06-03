Feature: Login Action Test

  Scenario: Successfull login with valid credentials
    Given user login page is opened
    When user enters "lalitha" and "password123" as password
    When user clicks on login button
    Then will finds a testmeapp homepage
