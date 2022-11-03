package org.example.Page;

import io.cucumber.java.eo.Se;
import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class P03_homePage {
    public Select dropDown() {
        Select options = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        return options;
    }

    public boolean scenarioVerify() {
        List<WebElement> prices = Hooks.driver.findElements(By.className("price"));
        boolean euro = false;
        for (WebElement price : prices) {
            if (price.getText().contains("€")) {
                euro = true;
            }
        }
        return euro;
    }

    public WebElement getSearchInput() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement getSearchBtn() {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }

    public String getSearchInputValue() {
        String val = Hooks.driver.findElement(By.id("q")).getAttribute("value");
        return val;
    }

    public boolean verifySearchFScenario() {
        List<WebElement> results = Hooks.driver.findElements(By.cssSelector(".product-title a"));
        String val = getSearchInputValue();
        boolean sVerify = false;
        for (WebElement result : results) {
            if (result.getText().toLowerCase().contains(val)) {
                sVerify = true;
            }
        }
        System.out.print(results.size());
        return sVerify;
    }

    public boolean ValidateSecondScenario() {
        String val = getSearchInputValue();
        Hooks.driver.findElement(By.className("product-item")).click();
        String val1 = Hooks.driver.findElement(By.cssSelector(".sku .value")).getText();
        System.out.print(val + val1);
        boolean sVerify = false;
        if (val.toLowerCase().contains(val1.toLowerCase())) {
            sVerify = true;
        }
        return sVerify;
    }

    ///////////////////////////////////////////
    /*Hover*/
    public WebElement getMainCategory() {
        return Hooks.driver.findElement(By.xpath("//ul[contains(@class,'notmobile')]/li[1]/a"));
    }

    public WebElement getSubCategory() {
        return Hooks.driver.findElement(By.xpath("//ul[contains(@class,'sublist')]/li[1]/a"));
    }

    public boolean verifyHoverScenario() {
        String header = Hooks.driver.findElement(By.cssSelector(".page-title h1")).getText().toLowerCase();
        String pageTitle = Hooks.driver.getTitle().toLowerCase();
        boolean Sverify = false;
        if (pageTitle.contains(header)) {
            Sverify = true;
        }
        return Sverify;
    }

    ///////////////////////////////////////////
    /*Slider*/
    public WebElement getNokiaSlider() {
        return Hooks.driver.findElement(By.xpath("//div[@id='nivo-slider']/a[1]"));
    }

    public boolean validatePageUrl() {
        String currentUrl = Hooks.driver.getCurrentUrl().toLowerCase();
        String validUrl = "https://demo.nopcommerce.com/nokia-lumia-1020".toLowerCase();
        boolean Sverify = false;
        if (currentUrl.equals(validUrl)) {
            Sverify = true;
        }
        return Sverify;
    }
    public WebElement getIphoneSlider() {
        WebElement iphoneSlider=Hooks.driver.findElement(By.xpath("//div[@id='nivo-slider']/a[2]"));
        WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nivo-slider']/a[2]")));
        return iphoneSlider;
    }
    public boolean validatePageUrlForIphone() {
        String currentUrl = Hooks.driver.getCurrentUrl().toLowerCase();
        String validUrl = "https://demo.nopcommerce.com/iphone-6".toLowerCase();
        boolean Sverify = false;
        if (currentUrl.equals(validUrl)) {
            Sverify = true;
        }
        return Sverify;
    }
    public WebElement getFacebook(){
        return Hooks.driver.findElement(By.className("facebook"));
    }
    public boolean switchToNewTabForFacebook(){
        var windows = Hooks.driver.getWindowHandles();
        windows.forEach(Hooks.driver.switchTo()::window);
        boolean Sverify=false;
        if(Hooks.driver.getCurrentUrl().equals("https://www.facebook.com/nopCommerce")){
            Sverify=true;
        }
        return Sverify;
    }
    public WebElement getTwitter(){
        return Hooks.driver.findElement(By.className("twitter"));
    }
    public boolean switchToNewTabForTwitter(){
        var windows = Hooks.driver.getWindowHandles();
        windows.forEach(Hooks.driver.switchTo()::window);
        boolean Sverify=false;
        if(Hooks.driver.getCurrentUrl().equals("https://twitter.com/nopCommerce")){
            Sverify=true;
        }
        return Sverify;
    }


    public WebElement getRss(){
        return Hooks.driver.findElement(By.className("rss"));
    }
    public boolean switchToNewTabForRss(){
        var windows = Hooks.driver.getWindowHandles();
        windows.forEach(Hooks.driver.switchTo()::window);
        boolean Sverify=false;
        if(Hooks.driver.getCurrentUrl().equals("https://www.rss.com/nopCommerce")){
            Sverify=true;
        }
        return Sverify;
    }
    public WebElement getYoutube(){
        return Hooks.driver.findElement(By.className("youtube"));
    }
    public boolean switchToNewTabForYoutube(){
        var windows = Hooks.driver.getWindowHandles();
        windows.forEach(Hooks.driver.switchTo()::window);
        boolean Sverify=false;
        if(Hooks.driver.getCurrentUrl().equals("https://www.youtube.com/user/nopCommerce")){
            Sverify=true;
        }
        return Sverify;
    }

//////////////////////////////////////////////
    // add to wishlist

    public WebElement getItem(){
        return Hooks.driver.findElement(By.cssSelector(".product-item[data-productid=\"4\"]"));
    }
    public WebElement getWishlistItem(){
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-4"));
    }
    public boolean validateAddToWishlistSuccessfully(){
        WebDriverWait wait= new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        String successMessage = "The product has been added to your";
        String successMessageElement = Hooks.driver.findElement(By.className("content")).getText();
        WebElement parentSuccess = Hooks.driver.findElement(By.className("success"));
        String s = parentSuccess.getCssValue("background-color");
        String c = Color.fromString(s).asHex();
        boolean Sverify=false;
        if (successMessageElement.contains(successMessage)&&c.equals("#4bb07a")){
            Sverify=true;
        }
        return  Sverify;
    }
    public WebElement getCloseElement(){
        return Hooks.driver.findElement(By.className("close"));
    }
    public WebElement getWishListBtn(){
        WebDriverWait wait= new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-links']/ul/li[3]/a")));
        System.out.print( Hooks.driver.findElement(By.xpath("//div[@class='header-links']/ul/li[3]/a")).getText());
        return Hooks.driver.findElement(By.xpath("//div[@class='header-links']/ul/li[3]/a"));
    }
    public boolean verifyQuantity(){
        WebElement quantity = Hooks.driver.findElement(By.className("qty-input"));
        String getVal=quantity.getAttribute("value");
        int number = Integer.parseInt(getVal);
        System.out.print(number);
        boolean sVerify=false;
        if (number>0){
            sVerify=true;
        }
        return sVerify;
    }
}
