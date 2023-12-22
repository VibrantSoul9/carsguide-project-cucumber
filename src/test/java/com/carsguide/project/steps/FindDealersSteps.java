package com.carsguide.project.steps;

import com.carsguide.project.pages.CarDealersPage;
import com.carsguide.project.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FindDealersSteps {
    @And("I click ‘Find a Dealer’")
    public void iClickFindADealer() {
        new HomePage().clickOnUsedOptionInBuyAndSellTopMenu();
    }

    @Then("I navigate to ‘car-dealers’ page")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals(new CarDealersPage().getWelcomeText(), "Find a Car Dealership Ner You");
    }

    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(String dealerName) {
       Assert.assertEquals(new CarDealersPage().isCarDealerNameAvailable(dealerName), dealerName);
        }
    }

