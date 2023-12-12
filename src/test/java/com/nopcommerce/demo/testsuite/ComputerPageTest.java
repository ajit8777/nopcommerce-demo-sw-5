package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();


    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        //Click on Computer tab
        homePage.clickOnComputersLink();
        // Verify "Computer"text
        Assert.assertTrue(computerPage.getComputersText().contains("Computers"));
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        // Click on Computer tab
        homePage.clickOnComputersLink();
        // Click on Desktops link
        computerPage.clickOnDesktopsLink();
        // Verify "Desktops" text
        Assert.assertTrue(desktopsPage.getDesktopsText().contains("Desktops"));
    }

    @Test(groups = {"regression"}, dataProvider = "build computer", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        // Click on Computer tab
        homePage.clickOnComputersLink();
        // Click on Desktops link
        computerPage.clickOnDesktopsLink();
        // Click on product name "Build your own computer"
        desktopsPage.ClickOnProductBuildYourOwnComputer();
        // Select processor "processor,RAM,HDD,OS and Software"
        buildYourOwnComputerPage.buildYourOwnComputer(processor, ram, hdd, os, software);
        // Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCart();
        // Verify message "The product has been added to your shopping cart"
        Assert.assertEquals(buildYourOwnComputerPage.getContentMessage(), "The product has been added to your shopping cart", "The product not added to cart");

    }

}
