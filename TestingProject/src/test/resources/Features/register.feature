Feature: To Test Registration Functionality

  Scenario: Check Registration was Successfull
    Given user is on register page
    When user selects the gender and enters firstname,last name,email,password and conform password
    And clicks on Register button
    Then user is navigated to the Registered result page
    When  user clicks the continue button
    Then user is navigated to the home page
