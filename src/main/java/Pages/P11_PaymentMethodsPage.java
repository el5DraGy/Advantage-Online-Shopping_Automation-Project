package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Utility.clearAndSendData;
import static Utilities.Utility.clickOnElement;

public class P11_PaymentMethodsPage {
    private final WebDriver driver;

    //TODO: Add locators for SafePay payment method
    private final By paymentMethodsSafePay = By.xpath("//img[@alt='Safepay']");
    private final By SafePay_usernameField = By.xpath("//input[@name='safepay_username']");
    private final By SafePay_PassWordField = By.xpath("//input[@name='safepay_password']");
    private final By saveChangesCheckBox_SafePay = By.xpath("//input[@name='save_safepay']");
    private final By BackToShippingDetailsLink = By.xpath("(//a[normalize-space()='Back to shipping details'])[1]");
    private final By payNowButton_SAFEPAY = By.id("pay_now_btn_SAFEPAY");
    //TODO: Add locators for Master credit payment method
    private final By paymentMethodsMasterCredit = By.xpath("//img[@alt='Master credit']");
    private final By paymentMethodsMasterCredit_EditButton = By.xpath("(//label[normalize-space()='Edit'])[1]");
    private final By MasterCredit_card_number = By.id("creditCard");
    private final By MasterCredit_CVV_number = By.xpath("//input[@name='cvv_number']");
    private final By MasterCredit_cardHolderName = By.xpath("//input[@name='cardholder_name']");
    private final By saveChangesCheckBox_MasterCredit = By.xpath("(//input[@name='save_master_credit'])[1]");
    private final By PayNowButton_MasterCredit = By.id("pay_now_btn_ManualPayment");

    public P11_PaymentMethodsPage(WebDriver driver) {
        this.driver = driver;
    }

    public P10_ShippingDetailsPage clickOnBackToShippingDetailsLink() {
        clickOnElement(driver, BackToShippingDetailsLink);
        return new P10_ShippingDetailsPage(driver);
    }

    //TODO: Add methods for SafePay payment method -------------------------------------------------------------
    public P11_PaymentMethodsPage clickOnPaymentMethodsSafePay() {
        clickOnElement(driver, paymentMethodsSafePay);
        return this;
    }
    public P11_PaymentMethodsPage sendSafePayUserName(String userName) {
        clearAndSendData(driver,SafePay_usernameField,userName);
        return this;
    }
    public P11_PaymentMethodsPage sendSafePayPassword(String password) {
        clearAndSendData(driver,SafePay_PassWordField,password);
        return this;
    }
    public P11_PaymentMethodsPage clickOnSaveChangesCheckBox_SafePay() {
        clickOnElement(driver, saveChangesCheckBox_SafePay);
        return this;
    }
    public P12_OrderSummaryPage clickOnPayNowButton_SAFEPAY() {
        clickOnElement(driver,payNowButton_SAFEPAY);
        return new P12_OrderSummaryPage(driver);
    }


    //TODO: Add methods for Master credit payment method---------------------------------------------------------

    public P11_PaymentMethodsPage clickOnPaymentMethods_MasterCredit() {
        clickOnElement(driver, paymentMethodsMasterCredit);
        return this;
    }
    public P11_PaymentMethodsPage clickOnPaymentMethodsMasterCredit_EditButton() {
        clickOnElement(driver, paymentMethodsMasterCredit_EditButton);
        return this;
    }
    public P11_PaymentMethodsPage sendMasterCreditCardNumber(String cardNumber) {
        clearAndSendData(driver, MasterCredit_card_number, cardNumber);
        return this;
    }
    public P11_PaymentMethodsPage sendMasterCreditCVVNumber(String cvvNumber) {
        clearAndSendData(driver, MasterCredit_CVV_number, cvvNumber);
        return this;
    }
    public P11_PaymentMethodsPage sendMasterCreditCardHolderName(String cardHolderName) {
        clearAndSendData(driver, MasterCredit_cardHolderName, cardHolderName);
        return this;
    }
    public P11_PaymentMethodsPage clickOnSaveChangesCheckBox_MasterCredit() {
        clickOnElement(driver, saveChangesCheckBox_MasterCredit);
        return this;
    }
    public P12_OrderSummaryPage clickOnPayNowButton_MasterCredit() {
        clickOnElement(driver,PayNowButton_MasterCredit);
        return new P12_OrderSummaryPage(driver);
    }



}
