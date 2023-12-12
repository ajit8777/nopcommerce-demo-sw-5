package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement productNameText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement HDD320GBRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement HDD400GBRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_4")
    WebElement OSVistaHomeRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_4")
    WebElement OSRadioButton;

    @CacheLookup
    @FindBy(name = "product_attribute_5")
    WebElement softwareCheckBox;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement contentMessage;

    public String getProductNameText() {
        return getTextFromElement(productNameText);
    }

    public void selectProcessorFromDropdown(String processor) {
        selectByVisibleTextFromDropDown(processorDropdown, processor);
    }

    public void selectRamFromDropdown(String ram) {
        selectByVisibleTextFromDropDown(ramDropdown, ram);
    }

    public void clickOnRadioButtonOfHDD(String hdd) {
        clickOnElement(HDD320GBRadioButton);
    }

    public void clickOnOSRadioButton(String os) {
        clickOnElement(OSRadioButton);
    }

    public void clickOnCheckBox(String check) {
        clickOnElement(softwareCheckBox);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getContentMessage() {
        return getTextFromElement(contentMessage);
    }

    public void buildYourOwnComputer(String processor, String ram, String hdd, String os, String software){
        selectProcessorFromDropdown(processor);
        selectRamFromDropdown(ram);
        clickOnRadioButtonOfHDD(hdd);
        clickOnOSRadioButton(os);
        clickOnCheckBox(software);

    }

}
