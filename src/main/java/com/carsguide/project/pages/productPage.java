package com.carsguide.project.pages;

import com.carsguide.project.utility.Utility;
import io.cucumber.messages.types.Product;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class productPage extends Utility {
    private static final Logger log = LogManager.getLogger(Product.class.getName());
    @CacheLookup
    @FindBy (xpath = "//h1[@class = 'h1Text search--title']")
    WebElement productPageTitle;
    public String getTitleOfThePage(){
        log.info("Getting title of the page and verifying the make name : " +
                productPageTitle.toString());return getTextFromElement(productPageTitle);
   }
   public boolean isTitleAvailable(){
        return verifyThatElementIsDisplayed(productPageTitle);
   }
}
