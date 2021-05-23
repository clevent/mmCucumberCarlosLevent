@wip
  Feature: Search Function

    Scenario Outline: check search functionality for non registered user
      Given user should able to open main page
      When user should able to write product name "<product name>" and click on search button
      Then user should see "<product name>" at header
      And user should see all related products sorted by "Relevance"
      And user should see 60 products out of 2015 at first page
      And user should able to go next page by click on "<next page>"
      Examples:
      | next page   |product name|
      |      2      |Umbrella    |
