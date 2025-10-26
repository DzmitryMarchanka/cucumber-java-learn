Feature: As a user I want to get ability to use menu sections

  Scenario Outline: Docs sections should contains appropriate columns
    Given user opens Cucumber website
    When user clicks on the "Documentation" section
    Then page with title "<title>" is displayed
    Examples:
      |title            |
      |Introduction     |
      |What is Cucumber?|
      |What is Gherkin? |