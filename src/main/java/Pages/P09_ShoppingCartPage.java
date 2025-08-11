package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Utility.*;

public class P09_ShoppingCartPage {
    private final WebDriver driver;
    private final By CheckOutButton = By.id("checkOutButton");
    private final By continueShoppingButton = By.xpath("//a[normalize-space()='CONTINUE SHOPPING']");
    private final By shopping_cart_is_emptyLabel = By.xpath("//label[@class='roboto-bold ng-scope']");
    //TODO : Add locators for product remove buttons in Cart Icon
    private final By productRemoveButton_P1 = By.xpath("(//a[text()='REMOVE'])[1]");
    private final By productRemoveButton_P2 = By.xpath("(//a[text()='REMOVE'])[2]");
    private final By productRemoveButton_P3 = By.xpath("(//a[text()='REMOVE'])[3]");
    private final By productRemoveButton_P4 = By.xpath("(//a[text()='REMOVE'])[4]");
    //TODO : Add locators for product edit buttons in Cart Icon
    private final By productEditButton_P1 = By.xpath("(//a[text()='EDIT'])[1]");
    private final By productEditButton_P2 = By.xpath("(//a[text()='EDIT'])[2]");
    private final By productEditButton_P3 = By.xpath("(//a[text()='EDIT'])[3]");
    private final By productEditButton_P4 = By.xpath("(//a[text()='EDIT'])[4]");

    //TODO : Add locators for product base remove and edit buttons in shopping Cart page
    private final By productRemoveButton = By.xpath("(//a[text()='REMOVE'])[]");



    public P09_ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getShoppingCartIsEmptyLabelText() {
        return getText(driver , shopping_cart_is_emptyLabel);
    }
    public  Boolean isShoppingCartIsEmptyLabelDisplayed() {
        return getShoppingCartIsEmptyLabelText().contains("Your shopping cart is empty");
    }

    public P10_ShippingDetailsPage clickOnCheckOutButton() {
        clickOnElement(driver,CheckOutButton);
        return new P10_ShippingDetailsPage(driver);
    }
    public P02_HomePage clickOnContinueShoppingButton() {
        clickOnElement(driver, continueShoppingButton);
        return new P02_HomePage(driver);
    }

    public P09_ShoppingCartPage clickOnProductRemoveButton_P1() {
        clickOnElement(driver, productRemoveButton_P1);
        return this;
    }
    public P09_ShoppingCartPage clickOnProductRemoveButton_P2() {
        clickOnElement(driver, productRemoveButton_P2);
        return this;
    }
    public P09_ShoppingCartPage clickOnProductRemoveButton_P3() {
        clickOnElement(driver, productRemoveButton_P3);
        return this;
    }
    public P09_ShoppingCartPage clickOnProductRemoveButton_P4() {
        clickOnElement(driver, productRemoveButton_P4);
        return this;
    }




    public P08_ProductSpecificationsPage clickOnProductEditButton_P1() {
        clickOnElement(driver, productEditButton_P1);
        return new P08_ProductSpecificationsPage(driver);
    }
    public P09_ShoppingCartPage clickOnProductEditButton_P2() {
        clickOnElement(driver, productEditButton_P2);
        return this;
    }
    public P09_ShoppingCartPage clickOnProductEditButton_P3() {
        clickOnElement(driver, productEditButton_P3);
        return this;
    }
    public P09_ShoppingCartPage clickOnProductEditButton_P4() {
        clickOnElement(driver, productEditButton_P4);
        return this;
    }













}
