package Tests;

import Pages.P01_LogInPage;
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
import static org.bouncycastle.util.Properties.getPropertyValue;

import Listeners.IInvokedListenersClass;
import Listeners.ITestListenersClass;

@Listeners({IInvokedListenersClass.class, ITestListenersClass.class})
public class TC01_LogInTest {

    public static final String USERNAME = getJsonData("validLogin", "usernameValue");
    public static final String PASSWORD = getJsonData("validLogin", "passWordValue");
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

    //TODO : Add a test for valid Username and Password
    @Test
    public void validLogInTC() throws IOException {
        new P01_LogInPage(getDriver())
                .clickOnUserMenu()
                .sendUserName(USERNAME)
                .sendPassword(PASSWORD)
                .signInButtonClick();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                getPropertyData("environment", "HomePage_URL"),
                "The user is not redirected to the home page after logging in with valid credentials.");
        info("The user is redirected to the home page after logging in with valid credentials.");
    }


    @AfterMethod
    public void quit() {
        quitDriver();
    }
}
