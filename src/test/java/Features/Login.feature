Feature: SauceDemo Login

Background:
    Given a web browser is at the SauceDemo home page
    When the user enters the username "standard_user"
    And the user enters the password "secret_sauce"
    And the user clicks the login button Login
    
@excluir
  Scenario: User logins by successfully
  Then the user is on the SauceDemo home page
    
@excluir
  Scenario: User logins and logout by successfully
    When the user clicks the menu button
    And the user clicks the logout option
    Then the user is redirected to the login page

@excluir
  Scenario: User adds items to cart
    When the users add to cart a "backpack"
    Then the "backpack" should be in the cart
    And the cart icon should show "1" item

@excluir
  Scenario: User view details item 
    When the user selects an item "backpack"
    Then the user is redirected to the item's details page
    And the item's name "Sauce Labs Backpack" is displayed
    And the item's price "$29.99" is displayed
    And the button "Add to cart" is visible


Scenario: User makes the purchase
    When the users add to cart a "backpack"
    Then the user go to cart
    And the user proceeds to checkout
    When the user fills in their information with "FirstName", "LastName", and "12345"
    And the user confirms the checkout
    And the user clicks the finish button
    Then the user sees the button Back Home


    
