package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = " Notebooks ")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(linkText = " Software ")
    WebElement softwareLink;

    public String getComputersText(){
        return getTextFromElement(computersText);
    }

    public void clickOnDesktopsLink(){
        clickOnElement(desktopsLink);
    }

    public void clickOnNotebooksLink(){
        clickOnElement(notebooksLink);
    }

    public void clickOnSoftwareLink(){
        clickOnElement(softwareLink);
    }
}
