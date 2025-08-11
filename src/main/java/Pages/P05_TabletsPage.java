package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Utility.clickOnElement;

public class P05_TabletsPage {

    private final WebDriver driver;

    private final By travelConfidently_BuyNowButton = By.cssSelector("button[name='buy_now']");
    private final By HP_ElitePad_1000 = By.xpath("//img[@id='16']");
    private final By HP_Elite_x2_1011 = By.xpath("//img[@id='17']");
    private final By HP_Pro_Tablet_608 = By.xpath("//img[@id='18']");

    public P05_TabletsPage(WebDriver driver) {
        this.driver = driver;
    }

    public P08_ProductSpecificationsPage clickOnHP_ElitePad_1000() {
        clickOnElement(driver,HP_ElitePad_1000);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHP_Elite_x2_1011() {
        clickOnElement(driver,HP_Elite_x2_1011);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_Pro_Tablet_608() {
        clickOnElement(driver,HP_Pro_Tablet_608);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnTravelConfidentlyBuyNowButton() {
        clickOnElement(driver, travelConfidently_BuyNowButton);
        return new P08_ProductSpecificationsPage(driver);
    }






}