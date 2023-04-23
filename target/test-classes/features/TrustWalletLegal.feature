Feature: Trust Wallet Legal Screen

  Scenario: Trust Wallet Legal Screen
    Given user launches is on the legal screen
    When user clicks on the privacy policy
    And user closes the privacy policy
    Then user clicks on the terms of service
    And user closes the terms of policy
    And user clicks on the check box to accept the terms of service and privacy policy
    Then user clicks on the continue button