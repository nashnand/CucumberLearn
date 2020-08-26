Feature: To open URL google.com and search
Scenario: Open Google and search with keyword
    Given User is entering google
    When User is typing "Apple"
    And press key Enter
    Then Apple related search should appear