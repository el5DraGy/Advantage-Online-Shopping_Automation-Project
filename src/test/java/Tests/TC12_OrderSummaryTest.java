package Tests;

import Pages.P12_OrderSummaryPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static DriverFactory.DriverFactory.*;
import static Tests.TC01_LogInTest.PASSWORD;
import static Tests.TC01_LogInTest.USERNAME;
import static Tests.TC10_ShippingDetailsTest.*;
import static Tests.TC11_PaymentMethodsTest.*;
import static Utilities.DataUtils.getPropertyData;
import static Utilities.LogsUtils.info;
import static Utilities.Utility.*;
import Listeners.IInvokedListenersClass;
import Listeners.ITestListenersClass;

@Listeners({IInvokedListenersClass.class, ITestListenersClass.class})
public class TC12_OrderSummaryTest {

    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setup() throws IOException {
        //String browser = System.getProperty("browser") != null ? System.getProperty("browser") : getPropertyValue("environment", "Browser");
        setUpDriver(getPropertyData("environment", "Browser"));
        info("starting Edge browser");
        getDriver().get(getPropertyData("environment", "LoginPage_URL"));
        info("get the URL and loading the page");
        implicitWait(getDriver(), 15);
        waitForLoaderToDisappear(getDriver());

    }

    // TODO : verify Laptops Category Flow
    @Test
    public void verifyEndToEndScenario() throws IOException {
        new Pages.P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ENERGYSTAR()
                .clickOnLaptopsPageBack()
                .clickOnHP_Pavilion_15t()
                .clickOnAddQuantityButton(4)
                .clickOnSubtractQuantityButton(2)
                .clickOnLaptopsPageBack()
                .clickOnHP_Pavilion_x360_11t_Touch()
                .setProductQuantity("3")
                .clickOnAddToCartButton()
                .clickOnShoppingCart()
                .clickOnProductEditButton_P1()
                .clickThirdColorRadioButton()
                .clickOnAddQuantityButton(2)
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
                .clickOnSecondNextButtonInEditShippingDetails()
                .clickOnPaymentMethodsSafePay()
                .sendSafePayUserName(SAFEPAY_USERNAME)
                .clickOnSaveChangesCheckBox_SafePay()
                .clickOnSaveChangesCheckBox_SafePay()
                .clickOnPaymentMethods_MasterCredit()
                .clickOnPaymentMethodsMasterCredit_EditButton()
                .sendMasterCreditCardNumber(MASTERCREDIT_CARDNUMBER)
                .sendMasterCreditCVVNumber(MASTERCREDIT_CVV_NUMBER)
                .sendMasterCreditCardHolderName(MASTERCREDIT_CARDHOLDERNAME)
                .clickOnSaveChangesCheckBox_MasterCredit().clickOnSaveChangesCheckBox_MasterCredit()
                .clickOnPayNowButton_MasterCredit();

        softAssert.assertTrue(new P12_OrderSummaryPage(getDriver()).isOrderSummaryPageDisplayed(),
                "The user is not redirected to the Order Summary page after clicking on the 'Pay Now' button using Master Credit.");
        info("The user is redirected to the Order Summary page after clicking on the 'Pay Now' button using Master Credit.");
        softAssert.assertAll();



    }



    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
