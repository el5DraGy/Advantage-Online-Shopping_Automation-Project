package Tests;

import Pages.P01_LogInPage;
import Pages.P10_ShippingDetailsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static DriverFactory.DriverFactory.*;
import static Tests.TC01_LogInTest.PASSWORD;
import static Tests.TC01_LogInTest.USERNAME;
import static Utilities.DataUtils.getJsonData;
import static Utilities.DataUtils.getPropertyData;
import static Utilities.LogsUtils.info;
import static Utilities.Utility.implicitWait;
import static Utilities.Utility.waitForLoaderToDisappear;
import Listeners.IInvokedListenersClass;
import Listeners.ITestListenersClass;

@Listeners({IInvokedListenersClass.class, ITestListenersClass.class})
public class TC10_ShippingDetailsTest {
    SoftAssert softAssert = new SoftAssert();
    public static final String FIRSTNAME = getJsonData("validRegister", "firstName");
    public static final String LASTNAME = getJsonData("validRegister", "lastName");
    public static final String PHONE_NUMBER = getJsonData("validRegister", "PhoneNumber");
    public static final String COUNTRY_LISTBOX= getJsonData("validRegister", "Country");
    public static final String CITY= getJsonData("validRegister", "City");
    public static final String ADDRESS= getJsonData("validRegister", "Address");
    public static final String POSTAL_CODE= getJsonData("validRegister", "PostalCode");
    public static final String STATE= getJsonData("validRegister", "state");


    @BeforeMethod
    public void setup() throws IOException {
        setUpDriver(getPropertyData("environment", "Browser"));
        info("starting Edge browser");
        getDriver().get(getPropertyData("environment", "LoginPage_URL"));
        info("get the URL and loading the page");
        implicitWait(getDriver(), 10);
        //waitForLoaderToDisappear(getDriver());
    }
    //TODO :

    @Test
    public void verifyNextButtonInOrderPaymentPage() throws IOException {
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
                .clickOnCheckOutButton()
                        .clickOnFirstNextButtonInShippingDetails();

        softAssert.assertTrue(new P10_ShippingDetailsPage(getDriver()).isPaymentMethodSectionSelected(),
                "The user is not redirected to the PAYMENT METHOD page after clicking on the 'Next' button.");
        info("The user is redirected to the PAYMENT METHOD page after clicking on the 'Next' button.");
        softAssert.assertAll();
    }
    //TODO : Verify the Shipping Details section is selected
    @Test
    public void verifyShippingDetailsSectionSelected() throws IOException {
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
                .clickOnCheckOutButton()
                .clickOnEditShippingDetailsLink();
        softAssert.assertTrue(new P10_ShippingDetailsPage(getDriver()).isShippingDetailsSectionSelected(),
                "The user is not redirected to the PAYMENT METHOD page after clicking on the 'Next' button.");
        info("The user is redirected to the PAYMENT METHOD page after clicking on the 'Next' button.");
        softAssert.assertAll();
    }
    //TODO : Verify the Edit Shipping Details link
    @Test
    public void verifyEditShippingDetailsLink() throws IOException {
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
                .clickOnCheckOutButton()
                .clickOnEditShippingDetailsLink();
        softAssert.assertTrue(new P10_ShippingDetailsPage(getDriver()).isShippingDetailsSectionSelected(),
                "The user is not redirected to the SHIPPING DETAILS page after clicking on the 'Edit Shipping Details' link.");
        info("The user is redirected to the SHIPPING DETAILS page after clicking on the 'Edit Shipping Details' link.");
        softAssert.assertAll();
    }
    //TODO : Verify the Back button functionality
    @Test
    public void verifyBackButtonFunctionality() throws IOException {
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
                .clickOnCheckOutButton()
                .clickOnEditShippingDetailsLink()
                .clickOnBackButton()
                        .clickOnFirstNextButtonInShippingDetails();
        softAssert.assertTrue(new P10_ShippingDetailsPage(getDriver()).isPaymentMethodSectionSelected(),
                "The user is not redirected to the PAYMENT METHOD page after clicking on the 'Back' button.");
        info("The user is redirected to the PAYMENT METHOD page after clicking on the 'Back' button.");
        softAssert.assertAll();
    }
    //TODO : Verify the Edit Shipping Details functionality in shipping details page
    @Test
    public void verifyEditShippingDetailsFunctionality() throws IOException {
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
                .clickOnCheckOutButton()
                .clickOnEditShippingDetailsLink()
                .editFirstName(FIRSTNAME)
                .editLastName(LASTNAME)
                .editPhoneNumber(PHONE_NUMBER)
                .selectCountry(COUNTRY_LISTBOX)
                .editCity(CITY)
                .editAddress(ADDRESS)
                .editPostalCode(POSTAL_CODE)
                .editState(STATE)
                .clickOnSaveChangesCheckBox()
                .clickOnSaveChangesCheckBox()
                .clickOnSecondNextButtonInEditShippingDetails();
        softAssert.assertTrue(new P10_ShippingDetailsPage(getDriver()).isShippingDetailsSectionSelected(),
                "The user is not redirected to the PAYMENT METHOD page after clicking on the 'Save Changes' button.");
        info("The user is redirected to the PAYMENT METHOD page after clicking on the 'Save Changes' button.");
        softAssert.assertAll();
    }


    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
