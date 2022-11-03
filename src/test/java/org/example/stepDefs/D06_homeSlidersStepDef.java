package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage p03_homePage=new P03_homePage();
    @Given("user go to home page4")
    public void userGoToHomePage4() {
        System.out.print("User in home page");
    }

    @When("user clicks on the Nokia slider")
    public void userClicksOnTheNokiaSlider() {
        p03_homePage.getNokiaSlider().click();
    }

    @Then("the page url must be contains Nokia")
    public void thePageUrlMustBeContainsNokia() {
        Assert.assertTrue(p03_homePage.validatePageUrl());
    }

    @When("user clicks on the iphone slider")
    public void userClicksOnTheIphoneSlider() {
        p03_homePage.getIphoneSlider().click();
    }

    @Then("the page url must be contains iphone")
    public void thePageUrlMustBeContainsIphone() {
        Assert.assertTrue(p03_homePage.validatePageUrlForIphone());
    }
}
