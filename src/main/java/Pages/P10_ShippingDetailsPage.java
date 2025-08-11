package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static Utilities.Utility.*;

public class P10_ShippingDetailsPage {
    private final WebDriver driver;
    private final By PaymentMethodSection = By.xpath("//label[normalize-space()='2. PAYMENT METHOD']");
    private final By shippingDetailsSection = By.xpath("//label[normalize-space()='1. SHIPPING DETAILS']");
    private final By nextButtonInShippingDetails = By.xpath("(//button[@id='next_btn'])[1]");
    private final By editShippingDetailsLink = By.xpath("//a[normalize-space()='Edit shipping details']");
    private final By backButton = By.xpath("//a[normalize-space()='BACK']");
    private final By saveChangesCheckBox = By.xpath("//input[@name='agree_agreement']");
    private final By nextButtonInEditShippingDetails = By.xpath("(//button[@id='next_btn'])[2]");
    private final By BackToShippingDetailsLink = By.xpath("//a[normalize-space()='Back to shipping details']");
    private final By payNowButton_SAFEPAY = By.id("pay_now_btn_SAFEPAY");
    private final By payNowButton_MasterCredit = By.id("pay_now_btn_MasterCredit");
    //TODO: Add locators forRecipient details in Edit shipping details and Address
    private final By firstNameField = By.xpath("//input[@name='first_name']");
    private final By lastNameField = By.xpath("//input[@name='last_name']");
    private final By phoneNumberField = By.xpath("//input[@name='phone_number']");
    private final By countryListBox = By.xpath("//select[@name='countryListbox']");
    private final By cityField = By.xpath("//input[@name='city']");
    private final By addressField = By.xpath("//input[@name='address']");
    private final By postalCodeField = By.xpath("//input[@name='postal_code']");
    private final By stateField = By.xpath("//input[@name='state_/_province_/_region']");

    public P10_ShippingDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public P11_PaymentMethodsPage clickOnFirstNextButtonInShippingDetails() {
        clickOnElement(driver, nextButtonInShippingDetails);
        return new P11_PaymentMethodsPage(driver);
    }public P11_PaymentMethodsPage clickOnSecondNextButtonInEditShippingDetails() {
        clickOnElement(driver, nextButtonInEditShippingDetails);
        return new P11_PaymentMethodsPage(driver);
    }
    /*
    public P10_ShippingDetailsPage clickOnBackToShippingDetailsLink() {
        clickOnElement(driver, BackToShippingDetailsLink);
        return this;
    }

    public P11_PaymentMethodsPage clickOnPayNowButtonUsingSAFEPAY() {
        clickOnElement(driver, payNowButton_SAFEPAY);
        return new P11_PaymentMethodsPage(driver);
    }
    public P11_PaymentMethodsPage clickOnPayNowButtonUsingMasterCredit() {
        clickOnElement(driver, payNowButton_MasterCredit);
        return new P11_PaymentMethodsPage(driver);
    }

     */

    public Boolean isPaymentMethodSectionSelected() {
        return Objects.requireNonNull(findWebElement(driver, PaymentMethodSection).getAttribute("class")).contains("selected");
    }


    public Boolean isShippingDetailsSectionSelected() {
        return Objects.requireNonNull(findWebElement(driver, shippingDetailsSection).getAttribute("class")).contains("selected");
    }


    public P10_ShippingDetailsPage clickOnEditShippingDetailsLink() {
        clickOnElement(driver, editShippingDetailsLink);
        return this;
    }
    public P10_ShippingDetailsPage clickOnBackButton() {
        clickOnElement(driver, backButton);
        return this;
    }
    public P10_ShippingDetailsPage clickOnSaveChangesCheckBox() {
        clickOnElement(driver, saveChangesCheckBox);
        return this;
    }


//TODO: Add methods for Recipient details in Edit shipping details and Address if loged in as a registered user
    public P10_ShippingDetailsPage editFirstName(String firstName) {
        clearAndSendData(driver,firstNameField,firstName);
        return this;
    }
    public P10_ShippingDetailsPage editLastName(String lastName) {
        clearAndSendData(driver,lastNameField,lastName);
        return this;
    }
    public P10_ShippingDetailsPage editPhoneNumber(String phoneNumber) {
        clearAndSendData(driver, phoneNumberField, phoneNumber);
        return this;
    }

    public P10_ShippingDetailsPage selectCountry(String country) {
        dropDownSelect(driver, countryListBox, country);
        return this;
    }
    public P10_ShippingDetailsPage editCity(String city) {
        clearAndSendData(driver, cityField, city);
        return this;
    }
    public P10_ShippingDetailsPage editAddress(String address) {
        clearAndSendData(driver, addressField, address);
        return this;
    }
    public P10_ShippingDetailsPage editPostalCode(String postalCode) {
        clearAndSendData(driver, postalCodeField, postalCode);
        return this;
    }
    public P10_ShippingDetailsPage editState(String state) {
        clearAndSendData(driver, stateField, state);
        return this;
    }



}
