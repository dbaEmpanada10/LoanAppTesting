@NewLoanApplication
Feature: Utilise the loan application features when signed in as a user
  Scenario Outline: Unsuccessful loan application
    Given I am logged in as user
    And I am at the application page
    When I submit the application
    | firstname | <firstName>|
    | lastname  | <lastName> |
    | age       | <age>      |
    | addressOne | <addressOne>|
    | addressTwo | <addressTwo>|
    | postcode   | <postCode>  |
    | emailAddress | test@123Test.com |
    | loanAmount   | <amount>|

    Examples:
    | firstName | lastName | age | addressOne | addressTwo | postcode | loanAmount |
    | Fall      |Guy       |     | 123        |Fake Street | SW1A 2AA | 3000       |
    | Fall      |Guy       | 90000009    | 123        |Fake Street | SW1A 2AA | 1000       |
    | Fall      |Guy       |     | 123        |Fake Street | SW1A 2AA | 3000       |
    | Fall      |Guy       |     | 123        |Fake Street | SW1A 2AA | 3000       |
    | Fall      |Guy       |     | 123        |Fake Street | SW1A 2AA | 3000       |
    | Fall      |Guy       |     | 123        |Fake Street | SW1A 2AA | 3000       |
