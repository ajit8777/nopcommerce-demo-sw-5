package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {

        // Click on login link
        homePage.clickOnLoginLink();
        // verify that "Welcome, Please Sign In!" message display
        Assert.assertEquals(loginPage.getWelcomeMessage(), "Welcome, Please Sign In!", "Login page not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        // Click on login link
        homePage.clickOnLoginLink();
        // Enter Email, Password and click on login button
        loginPage.loginDetails("prime123@gmail.com", "prime123");
        Assert.assertEquals(loginPage.getErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "Error message not displayed");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        // Click on login link
        homePage.clickOnLoginLink();
        // Enter Email, Password and click on login button
        loginPage.loginDetails("tescoextra123@gmail.com", "Prime1234");
        //Verify that LogOut link is display
        homePage.getLogoutLinkText();



    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        // Click on login link
        homePage.clickOnLoginLink();
        // Enter Email, Password and click on login button
        loginPage.loginDetails("tescoextra123@gmail.com", "Prime1234");
        // Click on LogOut Link
        homePage.clickOnLogoutLink();
        // Verify that LogIn Link Display
        homePage.getLoginLinkText();

    }

}
