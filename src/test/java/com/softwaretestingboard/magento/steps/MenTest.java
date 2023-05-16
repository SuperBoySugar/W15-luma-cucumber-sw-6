package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenTest {
    @Given("^I mouse hover on Men$")
    public void iMouseHoverOnMen() throws InterruptedException {
        new HomePage().mouseHoverOnMen();
    }

    @When("^I mouse hover on Bottom$")
    public void iMouseHoverOnBottom() {
        new HomePage().mouseHoverOnBottom();
    }

    @And("^I click on Pants$")
    public void iClickOnPants() {
       new HomePage().clickOnPants();

    }

    @And("^I mouse hover on Product Name$")
    public void iMouseHoverOnProductName() {
        new PantsPage().mouseHoverOnProductName();
    }

    @And("^I click on Size$")
    public void iClickOnSize() {
        new PantsPage().clickOnsize();
    }

    @And("^I click on Colour Black$")
    public void iClickOnColourBlack() {
        new PantsPage().clickOnColourBlack();
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new PantsPage().clickOnAddToCart();
    }

    @And("^I verify text message \"([^\"]*)\"$")
    public void iVerifyTextMessage(String expectedMessage)  {
        new PantsPage().verifyTextMessage(expectedMessage);

    }

    @And("^I click on shopping cart$")
    public void iClickOnShoppingCart() {
        new PantsPage().clickOnShoppingCart();
    }

    @And("^I verify shopping cart title \"([^\"]*)\"$")
    public void iVerifyShoppingCartTitle(String title)  {
        new ShoppingCartPage().verifyTextShoppingCart(title);

    }

    @And("^I verify product name \"([^\"]*)\"$")
    public void iVerifyProductName(String expectedName)  {
        new ShoppingCartPage().verifyProductName(expectedName);

    }

    @And("^I verify product size \"([^\"]*)\"$")
    public void iVerifyProductSize(String expectedSize)  {
        new ShoppingCartPage().verifyProductSize(expectedSize);

    }

    @Then("^I verify product colour \"([^\"]*)\"$")
    public void iVerifyProductColour(String expectedColour)  {
        new ShoppingCartPage().verifyProductColour(expectedColour);

    }
}
