package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static Utilities.Utility.*;

public class P08_ProductSpecificationsPage {
    private final WebDriver driver;
    //TODO: Add locators for the Product Specifications title and price elements
    private final By productTitle = By.xpath("//h1[@class='roboto-regular screen768 ng-binding']");
    private final By productPrice = By.xpath("//*[@id='Description']/h2");
    //TODO: Add locators for the chosen color element's locators on the Product Specifications page
    private final By firstColor = By.xpath("(//span[@id='bunny'])[1]");
    private final By secondColor = By.xpath("(//span[@id='bunny'])[2]");
    private final By thirdColor = By.xpath("(//span[@id='bunny'])[3]");
    //TODO: Add locators for the Product Quantity input field and the Product Price element
    private final By addQuantityButton = By.xpath("//div[@class='plus']");
    private final By subtractQuantityButton = By.xpath("//div[@class='minus']");
    private final By productQuantityInput = By.xpath("//input[@name='quantity']");
    //TODO: Add locators for the Add to Cart button and Shopping Cart icon
    private final By addToCartButton = By.cssSelector("button[name='save_to_cart']");
    private final By ShoppingCartIcon = By.id("menuCart");
    private final By LaptopsPageBack = By.cssSelector("a[class='ng-binding']");
    private final By HeadphonesPageBack = By.cssSelector("a[class='ng-binding']");
    private final By TabletsPageBack = By.cssSelector("a[class='ng-binding']");
    private final By SpeakersPageBack = By.cssSelector("a[class='ng-binding']");
    private final By MicePageBack = By.cssSelector("a[class='ng-binding']");




    public P08_ProductSpecificationsPage(WebDriver driver) {
        this.driver = driver;
    }

    // TODO: Navigates back to the Laptops page
    public P03_LaptopsPage clickOnLaptopsPageBack() {
        clickOnElement(driver, LaptopsPageBack);
        return new P03_LaptopsPage(driver);
    }

    // TODO: Navigates back to the Headphones page
    public P04_HeadphonesPage clickOnHeadphonesPageBack() {
        clickOnElement(driver, HeadphonesPageBack);
        return new P04_HeadphonesPage(driver);
    }

    // TODO: Navigates back to the Tablets page
    public P05_TabletsPage clickOnTabletsPageBack() {
        clickOnElement(driver, TabletsPageBack);
        return new P05_TabletsPage(driver);
    }

    // TODO: Navigates back to the Speakers page
    public P06_SpeakersPage clickOnSpeakersPageBack() {
        clickOnElement(driver, SpeakersPageBack);
        return new P06_SpeakersPage(driver);
    }

    // TODO: Navigates back to the Mice page
    public P07_MicePage clickOnMicePageBack() {
        clickOnElement(driver, MicePageBack);
        return new P07_MicePage(driver);
    }


    //TODO: Gets the product title text
    public String getProductTitle() {
        return getText(driver, productTitle);
    }
    //TODO: Gets the product price text
    public String getProductPrice() {
        return getText(driver, productPrice);
    }


    // TODO: Checks if the product title matches the expected title
    public boolean isProductTitleEqualTo(String expectedTitle) {
        return getText(driver, productTitle).equals(expectedTitle);
    }

    // TODO: Checks if the product price matches the expected price
    public boolean isProductPriceEqualTo(String expectedPrice) {
        return getText(driver, productPrice).equals(expectedPrice);
    }



    // TODO: Selects the first color option
    public P08_ProductSpecificationsPage clickFirstColorRadioButton() {
        try {
        clickOnElement(driver, firstColor);
        } catch (Exception e) {
            // Handle the case where the first color choice is not available
            System.out.println("First color choice is not available: " + e.getMessage());
        }
        return this;
    }
    // TODO: Selects the second color option
    public P08_ProductSpecificationsPage clickSecondColorRadioButton() {
        try {
        clickOnElement(driver, secondColor);
        } catch (Exception e) {
            // Handle the case where the second color choice is not available
            System.out.println("Second color choice is not available: " + e.getMessage());
        }
        return this;
    }
    // TODO: Selects the third color option
    public P08_ProductSpecificationsPage clickThirdColorRadioButton() {
        try {
        clickOnElement(driver, thirdColor);
        } catch (Exception e) {
            // Handle the case where the third color choice is not available
            System.out.println("Third color choice is not available: " + e.getMessage());
        }
        return this;
    }


    // TODO: Checks if the first color option is selected
    public Boolean isFirstColorSelected() {
        return findWebElement(driver,firstColor).getAttribute("class").contains("colorSelected");
    }
    // TODO: Checks if the second color option is selected
    public Boolean isSecondColorSelected() {
        return findWebElement(driver,secondColor).getAttribute("class").contains("colorSelected");
    }
    // TODO: Checks if the third color option is selected
    public Boolean isThirdColorSelected() {
        return findWebElement(driver,thirdColor).getAttribute("class").contains("colorSelected");
    }









    // TODO: Increases the product quantity by the specified amount
    public P08_ProductSpecificationsPage clickOnAddQuantityButton(int quantity) {
        for (int i = 0; i < quantity; i++) {
            clickOnElement(driver, addQuantityButton);
        }
        return this;
    }
    // TODO: Decreases the product quantity by the specified amount
    public P08_ProductSpecificationsPage clickOnSubtractQuantityButton( int quantity) {
        for (int i = 0; i < quantity; i++) {
            clickOnElement(driver, subtractQuantityButton);
        }
        return this;
    }

    // TODO: Checks if the product quantity input field matches the expected number
    public boolean isQuantityInputFieldEqualTo(String number) {
        return findWebElement(driver, productQuantityInput).getAttribute("value").equals(number);
    }

    // TODO: Retrieves the text from the product quantity input field
    public String getQuantityNumber() {
        return findWebElement(driver, productQuantityInput).getAttribute("value");
    }


    // TODO: Sets the product quantity input field
    public P08_ProductSpecificationsPage setProductQuantity(String quantity) {
        clearAndSendData( driver, productQuantityInput, quantity);
        return this;
    }




    // TODO: Clicks the Add to Cart button
    public P08_ProductSpecificationsPage clickOnAddToCartButton() {
        clickOnElement(driver, addToCartButton);
        return this;
    }

    // TODO: Clicks the Shopping Cart icon and navigates to the Shopping Cart page
    public P09_ShoppingCartPage clickOnShoppingCart() throws IOException {
        clickOnElement(driver, ShoppingCartIcon);
        return new P09_ShoppingCartPage(driver);
    }

}
