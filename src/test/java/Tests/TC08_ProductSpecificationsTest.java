package Tests;

import Pages.P02_HomePage;
import Pages.P08_ProductSpecificationsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static DriverFactory.DriverFactory.*;
import static Utilities.DataUtils.getPropertyData;
import static Utilities.LogsUtils.info;
import static Utilities.Utility.implicitWait;
import Listeners.IInvokedListenersClass;
import Listeners.ITestListenersClass;

@Listeners({IInvokedListenersClass.class, ITestListenersClass.class})
public class TC08_ProductSpecificationsTest {

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

    //TODO : Verify navigation to the Product Specifications page
    @Test
    public void navigateToProductSpecificationsPage() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPPAVILION15TTOUCHLAPTOP"),
                "The user is not redirected to the Product Specifications page after clicking on product link.");
        info("The user is redirected to the Product Specifications page after clicking on the 'Add to Cart' button.");
        softAssert.assertAll();

    }

    //TODO : Verify the Product Specifications page title
    @Test
    public void verifyProductTitle() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t();

        softAssert.assertTrue(new P08_ProductSpecificationsPage(getDriver()).isProductTitleEqualTo("HP PAVILION 15T TOUCH LAPTOP"));
        info("The product title matches the expected title.");
        softAssert.assertAll();
    }

    //TODO : Verify the Product Specifications page price
    @Test
    public void verifyProductPrice() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t();

        softAssert.assertTrue(new P08_ProductSpecificationsPage(getDriver()).isProductPriceEqualTo("$519.99"));
        info("The product price matches the expected price.");
        softAssert.assertAll();
    }

    //TODO : Verify the color Radio Buttons of the Product Specifications page
    @Test
    public void verifyColorRadioButtons() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t()
                .clickSecondColorRadioButton();
        softAssert.assertTrue(new P08_ProductSpecificationsPage(getDriver()).isSecondColorSelected(),
                "The second color radio button is not selected.");
        info("The second color radio button is selected.");

        new P08_ProductSpecificationsPage(getDriver())
                .clickFirstColorRadioButton();
        softAssert.assertTrue(new P08_ProductSpecificationsPage(getDriver()).isFirstColorSelected(),
                "The first color radio button is not selected.");
        info("The first color radio button is selected.");

        new P08_ProductSpecificationsPage(getDriver())
                .clickThirdColorRadioButton();
        softAssert.assertTrue(new P08_ProductSpecificationsPage(getDriver()).isThirdColorSelected(),
                "The third color radio button is not selected.");
        info("The third color radio button is selected.");

        softAssert.assertAll();
    }
    //TODO : Verify the Product Specifications page Quantity input field
    @Test
    public void verifyIncrementQuantity() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t()
                .clickOnAddQuantityButton(2);
        softAssert.assertEquals(new P08_ProductSpecificationsPage(getDriver()).getQuantityNumber(), "3",
                "The quantity input field is not equal to 3.");
        info("The quantity input field is equal to 3.");

        softAssert.assertTrue(new P08_ProductSpecificationsPage(getDriver()).isQuantityInputFieldEqualTo("3"),
                "The quantity input field is not equal to 3.");

        softAssert.assertAll();
    }

    @Test
    public void verifyMunisQuantity() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t()
                .clickOnAddQuantityButton(3)
                .clickOnSubtractQuantityButton(2);
        softAssert.assertEquals(new P08_ProductSpecificationsPage(getDriver()).getQuantityNumber(), "2",
                "The quantity input field is not equal to 2.");
        info("The quantity input field is equal to 2.");

        softAssert.assertTrue(new P08_ProductSpecificationsPage(getDriver()).isQuantityInputFieldEqualTo("2"),
                "The quantity input field is not equal to 3.");

        softAssert.assertAll();
    }
    //TODO : Verify the The quantity input field functionality
    @Test
    public void verifyQuantityInputField() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t()
                .setProductQuantity("5");
        softAssert.assertEquals(new P08_ProductSpecificationsPage(getDriver()).getQuantityNumber(), "5",
                "The quantity input field is not equal to 5.");
        info("The quantity input field is equal to 5.");

        softAssert.assertTrue(new P08_ProductSpecificationsPage(getDriver()).isQuantityInputFieldEqualTo("5"),
                "The quantity input field is not equal to 5.");

        softAssert.assertAll();
    }

    //TODO : Verify the Add to Cart button functionality
    @Test
    public void verifyAddToCartButton() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t()
                .setProductQuantity("2")
                .clickOnAddToCartButton()
                .clickOnShoppingCart();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "shoppingCart_URL"),
                "The user is not redirected to the Shopping Cart page after clicking on the 'Add to Cart' button.");
        info("The user is redirected to the Shopping Cart page after clicking on the 'Add to Cart' button.");
        softAssert.assertAll();
    }


    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
