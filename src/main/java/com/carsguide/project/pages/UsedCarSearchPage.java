package com.carsguide.project.pages;

import com.carsguide.project.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "makes")
    WebElement makesDropDown;
    @CacheLookup
    @FindBy(id = "models")
    WebElement modelsDropDown;
    @CacheLookup
    @FindBy(id = "locations")
    WebElement locationsDropDown;
    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement priceDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;

    public String getWelcomeText(){
        log.info("Gettting welcome text");
        log.info("Getting welcome text from New and Used car search page :" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public void selectMakesFromDropDown(String option) {
        selectByVisibleTextFromDropDown(makesDropDown, option);
        log.info("Selecting" + option + "in makes dropdown :" + makesDropDown.toString());
    }
    public void selectModelsFromDropDown(String option){
        selectByValueFromDropDown(modelsDropDown, option);
        log.info("Selecting " + option + "in models dropdwon :" + modelsDropDown.toString());
    }
    public void selectLocationFromDropDown(String option){
        selectByVisibleTextFromDropDown(locationsDropDown, option);
        log.info("Selecting " + option + "in models dropdown :" +locationsDropDown.toString());
    }
    public void selectPriceFromDropDown(String option){
        selectByVisibleTextFromDropDown(priceDropDown, option);
        log.info("Selecting " + option + "in price dropdown :" + priceDropDown.toString());
    }
    public void clickOnFindMyNextCar(){
        clickOnElement(findMyNextCarButton);
        log.info("Clicking on find My Next Car Button :"+ findMyNextCarButton.toString());
    }
}
