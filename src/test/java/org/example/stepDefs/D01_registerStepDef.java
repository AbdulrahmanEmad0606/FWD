package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page.P01_register;
import org.example.Page.P02_register;
import org.testng.Assert;

import java.util.Date;
import java.util.Random;

public class D01_registerStepDef {
    P01_register p01_register = new P01_register();
    P02_register p02_register = new P02_register();

    @Given("user go to register page")
    public void userGoToRegisterPage() {
        p01_register.registerLink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        p02_register.selectedGender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        p02_register.getFirstNameField().sendKeys(arg0);
        p02_register.getLastNameField().sendKeys(arg1);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        p02_register.getDayOfDateOfBirth().selectByVisibleText("6");
        p02_register.getMonthOfDateOfBirth().selectByVisibleText("June");
        p02_register.getYearOfDateOfBirth().selectByVisibleText("1998");
    }

    @And("user enter {string} field")
    public void userEnterField(String arg0) {
        Date date = new Date();
        p02_register.getEmailField().sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        p02_register.getPasswordField().sendKeys(arg0);
        p02_register.getConfirmPasswordField().sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        p02_register.getRegBtn().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        Assert.assertTrue(p02_register.getMessage());
    }
}
