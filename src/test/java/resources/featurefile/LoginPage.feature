@regression
Feature: Login page functionality
  As a user I should use login functionality on nopCommerce Website

  Background: I am on homepage
    And I click on login link

  @smoke
  Scenario: Verify I should navigate to login page successFully
    Then I verify that 'Welcome, Please Sign In!' message display

  @sanity
  Scenario Outline: Verify the error message with in valid credentials
    When I enter EmailId "<email>"
    And I enter Password "<password>"
    And I click on login button
    Then I Verify that the Error message is display

    Examples:
      | email             | password |
      | vishwa1@gmail.com | v123456  |

  Scenario Outline: verify that user should LogIn successFully with valid credentials
    When I enter EmailId "<email>"
    And I enter Password "<password>"
    And I click on login button
    Then I verify that LogOut link is display

    Examples:
      | email            | password |
      | vishwa@gmail.com | v123456  |

  Scenario Outline: Verify that user should LogOut successFully
    When I enter EmailId "<email>"
    And I enter Password "<password>"
    And I click on login button
    Then I click on LogOut Link
    And I verify that LogIn Link Display

    Examples:
    Examples:
      | email            | password |
      | vishwa@gmail.com | v123456  |




