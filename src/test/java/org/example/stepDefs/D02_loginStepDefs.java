package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page.P02_login;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D02_loginStepDefs {
    P02_login p02_login=new P02_login();
    @Given("user go to login page")
    public void userGoToRegisterPage() {
        p02_login.openLoginLink();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {
        p02_login.getEmailField().sendKeys(arg0);
        p02_login.getPasswordField().sendKeys(arg1);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        p02_login.loginBtn().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
      Assert.assertTrue(p02_login.verifyFirstScenario());
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        p02_login.getEmailField().sendKeys(arg0);
        p02_login.getPasswordField().sendKeys(arg1);
        
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        Assert.assertTrue(p02_login.verifySecondScenario());
    }
}
