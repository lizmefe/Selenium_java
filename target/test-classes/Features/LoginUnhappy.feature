Feature: SauceDemo Login

Background:
    Given a web browser is at the SauceDemo home page

@excluir
  Scenario: User login is bloqued because the account is locked
    When the user enters the username "locked_out_user"
    And the user enters the password "secret_sauce"
    And the user clicks the login button Login
    Then the user receives an error message "Epic sadface: Sorry, this user has been locked out."
    And the user clicks the close button


    
