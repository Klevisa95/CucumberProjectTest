Feature: add employee scenario

  @test
  Scenario: Adding one employee in the HRMS systems
    Given user is navigated to the HRMS application
    When used enters admin username and password
    And user clicks on login button
    When user clicks on PIM options
    And user clicks on add employee option
    When user enters firstName, middleName and lastName
    And user clicks on save button
    Then employee added successfully
    Then user close the browser