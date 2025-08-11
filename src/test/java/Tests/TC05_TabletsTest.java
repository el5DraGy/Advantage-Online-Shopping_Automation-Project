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
public class TC05_TabletsTest {
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

    //TODO : Verify navigation to TRAVEL CONFIDENTLY AND IN STYLE section
    @Test
    public void exploreTravelConfidentlyAndInStyleSection() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnTabletsCategory()
                .clickOnTravelConfidentlyBuyNowButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "TRAVEL_CONFIDENTLY_BUYNOW"),
                "The user is not redirected to the TRAVEL CONFIDENTLY AND IN STYLE page after clicking on the 'Buy Now' button.");
        info("The user is redirected to the TRAVEL CONFIDENTLY AND IN STYLE page after clicking on the 'Buy Now' button.");
        softAssert.assertAll();
    }
    //TODO : Verify navigation to HP ELITEPAD 1000 G2 TABLET product page
    @Test
    public void tablets_HP_ElitePad_1000_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnTabletsCategory()
                .clickOnHP_ElitePad_1000();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPELITEPAD_1000_G2_TABLET"),
                "The user is not redirected to the HP ELITEPAD 1000 G2 TABLET product page.");
        info("The user is redirected to the HP ELITEPAD 1000 G2 TABLET product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP ELITE X2 1011 G1 TABLET product page
    @Test
    public void tablets_HP_Elite_x2_1011_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnTabletsCategory()
                .clickOnHP_Elite_x2_1011();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_ELITE_X2_1011_G1_TABLET"),
                "The user is not redirected to the HP ELITE X2 1011 G1 TABLET product page.");
        info("The user is redirected to the HP ELITE X2 1011 G1 TABLET product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP PRO TABLET 608 G1 product page
    @Test
    public void tablets_HP_Pro_Tablet_608_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnTabletsCategory()
                .clickOnHP_Pro_Tablet_608();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_PRO_TABLET_608_G1"),
                "The user is not redirected to the HP PRO TABLET 608 G1 product page.");
        info("The user is redirected to the HP PRO TABLET 608 G1 product page.");
        softAssert.assertAll();
    }




    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
