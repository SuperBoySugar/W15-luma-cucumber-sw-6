package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagsPage extends Utility {

    private static final Logger log = LogManager.getLogger(BagsPage.class.getName());

    public BagsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Overnight Duffle ')]")
    WebElement overnightDuffle;

    // Click on Overnight Duffle bag
    public void clickOnOvernightDuffle(){
       log.info("Click On OvernightDuffle: " .toString() );
        clickOnElement(overnightDuffle);


    }
}
