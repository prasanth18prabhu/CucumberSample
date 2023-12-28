



Feature: This feature is to test the login page of Cyclos

  Background: Common steps for all scenario
    Given user needs to launch browser
    When navigate to the cyclos webpage
    Then verify user enter into the cyclos page "https://demo.cyclos.org/ui/home"

  Scenario: Test the login page with correct credentials
    Given user needs to click login button
    When user needs to enter valid credentials "demo" and "1234"
    Then validate the user has succesfully logged in "Demo user"
