@DesktopTests
Feature: Test scenarios for Desktops

  Background: 
    Given User is on Retail website
    When User click on Desktops tab

  @DesktopTest1
  Scenario: User verify all items are present in Desktops tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop page

  @DesktopTest2
  Scenario: User add HP LP 3065 from Desktops tab to the cart
    And User click on Show all desktops
    And User click ADD TO CART option on ‘HP LP3065’ item
    And User select quantity 1
    And User click add to Cart button
    Then User should see a message ‘Success: You have added HP LP3065 to your shopping cart!’

  @DesktopTest3
  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click on Show all desktops
    And User click ADD TO CART option on ‘Canon EOS 5D’ item
    And User select color from dropdown ‘Red’
    And User select quantity 1
    And User click add to Cart button
    Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’'

  @DesktopTest4
  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    And User click on Show all desktops
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourname     | yourReview                         | Rating      |
      | name         | review                             | Bad or good |
      | Tommy Shelby | hello yes no how ok then what sure | bad         |
    And User click on Continue Button
    Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”
