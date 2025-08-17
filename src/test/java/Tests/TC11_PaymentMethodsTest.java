package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static DriverFactory.DriverFactory.*;
import static Tests.TC01_LogInTest.PASSWORD;
import static Tests.TC01_LogInTest.USERNAME;
import static Utilities.DataUtils.*;
import static Utilities.LogsUtils.*;
import static Utilities.Utility.*;

import Listeners.IInvokedListenersClass;
import Listeners.ITestListenersClass;

@Listeners({IInvokedListenersClass.class, ITestListenersClass.class})
public class TC11_PaymentMethodsTest {

    SoftAssert softAssert = new SoftAssert();

    public static final String SAFEPAY_USERNAME = getJsonData("PaymentData", "SafePay_username");
    public static final String SAFEPAY_PASSWORD = getJsonData("PaymentData", "SafePay_password");
    public static final String MASTERCREDIT_CARDNUMBER = getJsonData("PaymentData", "MasterCredit_CardNumber");
    public static final String MASTERCREDIT_CVV_NUMBER = getJsonData("PaymentData", "MasterCredit_CVV_Number");
    public static final String MASTERCREDIT_CARDHOLDERNAME = getJsonData("PaymentData", "MasterCredit_CardholderName");

    @BeforeMethod
    public void setup() throws IOException {
        setUpDriver(getPropertyData("environment", "Browser"));
        info("starting Edge browser");
        getDriver().get(getPropertyData("environment", "LoginPage_URL"));
        info("get the URL and loading the page");
        implicitWait(getDriver(), 15);
        waitForLoaderToDisappear(getDriver());
    }

    //TODO : Verify Back to shipping details Link method
    @Test
    public void verifyBackToShippingDetailsLink() throws IOException {
        new Pages.P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ENERGYSTAR()
                .clickOnAddToCartButton()
                .clickOnShoppingCart()
                .clickOnCheckOutButton()
                .clickOnFirstNextButtonInShippingDetails()
                .clickOnBackToShippingDetailsLink();

        softAssert.assertTrue(new Pages.P10_ShippingDetailsPage(getDriver()).isShippingDetailsSectionSelected(),
                "The user is not redirected to the SHIPPING DETAILS page after clicking on the 'Back to shipping details' link.");
    }

    //TODO : Add test case for SafePay payment method
    @Test
    public void verifySafePayPaymentMethod() throws IOException {
        new Pages.P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ENERGYSTAR()
                .clickOnAddToCartButton()
                .clickOnShoppingCart()
                .clickOnCheckOutButton()
                .clickOnFirstNextButtonInShippingDetails()
                .clickOnPaymentMethodsSafePay()
                .sendSafePayUserName(SAFEPAY_USERNAME)
                .sendSafePayPassword(SAFEPAY_PASSWORD)
                .clickOnSaveChangesCheckBox_SafePay()
                .clickOnSaveChangesCheckBox_SafePay()
                .clickOnPayNowButton_SAFEPAY();

        softAssert.assertTrue(new Pages.P12_OrderSummaryPage(getDriver()).isOrderSummaryPageDisplayed(),
                "The user is not redirected to the Order Summary page after clicking" +
                        " on the 'Pay Now' button using SafePay.");
    }

    //TODO : Add test case for Master credit payment method
    @Test
    public void verifyMasterCreditPaymentMethod() throws IOException {
        new Pages.P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ENERGYSTAR()
                .clickOnAddToCartButton()
                .clickOnShoppingCart()
                .clickOnCheckOutButton()
                .clickOnFirstNextButtonInShippingDetails()
                .clickOnPaymentMethods_MasterCredit()
                .clickOnPaymentMethodsMasterCredit_EditButton()
                .sendMasterCreditCardNumber(MASTERCREDIT_CARDNUMBER)
                .sendMasterCreditCVVNumber(MASTERCREDIT_CVV_NUMBER)
                .sendMasterCreditCardHolderName(MASTERCREDIT_CARDHOLDERNAME)
                .clickOnSaveChangesCheckBox_MasterCredit().clickOnSaveChangesCheckBox_MasterCredit()
                .clickOnPayNowButton_MasterCredit();


        softAssert.assertTrue(new Pages.P12_OrderSummaryPage(getDriver()).isOrderSummaryPageDisplayed(),
                "The user is not redirected to the Order Summary page after clicking on the 'Pay Now' button using Master Credit.");
    }










    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
