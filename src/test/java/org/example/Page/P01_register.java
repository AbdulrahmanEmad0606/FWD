package org.example.Page;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerLink(){
        return Hooks.driver.findElement(By.className("ico-register"));
    }
}
