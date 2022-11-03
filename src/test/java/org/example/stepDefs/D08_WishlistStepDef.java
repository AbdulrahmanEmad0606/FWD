package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef{
    P03_homePage p03_homePage=new P03_homePage();
    @Given("user go to home page6")
    public void userGoToHomePage6() {
        System.out.print("User in home page");
    }

    @When("user navigated to the product")
    public void userNavigatedToTheProduct() {
        p03_homePage.getItem().click();
    }
    @And("user add the item to the wishlist")
    public void userAddTheItemToTheWishlist() {
        p03_homePage.getWishlistItem().click();
    }

    @Then("the product added to the wishlist successfully")
    public void theProductAddedToTheWishlistSuccessfully() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(p03_homePage.validateAddToWishlistSuccessfully());
    }

    @And("user close the success message")
    public void userCloseTheSuccessMessage() {
        p03_homePage.getCloseElement().click();
    }

    @And("user clicks on the Wishlist button")
    public void userClicksOnTheWishlistButton() {
      p03_homePage.getWishListBtn().click();
    }

    @Then("the Qty must be greater than zero")
    public void theQtyMustBeGreaterThanZero() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(p03_homePage.verifyQuantity());
    }
}