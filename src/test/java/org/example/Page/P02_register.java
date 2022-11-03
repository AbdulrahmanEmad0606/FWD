package org.example.Page;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class P02_register {
    public WebElement selectedGender(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement getFirstNameField(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement getLastNameField(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public Select getDayOfDateOfBirth(){
        Select select=new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        return select;
    }
    public Select getMonthOfDateOfBirth(){
        Select select2=new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        return select2;
    }
    public Select getYearOfDateOfBirth(){
        Select select3=new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        return select3;
    }
    public WebElement getEmailField(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement getPasswordField(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement getConfirmPasswordField(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement getRegBtn(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public boolean getMessage(){
        WebElement element=Hooks.driver.findElement(By.cssSelector(".result"));
        String text= element.getText();
        String s = element.getCssValue("color");
        String c = Color.fromString(s).asHex();
        boolean x = false;
        if (text.equals("Your registration completed") && c.equals("#4cb17c")){
            x=true; 
        }
        return x;
    }
}
