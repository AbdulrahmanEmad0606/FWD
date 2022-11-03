package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page.P03_homePage;
import org.testng.Assert;

public class D04_searchStepDef {
    P03_homePage p03_homePage = new P03_homePage();

    @Given("user go to home page2")
    public void userGoToHomePage2() {
        System.out.print("User in home page");
    }

    @When("user search with product name {string}")
    public void userLoginWithProductName(String arg0) {
        p03_homePage.getSearchInput().sendKeys(arg0);
    }

    @And("user press on search button")
    public void userPressOnSearchButton() {
        p03_homePage.getSearchBtn().click();
    }

    @Then("user get the search results successfully")
    public void userGetTheSearchResultsSuccessfully() {
        Assert.assertTrue(p03_homePage.verifySearchFScenario());
    }

    @When("user search with SKU name {string}")
    public void userLoginWithSKUName(String arg0) {
        p03_homePage.getSearchInput().sendKeys(arg0);
    }


    @Then("user can find the SKU of the product")
    public void userCanFindTheSKUOfTheProduct() {
        Assert.assertTrue(p03_homePage.ValidateSecondScenario());
    }


    @And("user press on search button for second scenario")
    public void userPressOnSearchButtonForSecondScenario() {
        p03_homePage.getSearchBtn().click();
    }
}
