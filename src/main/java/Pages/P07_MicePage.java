package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Utility.clickOnElement;

public class P07_MicePage {
    private final WebDriver driver;
    private final By DISCOVER_OUR_WIRELESS_MICE_BuyNowButton = By.cssSelector("button[name='buy_now']");
    private final By HP_USB_3_Button_OpticalMouse = By.xpath("//img[@id='29']");
    private final By HP_Z3200_Wireless_Mouse = By.xpath("//img[@id='28']");
    private final By HP_Z3600_Wireless_Mouse = By.xpath("//img[@id='27']");
    private final By HP_Z4000_Wireless_Mouse = By.xpath("//img[@id='30']");
    private final By HP_Z8000_Bluetooth_Mouse = By.xpath("//img[@id='33']");
    private final By Kensington_Orbit_72337_Trackball= By.xpath("//img[@id='32']");
    private final By Kensington_Orbit_72352_Trackball = By.xpath("//img[@id='26']");
    private final By Logitech_G502_Proteus_Core = By.xpath("//img[@id='31']");
    private final By Microsoft_Sculpt_Touch_Mouse = By.xpath("//img[@id='34']");
    private final By silly_meerkat = By.xpath("//img[@id='45']");

    public P07_MicePage(WebDriver driver) {
        this.driver = driver;
    }

    public P08_ProductSpecificationsPage clickOnDiscoverOurWirelessMiceBuyNowButton() {
        clickOnElement(driver, DISCOVER_OUR_WIRELESS_MICE_BuyNowButton);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnKensington_Orbit_72352_Trackball() {
        clickOnElement(driver,Kensington_Orbit_72352_Trackball);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHP_Z3600_Wireless_Mouse() {
        clickOnElement(driver,HP_Z3600_Wireless_Mouse);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_Z3200_Wireless_Mouse() {
        clickOnElement(driver,HP_Z3200_Wireless_Mouse);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHP_USB_3_Button_OpticalMouse() {
        clickOnElement(driver,HP_USB_3_Button_OpticalMouse);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_Z4000_Wireless_Mouse() {
        clickOnElement(driver,HP_Z4000_Wireless_Mouse);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnLogitech_G502_Proteus_Core() {
        clickOnElement(driver,Logitech_G502_Proteus_Core);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnKensington_Orbit_72337_Trackball() {
        clickOnElement(driver,Kensington_Orbit_72337_Trackball);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHP_Z8000_Bluetooth_Mouse() {
        clickOnElement(driver,HP_Z8000_Bluetooth_Mouse);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnMicrosoft_Sculpt_Touch_Mouse() {
        clickOnElement(driver,Microsoft_Sculpt_Touch_Mouse);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnSillyMeerkat() {
        clickOnElement(driver,silly_meerkat);
        return new P08_ProductSpecificationsPage(driver);
    }


}
