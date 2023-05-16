package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GearTest {
    @Given("^I move hover on Gear$")
    public void iMoveHoverOnGear() {
        new HomePage().mouseHoverOnGear();
    }

    @When("^I click on Bags$")
    public void iClickOnBags() {
        new HomePage().clickOnBags();
    }

    @And("^I click on Overnight Duffle$")
    public void iClickOnOvernightDuffle() {
        new BagsPage().clickOnOvernightDuffle();
    }

    @And("^I verify the title \"([^\"]*)\"$")
    public void iVerifyTheTitle(String title)  {
        new OvernightDufflepage().verifyTextMessage(title);

    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty)  {
        new OvernightDufflepage().changeQuantity(qty);

    }

    @And("^I click on add to Cart$")
    public void iClickOnAddToCart() {
        new OvernightDufflepage().clickOnAddToCart();
    }

    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String expectedMessage)  {
        new OvernightDufflepage().verifyText(expectedMessage);

    }

    @And("^I click on Shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new OvernightDufflepage().clickOnShoppingCartLink();
    }

    @And("^I verify Product name \"([^\"]*)\"$")
    public void iVerifyProductName(String expectedName)  {
        new OvernightDufflepage().verifyProductName(expectedName);

    }

    @And("^I verify Product price \"([^\"]*)\"$")
    public void iVerifyProductPrice(String expectedPrice)  {
        new OvernightDufflepage().verifyProductPrice(expectedPrice);

    }

    @And("^I change product quantity \"([^\"]*)\"$")
    public void iChangeProductQuantity(String qty)  {
        new OvernightDufflepage().changeProductQuantity(qty);

    }

    @And("^I click on update$")
    public void iClickOnUpdate() {
        new OvernightDufflepage().clickOnUpdate();
    }

    @Then("^I verify product price \"([^\"]*)\"$")
    public void iVerifyFinalProductPrice(String expectedChangePrice)  {
        new OvernightDufflepage().verifyProductsPrice(expectedChangePrice);

    }
}
