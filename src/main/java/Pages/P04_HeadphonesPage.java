package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Utility.*;

public class P04_HeadphonesPage {
    private final WebDriver driver;

    private final By BuyNowButton = By.cssSelector("button[name='buy_now']");
    private final By HP_H2310_In_ear = By.xpath("//img[@id='12']");
    private final By Bose_SoundLink_Around_ear = By.xpath("//img[@id='13']");
    private final By Logitech_USB_Headset_H390 = By.xpath("//img[@id='14']");
    private final By Beats_Studio_2_OverEar = By.xpath("//img[@id='15']");

    public P04_HeadphonesPage(WebDriver driver) {
        this.driver = driver;
    }
    public P08_ProductSpecificationsPage clickOnHP_H2310_In_Ear() {
        clickOnElement(driver,HP_H2310_In_ear);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnBose_SoundLink_Around_Ear() {
        clickOnElement(driver,Bose_SoundLink_Around_ear);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnLogitech_USB_Headset_H390() {
        clickOnElement(driver,Logitech_USB_Headset_H390);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnBeats_Studio_2_OverEar() {
        clickOnElement(driver,Beats_Studio_2_OverEar);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOn_FEEL_YOUR_MUSIC_BuyNowButton() {
        clickOnElement(driver, BuyNowButton);
        return new P08_ProductSpecificationsPage(driver);
    }

}
















