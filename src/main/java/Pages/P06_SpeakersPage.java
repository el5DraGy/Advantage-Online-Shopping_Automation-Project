package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Utility.*;

public class P06_SpeakersPage {
    private final WebDriver driver;
    private final By ENJOY_PREMIUM_SOUND_BuyNowButton = By.cssSelector("button[name='buy_now']");
    private final By Bose_Soundlink_Bluetooth_Speaker = By.xpath("//img[@id='20']");
    private final By Bose_SoundLink_Wireless_Speaker = By.xpath("//img[@id='25']");
    private final By HP_Roar_Mini_Wireless_Speaker = By.xpath("//img[@id='24']");
    private final By HP_Roar_Plus_Wireless_Speaker = By.xpath("//img[@id='21']");
    private final By HP_Roar_Wireless_Speaker = By.xpath("//img[@id='22']");
    private final By HP_S9500_Bluetooth_Wireless_Speaker = By.xpath("//img[@id='19']");
    private final By Logitech_X100_Speaker_System= By.xpath("//img[@id='23']");

    public P06_SpeakersPage(WebDriver driver) {
        this.driver = driver;
    }

    public P08_ProductSpecificationsPage clickOnEnjoyPremiumSoundBuyNowButton() {
        clickOnElement(driver, ENJOY_PREMIUM_SOUND_BuyNowButton);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnBoseSoundlinkBluetoothSpeaker() {
        clickOnElement(driver,Bose_Soundlink_Bluetooth_Speaker);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnBoseSoundLinkWirelessSpeaker() {
        clickOnElement(driver,Bose_SoundLink_Wireless_Speaker);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHPRoarMiniWirelessSpeaker() {
        clickOnElement(driver,HP_Roar_Mini_Wireless_Speaker);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHPRoarPlusWirelessSpeaker() {
        clickOnElement(driver,HP_Roar_Plus_Wireless_Speaker);
        return new P08_ProductSpecificationsPage(driver);
    }

    public P08_ProductSpecificationsPage clickOnHPRoarWirelessSpeaker() {
        clickOnElement(driver,HP_Roar_Wireless_Speaker);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnHPS9500BluetoothWirelessSpeaker() {
        clickOnElement(driver,HP_S9500_Bluetooth_Wireless_Speaker);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P08_ProductSpecificationsPage clickOnLogitechX100SpeakerSystem() {
        clickOnElement(driver,Logitech_X100_Speaker_System);
        return new P08_ProductSpecificationsPage(driver);
    }


}
