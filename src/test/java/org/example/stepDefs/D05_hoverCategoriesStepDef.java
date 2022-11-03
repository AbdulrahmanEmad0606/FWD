package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class D05_hoverCategoriesStepDef {
    P03_homePage p03_homePage=new P03_homePage();
    @Given("user go to home page3")
    public void userGoToHomePage3() {
        System.out.print("User in home page");
    }

    @When("user hover on the main category")
    public void userHoverOnTheMainCategory() {
        Actions a =new Actions(Hooks.driver);
        a.moveToElement(p03_homePage.getMainCategory()).build().perform();
    }

    @And("click on the sub category")
    public void clickOnTheSubCategory() {
        p03_homePage.getSubCategory().click();
    }

    @Then("the page title contains the subcategory name")
    public void thePageTitleContainsTheSubcategoryName() {
        Assert.assertTrue(p03_homePage.verifyHoverScenario());
    }
}
