package Tests;

import Pages.P01_LogInPage;
import Pages.P02_HomePage;
import Pages.P09_ShoppingCartPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static DriverFactory.DriverFactory.*;
import static Tests.TC01_LogInTest.PASSWORD;
import static Tests.TC01_LogInTest.USERNAME;
import static Utilities.DataUtils.getPropertyData;
import static Utilities.LogsUtils.info;
import static Utilities.Utility.implicitWait;
import static Utilities.Utility.waitForLoaderToDisappear;
import Listeners.IInvokedListenersClass;
import Listeners.ITestListenersClass;

@Listeners({IInvokedListenersClass.class, ITestListenersClass.class})
public class TC09_ShoppingCartTest {

    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setup() throws IOException {
        setUpDriver(getPropertyData("environment", "Browser"));
        info("starting Edge browser");
        getDriver().get(getPropertyData("environment", "LoginPage_URL"));
        info("get the URL and loading the page");
        implicitWait(getDriver(), 15);
        //waitForLoaderToDisappear(getDriver());

    }
    //TODO: Add test methods for Shopping Cart functionalities
    //TODO: Shopping Cart is empty
    @Test
    public void shoppingCartIsEmpty() {
        new P02_HomePage(getDriver())
                .clickOnShoppingCart();
         softAssert.assertTrue(new P09_ShoppingCartPage(getDriver()).isShoppingCartIsEmptyLabelDisplayed(),
                "Shopping cart is not empty");
        softAssert.assertAll();
    }

    //TODO: Shopping Cart : Continue Shopping Button
    @Test
    public void verifyContinueShoppingButton() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnShoppingCart()
                .clickOnContinueShoppingButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(), getPropertyData("environment", "HomePage_URL"),
                "Continue Shopping button did not redirect to home page");
        softAssert.assertAll();
    }
    //TODO: Shopping Cart : check edit Button
    @Test
    public void verifyEditButton() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ENERGYSTAR()
                .clickOnAddToCartButton()
                .clickOnShoppingCart()
                .clickOnProductEditButton_P1()
                .clickSecondColorRadioButton()
                .clickOnAddQuantityButton(3);
        softAssert.assertTrue(getDriver().getCurrentUrl().contains("product/9"));
        info("The user is redirected to the HP Chromebook 14 G1 (ENERGY STAR) product page.");
        softAssert.assertAll();

    }

    //TODO: Shopping Cart : check remove Button
    @Test
    public void verifyRemoveButton() throws IOException {

        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ENERGYSTAR()
                .clickOnAddToCartButton()
                .clickOnShoppingCart()
                .clickOnProductRemoveButton_P1();
        softAssert.assertTrue(new P09_ShoppingCartPage(getDriver()).isShoppingCartIsEmptyLabelDisplayed(),
                "Shopping cart is not empty after removing the product");
        info("The user is redirected to the Shopping Cart page after removing the product.");
        softAssert.assertAll();
    }

    //TODO: Shopping Cart : check Checkout Button
    @Test
    public void verifyCheckoutButton() throws IOException {
        waitForLoaderToDisappear(getDriver());
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ENERGYSTAR()
                .clickOnAddToCartButton()
                .clickOnShoppingCart()
                .clickOnCheckOutButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "ORDER_PAYMENT_URL"),
                "The user is not redirected to the Shipping Details page after clicking on the 'Checkout' button.");
        info("The user is redirected to the Shipping Details page after clicking on the 'Checkout' button.");
        softAssert.assertAll();
    }

    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
