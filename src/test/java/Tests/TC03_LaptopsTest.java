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
public class TC03_LaptopsTest {
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
    public void navigateToLaptopsCategory() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t()
                .clickOnLaptopsPageBack()
                .clickOnHP_Pavilion_15z()
                .clickOnAddToCartButton().clickOnShoppingCart();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "shoppingCart_URL"),
                "The user is not redirected to the shopping cart page after adding a product to the cart.");
        info("The user is redirected to the shopping cart page after adding a product to the cart.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to the New Design section
    @Test
    public void exploreTheNewDesignSection() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnNewDesignBuyNowButton();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "BUY_NOW"),
                "The user is not redirected to the THE NEW DESIGN page after clicking on the 'Buy Now' button.");
        info("The user is redirected to the THE NEW DESIGN page after clicking on the 'Buy Now' button.");
        softAssert.assertAll();
    }


    //TODO : Verify navigation to HP Chromebook 14 G1 (ENERGY STAR) product page
    @Test
    public void laptop_HP_Chromebook_14G1_EnergyStar_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ENERGYSTAR();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPCHROMEBOOK14G1(ENERGYSTAR)"),
                "Not redirected to the HP Chromebook 14 G1 (ENERGY STAR) product page.");
                info("The user is redirected to the HP Chromebook 14 G1 (ENERGY STAR) product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP Chromebook 14 G1 (ES) product page
    @Test
    public void laptop_HP_Chromebook_14G1_ES_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Chromebook_ES();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPCHROMEBOOK14G1(ES)"),
                "Not redirected to the HP Chromebook 14 G1 (ES) product page.");
        info("The user is redirected to the HP Chromebook 14 G1 (ES) product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP ENVY - 17T TOUCH LAPTOP product page
    @Test
    public void laptop_HP_ENVY_17T_Touch_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_ENVY_17t();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPENVY-17TTOUCHLAPTOP"),
                "Not redirected to the HP ENVY - 17T TOUCH LAPTOP product page.");
        info("The user is redirected to the HP ENVY - 17T TOUCH LAPTOP product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP ENVY X360 - 15T LAPTOP product page
    @Test
    public void laptop_HP_ENVY_X360_15T_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_ENVY_x360();

        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPENVYX360-15TLAPTOP"),
                "Not redirected to the HP ENVY X360 - 15T LAPTOP product page.");
        info("The user is redirected to the HP ENVY X360 - 15T LAPTOP product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP PAVILION 15T TOUCH LAPTOP product page
    @Test
    public void laptop_HP_Pavilion_15T_Touch_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15t();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPPAVILION15TTOUCHLAPTOP"),
                "Not redirected to the HP PAVILION 15T TOUCH LAPTOP product page.");
        info("The user is redirected to the HP PAVILION 15T TOUCH LAPTOP product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP PAVILION 15Z LAPTOP product page
    @Test
    public void laptop_HP_Pavilion_15Z_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15z();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPPAVILION15ZLAPTOP"),
                "Not redirected to the HP PAVILION 15Z LAPTOP product page.");
        info("The user is redirected to the HP PAVILION 15Z LAPTOP product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP PAVILION 15Z TOUCH LAPTOP product page
    @Test
    public void laptop_HP_Pavilion_15Z_Touch_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_15z_Touch();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPPAVILION15ZTOUCHLAPTOP"),
                "Not redirected to the HP PAVILION 15Z TOUCH LAPTOP product page.");
        info("The user is redirected to the HP PAVILION 15Z TOUCH LAPTOP product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP PAVILION X360 - 11T TOUCH LAPTOP product page
    @Test
    public void laptop_HP_Pavilion_X360_11T_Touch_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Pavilion_x360_11t_Touch();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPPAVILIONX360-11TTOUCHLAPTOP"),
                "Not redirected to the HP PAVILION X360 - 11T TOUCH LAPTOP product page.");
        info("The user is redirected to the HP PAVILION X360 - 11T TOUCH LAPTOP product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP SPECTRE X360 - 13-4102DX product page
    @Test
    public void laptop_HP_Spectre_X360_13_4102DX_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Spectre_x360();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPSPECTREX360-13-4102DX"),
                "Not redirected to the HP SPECTRE X360 - 13-4102DX product page.");
        info("The user is redirected to the HP SPECTRE X360 - 13-4102DX product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP STREAM - 11-D020NR LAPTOP product page
    @Test
    public void laptop_HP_Stream_11_D020NR_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_Stream_11();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPSTREAM-11-D020NRLAPTOP"),
                "Not redirected to the HP STREAM - 11-D020NR LAPTOP product page.");
        info("The user is redirected to the HP STREAM - 11-D020NR LAPTOP product page.");
        softAssert.assertAll();
    }

    //TODO : Verify navigation to HP ZBOOK 17 G2 MOBILE WORKSTATION product page
    @Test
    public void laptop_HP_ZBook_17_G2_Mobile_Workstation_TC() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnLaptopsCategory()
                .clickOnHP_ZBook_17();
        softAssert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HPZBOOK17G2MOBILEWORKSTATION"),
                "Not redirected to the HP ZBOOK 17 G2 MOBILE WORKSTATION product page.");
        info("The user is redirected to the HP ZBOOK 17 G2 MOBILE WORKSTATION product page.");
        softAssert.assertAll();
    }


    @AfterMethod
        public void quit() {
            quitDriver();
    }
}
