Feature: As a user I want to get ability to use Docs pages

  Scenario: Docs sections should contains appropriate columns
    Given user opens Cucumber website
    When user clicks on the "Documentation" section
    Then page with title "Introduction" is displayed
    Then there are 10 items in the left-side menu
    And left-side menu contain the following links
      |Introduction                |
      |Installation                |
      |Guides                      |
      |Cucumber                    |
      |Gherkin                     |
      |Behaviour-Driven Development|
      |Tools                       |
      |Terminology                 |
      |Contributing                |
      |FAQs                        |
