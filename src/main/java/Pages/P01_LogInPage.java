package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Utility.*;


public class P01_LogInPage {
    private final WebDriver driver;

    private final By UserMenu = By.id("menuUserLink");
    private final By username = By.xpath("//input[@name='username']");
    private final By password = By.xpath("//input[@name='password']");
    private final By signInButton = By.id("sign_in_btn");


    public P01_LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public P01_LogInPage clickOnUserMenu() {
        clickOnElement(driver, UserMenu);
        return this;
    }
    public P01_LogInPage sendUserName(String usernameValue) {
        sendData(driver, username, usernameValue);
        return this;
    }

    public P01_LogInPage sendPassword(String passWordValue) {
        sendData(driver, password, passWordValue);
        return this;
    }

    public P02_HomePage signInButtonClick() {
        clickOnElement(driver, signInButton);
        return new P02_HomePage(driver);
    }








}
