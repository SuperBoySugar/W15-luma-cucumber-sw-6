package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomenTest {
    @Given("^I mouse hover on Women$")
    public void iMouseHoverOnWomen() throws InterruptedException {
        new HomePage().mouseHoverOnWomen();
    }

    @When("^I mouse hover on Tops$")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTops();
    }

    @And("^I mouse hover on Jackets and click$")
    public void iMouseHoverOnJacketsAndClick() {
        new HomePage().mouseHoverOnJacketsAndClick();
    }

    @And("^I select on Sort By Product Name \"([^\"]*)\"$")
    public void iSelectOnSortByProductName(String product)  {
        new JacketsPage().selectSortByProductName(product);


    }

    @And("^I verify product are in ascending order$")
    public void iVerifyProductAreInAscendingOrder() {
        new JacketsPage().verifyProductAreInAscendingOrder();
    }

    @And("^I select on Sort By Price \"([^\"]*)\"$")
    public void iSelectOnSortByPrice(String price)  {
        new JacketsPage().selectSortByPrice(price);

    }

    @Then("^I verify product are in low to high$")
    public void iVerifyProductAreInLowToHigh() {
        new JacketsPage().verifyProductsAreSortedByLowToHigh();
    }
}
