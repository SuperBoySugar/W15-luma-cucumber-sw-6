package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
//    By women = By.xpath("//span[text()='Women']");
//    By tops = By.cssSelector("a[id='ui-id-9'] span:nth-child(1)");
//    By jackets = By.cssSelector("a[id='ui-id-11'] span:nth-child(1)");
//    By men = By.xpath("//span[normalize-space()='Men']");
//    By bottom = By.cssSelector("a[id='ui-id-18'] span:nth-child(1)");
//    By pants = By.cssSelector("a[id='ui-id-23'] span:nth-child(1)");
//    By gear = By.cssSelector("a[id='ui-id-6'] span:nth-child(2)");
//    By bags = By.xpath("//span[text()='Bags']");

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//span[text()='Women']")
    WebElement women;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-9'] span:nth-child(1)")
    WebElement tops;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-11'] span:nth-child(1)")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement men;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-18'] span:nth-child(1)")
    WebElement bottom;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-23'] span:nth-child(1)")
    WebElement pants;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-6'] span:nth-child(2)")
    WebElement gear;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Bags']")
    WebElement bags;


    public void mouseHoverOnWomen() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(women);
        log.info("MouseHover on Women: " .toString() );

    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
        log.info("MouseHover on Tops: " .toString() );

    }

    public void mouseHoverOnJacketsAndClick(){
        mouseHoverToElementAndClick(jackets);
        log.info(" MouseHove and Click On Jackets: " .toString() );

    }

    // Mouse hover on Men
    public void mouseHoverOnMen() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(men);
        log.info("MouseHover on Men: " .toString() );

    }
    // Mouse hover on Bottom tab
    public void mouseHoverOnBottom(){
        mouseHoverToElement(bottom);
        log.info("MouseHover On Bottom: ".toString() );

    }
    // Click on Pants
    public void clickOnPants(){
        clickOnElement(pants);
        log.info("Click On Pants: " .toString() );
    }
    // Mouse hover on Gear
    public void mouseHoverOnGear(){
        mouseHoverToElement(gear);
        log.info("MouseHover On Gear: " .toString() );
    }
    // Click on Bags
    public void clickOnBags(){
        clickOnElement(bags);
        log.info("Click On Bags: " .toString() );
    }


}
