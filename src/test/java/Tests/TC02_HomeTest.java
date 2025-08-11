package Tests;

import Pages.P01_LogInPage;
import Pages.P02_HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static DriverFactory.DriverFactory.*;
import static Utilities.DataUtils.getJsonData;
import static Utilities.DataUtils.getPropertyData;
import static Utilities.LogsUtils.info;
import static Utilities.Utility.implicitWait;
import static Utilities.Utility.waitForLoaderToDisappear;

import Listeners.IInvokedListenersClass;
import Listeners.ITestListenersClass;

@Listeners({IInvokedListenersClass.class, ITestListenersClass.class})
public class TC02_HomeTest {

    private final String USERNAME = getJsonData("validLogin", "usernameValue");
    private final String PASSWORD = getJsonData("validLogin", "passWordValue");
    private final String CATEGORY = getJsonData("ContactUsData", "category");
    private final String PRODUCT = getJsonData("ContactUsData", "product");
    private final String EMAIL = getJsonData("ContactUsData", "Email");
    private final String SUBJECT = getJsonData("ContactUsData", "subject");

    private final String searchText = "HP";

    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setup() throws IOException {
        setUpDriver(getPropertyData("environment", "Browser"));
        info("starting Edge browser");
        getDriver().get(getPropertyData("environment", "LoginPage_URL"));
        info("get the URL and loading the page");
        implicitWait(getDriver(), 15);
        waitForLoaderToDisappear(getDriver());

    }

    //TODO : Add a test for Shopping Cart Button
    @Test
    public void checkShoppingCartButton() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnShoppingCart();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "shoppingCart_URL"),
                "Shopping cart button did not navigate to the shopping cart page.");
        info("Navigated to the shopping cart page successfully.");
    }

    //TODO : Add a test for the Search bar with search icon
    @Test
    public void checkSearchBarAndSearchIcon() throws IOException {
        new P02_HomePage(getDriver())
                .clickOnSearchIcon()
                .enterDataToSearchBar(searchText);

        softAssert.assertTrue(new P02_HomePage(getDriver()).isSearchResultLabelDisplayedWithText(searchText),
                "Search result label does not contain the expected text.");
        info("Search bar with search icon displays correct search result label.");
        softAssert.assertTrue(getDriver().getCurrentUrl().contains("search"),
                "Current URL does not contain 'search' after searching.");
        info("Search bar with search icon displays correct search result label.");
        softAssert.assertAll();
    }

    //TODO : Add a test for Navigating to Laptops category
    @Test
    public void checkLaptopsCategoryLink() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick().clickOnLaptopsCategory();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "LaptopsCategory")
                ,"Laptops category URL mismatch");
        info("Navigated to Laptops category successfully.");
    }


    //TODO : Add a test for Navigating to Speakers category
    @Test
    public void checkSpeakersCategoryLink() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick().clickOnSpeakersCategory();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "SpeakersCategory"),
                "Speakers category URL mismatch");
        info("Navigated to Speakers category successfully.");
    }

    //TODO : Add a test for Navigating to Tablets category
    @Test
    public void checkTabletsCategoryLink() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick().clickOnTabletsCategory();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "TabletsCategory"),
                "Tablets category URL mismatch");
        info("Navigated to Tablets category successfully.");
    }

    //TODO : Add a test for Navigating to Headphones category
    @Test
    public void checkHeadphonesCategoryLink() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick().clickOnHeadphonesCategory();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "HeadphonesCategory"),
                "Headphones category URL mismatch");
        info("Navigated to Headphones category successfully.");
    }

    //TODO : Add a test for Navigating to Mice category
    @Test
    public void checkMiceCategoryLink() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick().clickOnMiceCategory();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "MiceCategory"),
                "Mice category URL mismatch");
        info("Navigated to Mice category successfully.");
    }

    //TODO : Add a test for the See Offer button navigation
    @Test
    public void checkSeeOfferButton() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnSeeOfferButton();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "OFFERSPage_URL"),
                "See Offer button did not navigate to the laptops category.");
        info("Navigated to laptops category via See Offer button successfully.");
    }

    //TODO : Add a test for the POPULAR ITEMS section
    @Test
    public void checkPopularItemsSectionFirstItem() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnPopularItem1();

        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_ELITEPAD_1000_G2_TABLET"),
                "Popular item 1 did not navigate to the expected product page.");
    }

    //TODO : Add a test for the POPULAR ITEMS section
    @Test
    public void checkPopularItemsSectionSecondItem() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnPopularItem2();

        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_ELITEBOOK_FOLIO"),
                "Popular item 1 did not navigate to the expected product page.");
    }

    //TODO : Add a test for the POPULAR ITEMS section
    @Test
    public void checkPopularItemsSectionThirdItem() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .clickOnPopularItem3();

        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("ProductsLinks", "HP_ROAR_PLUS_WIRELESS_SPEAKER"),
                "Popular item 1 did not navigate to the expected product page.");
    }

    //TODO : Add a test for the CONTACT US section
    @Test
    public void checkContactUsSection() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .selectCategoryListBoxContactUs("Laptops")
                .selectProductListBoxContactUs("HP Chromebook 14 G1(ENERGY STAR)")
                .sendEmailContactUs(EMAIL)
                .sendSubjectTextareaContactUs(SUBJECT)
                .clickOnContactUsSendButton();


        Assert.assertTrue(new P02_HomePage(getDriver()).isContactUsSuccessMessageDisplayed(),
                "Contact Us success message was not displayed.");
    }


    //TODO : Add a test for the CONTACT US section
    @Test
    public void checkGoUpIconAndContinueShoppingButton() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick()
                .selectCategoryListBoxContactUs("Laptops")
                .selectProductListBoxContactUs("HP Chromebook 14 G1(ENERGY STAR)")
                .sendEmailContactUs(EMAIL)
                .sendSubjectTextareaContactUs(SUBJECT)
                .clickOnContactUsSendButton()
                .clickOngoUpIcon()
                        .clickOnContinueShoppingButton();



        Assert.assertTrue(new P02_HomePage(getDriver()).isContactUsSuccessMessageDisplayed(),
                "Contact Us success message was not displayed.");
    }

    //TODO : Add a test for the Home Footer
    @Test
    public void checkFooterSocialLinks() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick();
        info("All social media footer links are displayed.");
        softAssert.assertTrue(new P02_HomePage(getDriver()).isFacebookLinkDisplayed(), "Facebook link not displayed.");
        softAssert.assertTrue(new P02_HomePage(getDriver()).isTwitterLinkDisplayed(), "Twitter link not displayed.");
        softAssert.assertTrue(new P02_HomePage(getDriver()).isLinkedinLinkDisplayed(), "LinkedIn link not displayed.");
        info( "Checking footer social media links hrefs...");
        softAssert.assertEquals(new P02_HomePage(getDriver()).getFacebookLinkHref(), getPropertyData("environment", "facebookLink"), "Facebook href invalid.");
        softAssert.assertEquals(new P02_HomePage(getDriver()).getTwitterLinkHref(), getPropertyData("environment", "twitterLink"), "Twitter href invalid.");
        softAssert.assertEquals(new P02_HomePage(getDriver()).getLinkedinLinkHref(), getPropertyData("environment", "linkedinLink"), "LinkedIn href invalid.");
        info("Clicking on footer social media links to verify navigation...");
        softAssert.assertEquals(new P02_HomePage(getDriver()).clickOnFacebookLink(), getPropertyData("environment", "facebookLink"), "Facebook href invalid.");
        softAssert.assertEquals(new P02_HomePage(getDriver()).clickOnTwitterLink(), getPropertyData("environment", "twitterLink"), "Twitter href invalid.");
        softAssert.assertEquals(new P02_HomePage(getDriver()).clickOnLinkedinLink(), getPropertyData("environment", "linkedinLink"), "LinkedIn href invalid.");


        info("All social media footer links are displayed and have valid hrefs and navigation.");
        softAssert.assertAll();
    }

    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
