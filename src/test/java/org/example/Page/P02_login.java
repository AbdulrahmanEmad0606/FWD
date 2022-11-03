package org.example.Page;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class P02_login {
    public void openLoginLink(){
        WebElement loginBtn = Hooks.driver.findElement(By.className("ico-login"));
        loginBtn.click();
    }
    public WebElement getEmailField(){
        WebElement emailField=Hooks.driver.findElement(By.id("Email"));
        return emailField;
    }
    public WebElement getPasswordField(){
        WebElement passwordField=Hooks.driver.findElement(By.id("Password"));
        return passwordField;
    }
    public WebElement loginBtn(){
        WebElement loginBtn=Hooks.driver.findElement(By.className("login-button"));
        return loginBtn;
    }
    public boolean verifyFirstScenario(){
        String currentUrl=Hooks.driver.getCurrentUrl();
        boolean myAccount=Hooks.driver.findElement(By.className("ico-account")).isDisplayed();
        boolean fScenario = false;
        if (currentUrl.equals("https://demo.nopcommerce.com/")&&myAccount){
            fScenario=true;
        }
        return fScenario;
    }
    public boolean verifySecondScenario(){
        WebElement element = Hooks.driver.findElement(By.className("message-error"));
        String message = element.getText();
        String s = element.getCssValue("color");
        String c = Color.fromString(s).asHex();
        boolean sScenario=false;
        if (message.contains("Login was unsuccessful")&& c.equals("#e4434b")){
            sScenario=true;
        }
        return sScenario;
    }
}
