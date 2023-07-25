@regression
Feature: Computer page functionality
  As a user I want to check the computer page functionality in nopCommerce website

  Background: I am on a homepage
    And I click on Computer tab

  @smoke
  Scenario: Verify that I should navigate to desktop page successfully
    When Verify Computer text

  @sanity
  Scenario: Verify I should navigate to desktops page successfully
    When I click on Desktops link
    Then I verify Desktops text

  Scenario Outline: Verify that I should build you own computer and add them to cart successfully
    When I click on Desktops link
    And I click on product name "<product name>"
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on ADD TO CART Button
    Then I verify message added to cart "<message>"

    Examples:
      | product name            | processor                                       | ram           | hdd               | os                      | software                   | message                                          |
      | Build your own computer | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] | The product has been added to your shopping cart |
      | Build your own computer | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   | The product has been added to your shopping cart |
      | Build your own computer | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   | The product has been added to your shopping cart |



