Feature: Login Functionality

Scenario: Login functionality with valid ceredentails

Given User Navigates to the login page
When User Enters the valid username and valid password
And  User Clicks on the login button
Then User Successfully login into the application 

@Test2
Scenario: Login functionality with valid ceredentails

Given User Navigates to the login page
When User Enters the valid "Admin" and valid "admin123"
And  User Clicks on the login button
Then User Successfully login into the application 


 Scenario Outline: Invalid Login and message validation
    Given User Navigates to the login page
    When User Enters the valid "<Username>" and valid "<Password>"
    And  User Clicks on the login button
    Then I see "<ErrorMessage>"

    Examples: 
      | Username | Password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax@123 | Username cannot be empty |
      |          |            | Username cannot be empty |

