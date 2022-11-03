package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.Page.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D07_followUsStepDef {
    P03_homePage p03_homePage=new P03_homePage();
    @Given("user go to home page5")
    public void userGoToHomePage5() {
        System.out.print("User in home page");
    }

    @When("user navigated to the facebook link")
    public void userNavigatedToTheFacebookLink() {
        p03_homePage.getFacebook().click();
    }

    @Then("the user must be redirected to the facebook page")
    public void theUserMustBeRedirectedToTheFacebookPage() {
     Assert.assertTrue(p03_homePage.switchToNewTabForFacebook());
    }

    @When("user navigated to the twitter link")
    public void userNavigatedToTheTwitterLink() {
        p03_homePage.getTwitter().click();
    }

    @Then("the user must be redirected to the twitter page")
    public void theUserMustBeRedirectedToTheTwitterPage() {
        Assert.assertTrue(p03_homePage.switchToNewTabForTwitter());
    }
    @When("user navigated to the rss link")
    public void userNavigatedToTheRssLink() {
        p03_homePage.getRss().click();
    }
    @Then("the user must be redirected to the rss page")
    public void theUserMustBeRedirectedToTheRssPage() {
        Assert.assertTrue(p03_homePage.switchToNewTabForRss());
    }

    @When("user navigated to the youtube link")
    public void userNavigatedToTheYoutubeLink() {
        p03_homePage.getYoutube().click();
    }

    @Then("the user must be redirected to the youtube page")
    public void theUserMustBeRedirectedToTheYoutubePage() {
        Assert.assertTrue(p03_homePage.switchToNewTabForYoutube());
    }
}
