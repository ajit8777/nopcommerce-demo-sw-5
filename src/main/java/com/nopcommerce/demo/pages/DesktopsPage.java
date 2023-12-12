package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement productSortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement productDisplay;

    @CacheLookup
    @FindBy(className = "products-container")
    WebElement productList;

    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement productBuildYourOwnComputer;

    public void ClickOnProductBuildYourOwnComputer(){
        clickOnElement(productBuildYourOwnComputer);
    }

    public String getDesktopsText(){
        return getTextFromElement(desktopsText);
    }

}
