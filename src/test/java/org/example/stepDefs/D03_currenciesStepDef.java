package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page.P03_homePage;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage p03_homePage=new P03_homePage();
    @Given("user go to home page")
    public void userGoToHomePage() {
        System.out.print("User in home page");
    }

    @When("user select currency type")
    public void userSelectCurrencyType() {
        p03_homePage.dropDown().selectByVisibleText("Euro");
    }

    @Then("products price in selected currency")
    public void productsPriceInSelectedCurrency() {
        Assert.assertTrue(p03_homePage.scenarioVerify());
    }
}
