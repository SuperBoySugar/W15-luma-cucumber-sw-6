package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantsPage extends Utility {

//    By cronusYogaPant = By.xpath("//a[contains(text(),'Cronus Yoga Pant')]");
//    By size = By.cssSelector("#option-label-size-143-item-175");
//    By black = By.cssSelector("#option-label-color-93-item-49");
//    By addToCart = By.xpath("//span[text() = 'Add to Cart']");
//    By textMessage = By.xpath("//div[contains(text(),'You added Cronus Yoga Pant  to your ')]");
//    By shoppingCart = By.xpath("//a[text()='shopping cart']");

    private static final Logger log = LogManager.getLogger(PantsPage.class.getName());

    public PantsPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy (xpath = "//a[contains(text(),'Cronus Yoga Pant')]")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy (css = "#option-label-size-143-item-175")
    WebElement size;

    @CacheLookup
    @FindBy (css = "#option-label-color-93-item-49")
    WebElement black;

    @CacheLookup
    @FindBy (xpath = "//span[text() = 'Add to Cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy (xpath = "//div[contains(text(),'You added Cronus Yoga Pant  to your ')]")
    WebElement textMessage;

    @CacheLookup
    @FindBy (xpath = "//a[text()='shopping cart']")
    WebElement shoppingCart;

    // Mouse hover on product name
    public void mouseHoverOnProductName() {
       log.info("MouseHover On Product Name: " .toString() );
        mouseHoverToElement(cronusYogaPant);
    }

    // Click on size
    public void clickOnsize() {
       log.info("Click On Size: " .toString() );
        clickOnElement(size);
    }

    // Select Black Colour
    public void clickOnColourBlack() {
       log.info("Click On Colour Black: " .toString() );
        clickOnElement(black);
    }

    // Click on Add to cart button
    public void clickOnAddToCart() {
       log.info("Click On Add To Cart: " .toString() );
        clickOnElement(addToCart);
    }

    // Verifying product added to cart message
    public void verifyTextMessage(String expectedMessage) {
       log.info("Verify Text Message: " + expectedMessage.toString() );
        verifyElements(textMessage,expectedMessage,"Error");
    }

    // Clicking on Shopping cart button
    public void clickOnShoppingCart(){
       log.info("Click On Shopping Cart: " .toString() );
        clickOnElement(shoppingCart);
    }
}
