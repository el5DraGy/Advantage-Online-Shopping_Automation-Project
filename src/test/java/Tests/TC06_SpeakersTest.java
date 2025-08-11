package Tests;

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
public class TC06_SpeakersTest {

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

    //TODO : Verify navigation to ENJOY PREMIUM SOUND section
    @Test
    public void exploreEnjoyPremiumSoundSection() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnSpeakersCategory()
                .clickOnEnjoyPremiumSoundBuyNowButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "ENJOY_PREMIUM_SOUND_BUYNOW"),
                "The user is not redirected to the ENJOY PREMIUM SOUND page after clicking on the 'Buy Now' button.");
        info("The user is redirected to the ENJOY PREMIUM SOUND page after clicking on the 'Buy Now' button.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to BOSE SOUNDLINK BLUETOOTH SPEAKER III product page
    @Test
    public void speakers_BoseSoundlinkBluetoothSpeaker_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnSpeakersCategory()
                .clickOnBoseSoundlinkBluetoothSpeaker();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "BOSE_SOUNDLINK_BLUETOOTH_SPEAKER_III"),
                "The user is not redirected to the BOSE SOUNDLINK BLUETOOTH SPEAKER III product page.");
        info("The user is redirected to the BOSE SOUNDLINK BLUETOOTH SPEAKER III product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to BOSE SOUNDLINK WIRELESS SPEAKER product page
    @Test
    public void speakers_BoseSoundLinkWirelessSpeaker_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnSpeakersCategory()
                .clickOnBoseSoundLinkWirelessSpeaker();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "BOSE_SOUNDLINK_WIRELESS_SPEAKER"),
                "The user is not redirected to the BOSE SOUNDLINK WIRELESS SPEAKER product page.");
        info("The user is redirected to the BOSE SOUNDLINK WIRELESS SPEAKER product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP ROAR MINI WIRELESS SPEAKER product page
    @Test
    public void speakers_HPRoarMiniWirelessSpeaker_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnSpeakersCategory()
                .clickOnHPRoarMiniWirelessSpeaker();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_ROAR_MINI_WIRELESS_SPEAKER"),
                "The user is not redirected to the HP ROAR MINI WIRELESS SPEAKER product page.");
        info("The user is redirected to the HP ROAR MINI WIRELESS SPEAKER product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP ROAR PLUS WIRELESS SPEAKER product page
    @Test
    public void speakers_HPRoarPlusWirelessSpeaker_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnSpeakersCategory()
                .clickOnHPRoarPlusWirelessSpeaker();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPROAR_PLUS_WIRELESS_SPEAKER"),
                "The user is not redirected to the HP ROAR PLUS WIRELESS SPEAKER product page.");
        info("The user is redirected to the HP ROAR PLUS WIRELESS SPEAKER product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP ROAR WIRELESS SPEAKER product page
    @Test
    public void speakers_HPRoarWirelessSpeaker_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnSpeakersCategory()
                .clickOnHPRoarWirelessSpeaker();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_ROAR_WIRELESS_SPEAKER"),
                "The user is not redirected to the HP ROAR WIRELESS SPEAKER product page.");
        info("The user is redirected to the HP ROAR WIRELESS SPEAKER product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP S9500 BLUETOOTH WIRELESS SPEAKER product page
    @Test
    public void speakers_HPS9500BluetoothWirelessSpeaker_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnSpeakersCategory()
                .clickOnHPS9500BluetoothWirelessSpeaker();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_S9500_BLUETOOTH_WIRELESS_SPEAKER"),
                "The user is not redirected to the HP S9500 BLUETOOTH WIRELESS SPEAKER product page.");
        info("The user is redirected to the HP S9500 BLUETOOTH WIRELESS SPEAKER product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to LOGITECH X100 SPEAKER SYSTEM product page
    @Test
    public void speakers_LogitechX100SpeakerSystem_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnSpeakersCategory()
                .clickOnLogitechX100SpeakerSystem();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "LOGITECH_X100_SPEAKER_SYSTEM-WIRELESS_SPEAKER(S)"),
                "The user is not redirected to the LOGITECH X100 SPEAKER SYSTEM product page.");
        info("The user is redirected to the LOGITECH X100 SPEAKER SYSTEM product page.");
        softAssert.assertAll();
    }


    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
