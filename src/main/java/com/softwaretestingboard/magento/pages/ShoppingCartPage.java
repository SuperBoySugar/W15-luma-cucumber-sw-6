package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {

//    By textShoppingCart = By.xpath("//span[text()='Shopping Cart']");
//    By productName = By.cssSelector("td[class='col item'] strong[class='product-item-name']");
//    By productSize = By.xpath("//dd[contains(text(),'32')]");
//    By productColour = By.xpath("//dd[contains(text(),'Black')]");

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy (xpath = "//span[text()='Shopping Cart']")
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy (css = "td[class='col item'] strong[class='product-item-name']")
    WebElement productName;

    @CacheLookup
    @FindBy (xpath = "//dd[contains(text(),'32')]")
    WebElement productSize;

    @CacheLookup
    @FindBy (xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour;


    // Verifying text shopping cart
    public void verifyTextShoppingCart(String expectedText){
        verifyElements(textShoppingCart,expectedText,"Error");
        log.info("Verify Shopping Cart: " + expectedText.toString() );
    }
    // Verify Product Name
    public void verifyProductName(String expectedName){
        verifyElements(productName, expectedName,"Error");
        log.info("Verify Product Name: " + expectedName.toString() );
    }
    // Verify product size
    public void verifyProductSize(String expectedSize){
        verifyElements(productSize,expectedSize,"Error");
        log.info("Verify Product Size: " + expectedSize.toString() );
    }
    // Verify Product colour
    public void verifyProductColour(String expectedcolour){
        verifyElements(productColour,expectedcolour,"Error");
        log.info("Verify Product Colour: " + expectedcolour.toString() );
    }

}
