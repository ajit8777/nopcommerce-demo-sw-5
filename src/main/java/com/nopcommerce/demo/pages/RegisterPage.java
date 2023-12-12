package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Random;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameErrorText;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameErrorText;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailErrorText;

    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordErrorText;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordErrorText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleButton;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dayDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearDropdown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerCompletedText;

    public String getRegisterText(){
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    public String getFirstNameErrorText(){
        return getTextFromElement(firstNameErrorText);
    }

    public String getLastNameErrorText(){
        return getTextFromElement(lastNameErrorText);
    }

    public String getEmailErrorText(){
        return getTextFromElement(emailErrorText);
    }

    public String getPasswordErrorText(){
        return getTextFromElement(passwordErrorText);
    }

    public String getConfirmPasswordErrorText(){
        return getTextFromElement(confirmPasswordErrorText);
    }

    public void verifyAllErrorTextOnRegisterPage(){
        Assert.assertTrue(getFirstNameErrorText().contains("First name is required."));
        Assert.assertTrue(getLastNameErrorText().contains("Last name is required."));
        Assert.assertTrue(getEmailErrorText().contains("Email is required."));
        Assert.assertTrue(getPasswordErrorText().contains("Password is required."));
        Assert.assertTrue(getConfirmPasswordErrorText().contains("Password is required."));
    }

    public void sendTextToFirstNameField(String name){
        sendTextToElement(firstNameField,name);
    }

    public void sendTextToLastNameField(String name){
        sendTextToElement(lastNameField,name);
    }

    public void sendTextToEmailField(String email){
        sendTextToElement(emailField,email);
    }

    public void sendTextToPasswordField(String pass){
        sendTextToElement(passwordField,pass);
    }

    public void sendTextToConfirmPasswordField(String password){
        sendTextToElement(confirmPasswordField,password);
    }

    public void clickOnFemaleRadioButton(){
        clickOnElement(femaleButton);
    }

    public void selectDayFromDropdown(String day){
        selectByValueFromDropDown(dayDropdown, day);
    }

    public void selectMonthFromDropdown(String month){
        selectByValueFromDropDown(monthDropdown, month);
    }

    public void selectYearFromDropdown(String year){
        selectByValueFromDropDown(yearDropdown, year);
    }

    public void FillAllFieldOnRegisterPage(){
        Random random = new Random();
        int num = random.nextInt(1000);

        sendTextToFirstNameField("Anushka");
        sendTextToLastNameField("Sharma");
        selectDayFromDropdown("25");
        selectMonthFromDropdown("12");
        selectYearFromDropdown("1989");
        sendTextToEmailField("viratk" + num + "@gmail.com");
        sendTextToPasswordField("Virat1234");
        sendTextToConfirmPasswordField("Virat1234");
    }

    public String getRegisterCompletedText(){
        return getTextFromElement(registerCompletedText);
    }


}
