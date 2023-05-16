package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OvernightDufflepage extends Utility {

//    By textMessage = By.xpath("//span[contains(text(),'Overnight Duffle')]");
//    By quantity = By.id("qty");
//    By addToCart = By.id("product-addtocart-button");
//    By text = By.xpath("//div[contains(text(),'You added Overnight Duffle to your ')]");
//    By shoppingCartLink = By.xpath("//a[text()='shopping cart']");
//    By productName = By.cssSelector("td[class='col item'] strong[class='product-item-name']");
//    By productPrize = By.xpath("//td[@class='col subtotal']//span[@class='price']");
//    By changeQuantity = By.cssSelector("td[class='col qty'] input[class*='input-text qty']");
//    By updateShoppingCart = By.xpath("//span[text()='Update Shopping Cart']");
//    By productsPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][text()='$225.00']");
//
private static final Logger log = LogManager.getLogger(OvernightDufflepage.class.getName());

    public OvernightDufflepage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement textMessage;

    @CacheLookup
    @FindBy (id = "qty")
    WebElement quantity;

    @CacheLookup
    @FindBy (id = "product-addtocart-button")
    WebElement addToCart;

    @CacheLookup
    @FindBy (xpath = "//div[contains(text(),'You added Overnight Duffle to your ')]")
    WebElement text;

    @CacheLookup
    @FindBy (xpath = "//a[text()='shopping cart']")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(css = "td[class='col item'] strong[class='product-item-name']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[@class='price']")
    WebElement productsPrize;

    @CacheLookup
    @FindBy(css = "td[class='col qty'] input[class*='input-text qty']")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][text()='$225.00']")
    WebElement productsPrice;

    // Verifying text
    public void verifyTextMessage(String expectedText){
        verifyElements(textMessage,expectedText,"Error");
        log.info("Verify Text OvernightDuffle: " + expectedText.toString() );
    }
    // Changing quantity
    public void changeQuantity(String qty){
        sendTextToElement(quantity, Keys.DELETE + qty);
        log.info("Change Quantity: " + qty.toString() );
    }
    // Clicking on Add to Cart
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
        log.info("Click On Add To Cart: " .toString() );
    }
    // verify message
    public void verifyText(String expectedMessage){
        verifyElements(text,expectedMessage,"Error");
        log.info("Verify TextMessage: " + expectedMessage.toString() );
    }
    // Clicking on Shopping cart link
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
        log.info("Click On Shopping Cart Link: " .toString() );
    }
    // Verifying product name
    public void verifyProductName(String expectedText){
        verifyElements(productName,expectedText,"Error");
        log.info("Verify Product Name: " + expectedText.toString() );
    }
    // verifying product price
    public void verifyProductPrice(String expectedPrice){
        verifyElements(productsPrize,expectedPrice,"Error");
        log.info("Verify Products Prize: " + expectedPrice.toString() );
    }
    // Changing product quantity
    public void changeProductQuantity(String qty1){
        sendTextToElement(changeQuantity,Keys.DELETE + qty1);
        log.info("Change Product Quantity: " + qty1.toString() );
    }
    // Click on Update button
    public void clickOnUpdate(){
        clickOnElement(updateShoppingCart);
        log.info("Click On Update Shopping Cart: " .toString() );
    }
    // Verifying product price
    public void verifyProductsPrice(String expectedChangePrice){
        verifyElements(productsPrice,expectedChangePrice,"Error");
        log.info("Verify Products Price: " + expectedChangePrice.toString() );
    }
}

