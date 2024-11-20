package Steps;

import static org.junit.Assert.*;

import java.util.UUID;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends BaseStep {
    String uuid = UUID.randomUUID().toString();

    @Given("^a web browser is at the SauceDemo home page$")
    public void aWebBrowserHomePage() {
        geturl();
    }

    @When("^the user enters the username \"([^\"]*)\"$")
    public void theUserEntersTheUsername(String username) {
        findElement("user-name", Pather.id, "").sendKeys(username);
    }

    @And("^the user enters the password \"([^\"]*)\"$")
    public void theUserEntersThePassword(String password) {
        findElement("password", Pather.id, "").sendKeys(password);
    }

    @And("^the user clicks the login button Login$")
    public void theUserClicksTheLoginButton() {
        findElementClick("login-button", Pather.id);
    }

    @Then("^the user is on the SauceDemo home page$")
    public void theUserIsOnTheSauceDemoHomePage() {
        waitElement(findElement("inventory_container", Pather.id, ""), TimeOut.LOW);
    }

    @Then("^the user receives an error message \"([^\"]*)\"$")
    public void theUserReceivesAnErrorMessage(String message) {
        String responseText = findElement("login_button_container", Pather.id, "").getText();
        assertEquals(message, responseText);
    }

    @And("^the user clicks the close button$")
    public void theUserClicksTheCloseButton() {
        findElement("//button[@class='error-button' and @data-test='error-button']", Pather.xPath, "").click();
    }

    @When("^the user clicks the menu button$")
    public void theUserClicksTheMenuButton() {
        findElementClick("react-burger-menu-btn", Pather.id);
    }

    @And("^the user clicks the logout option$")
    public void theUserClicksTheLogoutOption() {
        findElementClick("logout_sidebar_link", Pather.id);
    }

    @Then("^the user is redirected to the login page$")
    public void theUserIsRedirectedToTheLoginPage() {
        waitElement(findElement("login-button", Pather.id, ""), TimeOut.LOW);
    }

    @When("^the users add to cart a \"([^\"]*)\"$")
    public void theUsersAddToCartA(String item) {
        findElement("add-to-cart-sauce-labs-" + item, Pather.id, "").click();
    }

    @Then("^the \"([^\"]*)\" should be in the cart$")
    public void theShouldBeInTheCart(String item) {
        String responseText = findElement("remove-sauce-labs-" + item, Pather.id, "").getText();
        assertEquals("Remove", responseText);
    }

    @And("^the cart icon should show \"([^\"]*)\" item$")
    public void theCartIconShouldShowItem(String item) {
        String responseText = findElement("shopping_cart_container", Pather.id, "").getText();
        assertEquals(item, responseText);
    }

    @When("^the user selects an item \"([^\"]*)\"$")
    public void theUserSelectsAnItem(String item) {
        findElement("item_4_title_link", Pather.id, "").click();
    }

    @Then("^the user is redirected to the item's details page$")
    public void theUserIsRedirectedToTheItemsDetailsPage() {
        assertNotNull(
                findElement("//div[@class='inventory_details_container' and @data-test='inventory-item']\r\n" + "",
                        Pather.xPath, ""));

    }

    @And("^the item's name \"([^\"]*)\" is displayed$")
    public void theItemsNameIsDisplayed(String itemName) {
        String responseText = findElement("div.inventory_details_name.large_size", Pather.cssSelector, "").getText();
        assertEquals(itemName, responseText);
    }

    @And("^the item's price \"([^\"]*)\" is displayed$")
    public void theItemsPriceIsDisplayed(String itemPrice) {
        String responseText = findElement("div.inventory_details_price", Pather.cssSelector, "").getText();
        assertEquals(itemPrice, responseText);
    }

    @And("^the button \"([^\"]*)\" is visible$")
    public void theButtonIsVisible(String buttonName) {
        String responseText = findElement("add-to-cart", Pather.id, "").getText();
        assertEquals(buttonName, responseText);
    }

    @Then("^the user go to cart$")
    public void theUserGoToCart() {
        findElementClick("shopping_cart_container", Pather.id);
        assertNotNull(findElement("header_container", Pather.id, ""));
    }

@And("^the user proceeds to checkout$")
    public void theUserProceedsToCheckout() {
        findElementClick("checkout", Pather.id);
    }

    @When("^the user fills in their information with \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
    public void theUserFillsInTheirInformationWithAnd(String firstName, String lastName, String zipCode) {
        findElement("first-name", Pather.id, "").sendKeys(firstName);
        findElement("last-name", Pather.id, "").sendKeys(lastName);
        findElement("postal-code", Pather.id, "").sendKeys(zipCode);
    }

    @And("^the user confirms the checkout$")
    public void theUserConfirmsTheCheckout() {
        findElement("continue", Pather.id, "").click();
    
    }

    @And ("^the user clicks the finish button$")
    public void theUserClicksTheFinishButton() {
        findElement("finish", Pather.id, "").click();
    }

    /* 
    @Then("^the user sees the confirmation message \"([^\"]*)\"$")
    public void theUserSeesTheConfirmationMessage(String message) {
        String responseText = findElement("checkout_complete_container", Pather.id, "").getText();
        assertEquals(message, responseText);
    }
        */

    @And("^the user sees the button Back Home$")
    public void theUserSeesTheButtonBackHome() {
        String responseText = findElement("back-to-products", Pather.id, "").getText();
        assertEquals("Back Home", responseText);
    }

    @And("^driver close$")
    public void driverClose() {
        DriverQuit();
    }
}
