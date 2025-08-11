package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static Utilities.DataUtils.*;
import static Utilities.Utility.*;

public class P03_LaptopsPage {

    private final WebDriver driver;
    private final By newDesignBuyNowButton = By.cssSelector("button[name='buy_now']");
    //TODO: LAPTOPS locators
    private final By HP_Pavilion_15t  = By.xpath("//img[@id='1']");
    private final By HP_Pavilion_15z  = By.xpath("//img[@id='2']");
    private final By HP_Pavilion_15z_Touch  = By.xpath("//img[@id='3']");
    private final By HP_Spectre_x360  = By.xpath("//img[@id='4']");
    private final By HP_Stream_11   = By.xpath("//img[@id='5']");
    private final By HP_ENVY_x360   = By.xpath("//img[@id='6']");
    private final By HP_ENVY_17t  = By.xpath("//img[@id='7']");
    private final By HP_ZBook_17 = By.xpath("//img[@id='8']");
    private final By HP_Chromebook_ENERGYSTAR = By.xpath("//img[@id='9']");
    private final By HP_Chromebook_ES = By.xpath("//img[@id='10']");
    private final By HP_Pavilion_x360_11t_Touch  = By.xpath("//img[@id='11']");

    public P03_LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }
/*
    public P03_LaptopsPage backToLaptopsPage() throws IOException {
        backToPageUsingURL(driver,getPropertyData("environment", "LaptopsCategory"));
        return this;
    }

 */

    public P08_ProductSpecificationsPage clickOnNewDesignBuyNowButton() {
        driver.findElement(newDesignBuyNowButton).click();
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_Pavilion_15t() {
        clickOnElement(driver,HP_Pavilion_15t);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_Pavilion_15z() {
        clickOnElement(driver,HP_Pavilion_15z);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHP_Pavilion_15z_Touch() {
        clickOnElement(driver,HP_Pavilion_15z_Touch);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHP_Spectre_x360() {
        clickOnElement(driver,HP_Spectre_x360);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_Stream_11() {
        clickOnElement(driver,HP_Stream_11);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_ENVY_x360() {
        clickOnElement(driver,HP_ENVY_x360);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_ENVY_17t() {
        clickOnElement(driver,HP_ENVY_17t);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_ZBook_17() {
        clickOnElement(driver,HP_ZBook_17);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_Chromebook_ENERGYSTAR() {
        clickOnElement(driver,HP_Chromebook_ENERGYSTAR);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHP_Chromebook_ES() {
        clickOnElement(driver,HP_Chromebook_ES);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHP_Pavilion_x360_11t_Touch() {
        clickOnElement(driver, HP_Pavilion_x360_11t_Touch);
        return new P08_ProductSpecificationsPage(driver);
    }
















}
