package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @CacheLookup
    @FindBy(linkText = "My account")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void getNopCommerceLogo() {
        clickOnElement(nopCommerceLogo);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
    }

    public void clickOnComputersLink() {
        clickOnElement(computersLink);
    }

    public boolean getLogoutLinkText() {
        return verifyThatElementIsDisplayed(logoutLink);
    }
    public boolean getLoginLinkText() {
        return verifyThatElementIsDisplayed(loginLink);
    }


}
