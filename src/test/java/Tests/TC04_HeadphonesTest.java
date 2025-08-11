package Tests;

import Pages.P02_HomePage;
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
public class TC04_HeadphonesTest {

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


    @Test
    public void chooseProductFromHeadphonesCategoryTC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnHeadphonesCategory()
                .clickOnHP_H2310_In_Ear();

        softAssert.assertTrue(getDriver().getCurrentUrl().contains("product"),
                "Current URL does not contain 'product'");
    }


    @Test
    public void exploreFeelYourMusicSection() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnHeadphonesCategory()
                .clickOn_FEEL_YOUR_MUSIC_BuyNowButton();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "FEEL_YOUR_MUSIC_BUYNOW"),
                "The user is not redirected to the FEEL YOUR MUSIC page after clicking on the 'Buy Now' button.");
        info("The user is redirected to the FEEL YOUR MUSIC page after clicking on the 'Buy Now' button.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES product page
    @Test
    public void headphones_Beats_Studio2_OverEar_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnHeadphonesCategory()
                .clickOnBeats_Studio_2_OverEar();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "BEATS_STUDIO_2_OVER-EAR_MATTE_BLACK_HEADPHONES"),
                "The user is not redirected to the BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES product page.");
        info("The user is redirected to the BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to BOSE SOUNDLINK AROUND-EAR WIRELESS HEADPHONES II product page
    @Test
    public void headphones_Bose_SoundLink_AroundEar_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnHeadphonesCategory()
                .clickOnBose_SoundLink_Around_Ear();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "BOSE_SOUNDLINK_AROUND-EAR_WIRELESS_HEADPHONES_II"),
                "The user is not redirected to the BOSE SOUNDLINK AROUND-EAR WIRELESS HEADPHONES II product page.");
        info("The user is redirected to the BOSE SOUNDLINK AROUND-EAR WIRELESS HEADPHONES II product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP H2310 IN-EAR HEADSET product page
    @Test
    public void headphones_HP_H2310_InEar_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnHeadphonesCategory()
                .clickOnHP_H2310_In_Ear();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_H2310_IN-EAR_HEADSET"),
                "The user is not redirected to the HP H2310 IN-EAR HEADSET product page.");
        info("The user is redirected to the HP H2310 IN-EAR HEADSET product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to LOGITECH USB HEADSET H390 product page
    @Test
    public void headphones_Logitech_USB_Headset_H390_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnHeadphonesCategory()
                .clickOnLogitech_USB_Headset_H390();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "LOGITECH_USB_HEADSET_H390"),
                "The user is not redirected to the LOGITECH USB HEADSET H390 product page.");
        info("The user is redirected to the LOGITECH USB HEADSET H390 product page.");
        softAssert.assertAll();
    }


    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
