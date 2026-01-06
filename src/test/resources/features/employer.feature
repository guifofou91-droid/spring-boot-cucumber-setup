Feature: Action to do on the employer object

  Scenario: Save employer
    When I save the employer with all the information
    Then The employer is save and the id is return
    And the status code is created