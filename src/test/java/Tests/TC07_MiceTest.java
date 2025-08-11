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
public class TC07_MiceTest {
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
    //TODO : Verify navigation to DISCOVER OUR WIRELESS MICE section
    @Test
    public void exploreDiscoverOurWirelessMiceSection() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnDiscoverOurWirelessMiceBuyNowButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "DISCOVER_OUR_WIRELESS_MICE_BUYNOW"),
                "The user is not redirected to the DISCOVER OUR WIRELESS MICE page after clicking on the 'Buy Now' button.");
        info("The user is redirected to the DISCOVER OUR WIRELESS MICE page after clicking on the 'Buy Now' button.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP USB 3.0 Button Optical Mouse product page
    @Test
    public void mice_HP_USB_3_Button_OpticalMouse_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnHP_USB_3_Button_OpticalMouse();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_USB_3_BUTTON_OPTICAL_MOUSE"),
                "The user is not redirected to the HP USB 3.0 Button Optical Mouse product page.");
        info("The user is redirected to the HP USB 3.0 Button Optical Mouse product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP Z3200 Wireless Mouse product page
    @Test
    public void mice_HP_Z3200_Wireless_Mouse_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnHP_Z3200_Wireless_Mouse();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_Z3200_WIRELESS_MOUSE"),
                "The user is not redirected to the HP Z3200 Wireless Mouse product page.");
        info("The user is redirected to the HP Z3200 Wireless Mouse product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP Z3600 Wireless Mouse product page
    @Test
    public void mice_HP_Z3600_Wireless_Mouse_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnHP_Z3600_Wireless_Mouse();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_Z3600_WIRELESS_MOUSE"),
                "The user is not redirected to the HP Z3600 Wireless Mouse product page.");
        info("The user is redirected to the HP Z3600 Wireless Mouse product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP Z4000 Wireless Mouse product page
    @Test
    public void mice_HP_Z4000_Wireless_Mouse_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnHP_Z4000_Wireless_Mouse();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_Z4000_WIRELESS_MOUSE"),
                "The user is not redirected to the HP Z4000 Wireless Mouse product page.");
        info("The user is redirected to the HP Z4000 Wireless Mouse product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP Z8000 Bluetooth Mouse product page
    @Test
    public void mice_HP_Z8000_Bluetooth_Mouse_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnHP_Z8000_Bluetooth_Mouse();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_Z8000_BLUETOOTH_MOUSE"),
                "The user is not redirected to the HP Z8000 Bluetooth Mouse product page.");
        info("The user is redirected to the HP Z8000 Bluetooth Mouse product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to Kensington Orbit 72352 Trackball product page
    @Test
    public void mice_Kensington_Orbit_72352_Trackball_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnKensington_Orbit_72352_Trackball();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "KENSINGTON_ORBIT_72352_TRACKBALL"),
                "The user is not redirected to the Kensington Orbit 72352 Trackball product page.");
        info("The user is redirected to the Kensington Orbit 72352 Trackball product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to Kensington Orbit 72337 Trackball product page
    @Test
    public void mice_Kensington_Orbit_72337_Trackball_TC() throws IOException{
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnKensington_Orbit_72337_Trackball();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "KENSINGTON_ORBIT_72337_TRACKBALL_WITH_SCROLL_RING"),
                "The user is not redirected to the Kensington Orbit 72337 Trackball product page.");
        info("The user is redirected to the Kensington Orbit 72337 Trackball product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to Logitech G502 Proteus Core product page
    @Test
    public void mice_Logitech_G502_Proteus_Core_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnLogitech_G502_Proteus_Core();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "LOGITECH_G502_PROTEUS_CORE"),
                "The user is not redirected to the Logitech G502 Proteus Core product page.");
        info("The user is redirected to the Logitech G502 Proteus Core product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to Microsoft Sculpt Touch Mouse product page
    @Test
    public void mice_Microsoft_Sculpt_Touch_Mouse_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnMicrosoft_Sculpt_Touch_Mouse();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "MICROSOFT_SCULPT_TOUCH_MOUSE"),
                "The user is not redirected to the Microsoft Sculpt Touch Mouse product page.");
        info("The user is redirected to the Microsoft Sculpt Touch Mouse product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to silly meerkat product page
    @Test
    public void mice_silly_meerkat_TC() throws IOException {
        new Pages.P02_HomePage(getDriver())
                .clickOnMiceCategory()
                .clickOnSillyMeerkat();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "SILLY_MEERKAT"),
                "The user is not redirected to the silly meerkat product page.");
        info("The user is redirected to the silly meerkat product page.");
        softAssert.assertAll();
    }



    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
