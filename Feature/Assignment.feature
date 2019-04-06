Feature: Assignment for Instarem

  Scenario: Launch Amazon site
    Given Enter site url
    Then Home page is displayed

  Scenario: Validate List of products displayed
    Given Products are displayed
    Then Validate list of product displayed and print

  Scenario: Launch Swift Codes List Banks Name and their swiftcodes
    Given Enter site url for SwiftCodes
    When Bank Details are displayed
    Then Validate Bank names and Swift Codes and print
