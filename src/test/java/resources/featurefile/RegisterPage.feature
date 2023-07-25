@regression
Feature: Registration page functionality
  As a user I want to use registration page functionality on nopCommerce Website

  Background: I am on homepage
    And I click on Register link

  @smoke
  Scenario: Verify that I should navigate to register page successfully
    Then Verify "Register" text

  @sanity
  Scenario:  Verify that FirstName LastName Email Password And ConfirmPassword fields are mandatory
    When I click on REGISTER button
    And I verify the error message First name is required.
    And I verify the error message Last name is required.
    And I verify the error message Email is required.
    And I verify the error message Password is required.
    Then I verify the error message Confirm Password is required.

  Scenario Outline: Verify that user should create account successfully
    When I select gender "<gender>"
    And I enter firstname "<firstname>"
    And I enter lastname "<lastname>"
    And I select day "<day>"
    And I select month "<month>"
    And I select year "<year>"
    And I enter email "<email>"
    And I enter password "<password>"
    And I enter confirm password "<confirm password>"
    And I click on REGISTER button
    Then I verify message "<message>"

    Examples:
      | gender | firstname | lastname | day | month | year | email                 | password | confirm password | message                     |
      | Female | Vishwa    | Patel    | 11  | July  | 1996 | vishwapatel@gmail.com | v123456  | v123456          | Your registration completed |

