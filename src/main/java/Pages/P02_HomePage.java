package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.Utility.*;

public class P02_HomePage {
    private final WebDriver driver;
    //TODO: Add locators for the home page elements
    private final By HomeLogo = By.className("logo");
    private final By ShoppingCart = By.id("shoppingCartLink");
    private final By UserMenu = By.id("menuUserLink");
    //private final By searchBox = By.id("autoComplete");
    private final By searchIcon = By.id("menuSearch");
    private final By searchBar = By.id("autoComplete");
    private final By searchResultLabel = By.id("searchResultLabel");
    //TODO: Add more locators for the home page Products as needed
    private final By SpeakersCategory = By.id("speakersImg");
    private final By TabletsCategory = By.id("tabletsImg");
    private final By HeadphonesCategory = By.id("headphonesImg");
    private final By MiceCategory = By.id("miceImg");
    private final By LaptopsCategory = By.id("laptopsImg");
    private final By seeOfferButton = By.id("see_offer_btn");
    private final By exploreNowButton = By.xpath("//button[@name='explore_now_btn']");
    //TODO: Add more locators for the POPULAR ITEMS Products
    private final By popularItem1 = By.id("details_16");
    private final By popularItem2 = By.id("details_10");
    private final By popularItem3 = By.id("details_21");
    //TODO: Add more locators for CONTACT US
    private final By categoryListBoxContactUs = By.xpath("//select[@name='categoryListboxContactUs']");
    private final By productListBoxContactUs = By.xpath("//select[@name='productListboxContactUs']");
    private final By emailContactUs = By.xpath("//input[@name='emailContactUs']");
    private final By subjectTextareaContactUs = By.xpath("//textarea[@name='subjectTextareaContactUs']");
    private final By ContactUsSendButton = By.id("send_btn");
    private final By continueShoppingButton = By.xpath("//a[normalize-space()='CONTINUE SHOPPING']");
    private final By ContactUsSuccessMessage = By.xpath("//div[@id='registerSuccessCover']//div[@class='center']");
    private final By goUpButton = By.xpath("//img[@name='go_up_btn']");
    //TODO: Add more locators for the page footer as needed
    private final By facebookLink = By.cssSelector("a[href*='facebook.com']");
    private final By twitterLink = By.cssSelector("a[href*='twitter.com']");
    private final By linkedinLink = By.cssSelector("a[href*='linkedin.com']");


    public P02_HomePage(WebDriver driver) {
        this.driver = driver;
    }


    //TODO: Clicks on the popular item 1
    public P08_ProductSpecificationsPage clickOnPopularItem1() {
        clickOnElement(driver, popularItem1);
        return new P08_ProductSpecificationsPage(driver);
    }

    //TODO: Clicks on the popular item 2
    public P08_ProductSpecificationsPage clickOnPopularItem2() {
        clickOnElement(driver, popularItem2);
        return new P08_ProductSpecificationsPage(driver);
    }

    //TODO: Clicks on the popular item 3
    public P08_ProductSpecificationsPage clickOnPopularItem3() {
        clickOnElement(driver, popularItem3);
        return new P08_ProductSpecificationsPage(driver);
    }







    //TODO: select category ListBox in the Contact Us page
    public P02_HomePage selectCategoryListBoxContactUs(String category) {
        dropDownSelect(driver, categoryListBoxContactUs, category);
        return this;
    }

    //TODO : Select Product ListBox in the Contact Us page
    public P02_HomePage selectProductListBoxContactUs(String product) {
        dropDownSelect(driver, productListBoxContactUs, product);
        return this;
    }
    //TODO : send Email in the Contact Us page
    public P02_HomePage sendEmailContactUs(String email) {
        sendData(driver, emailContactUs, email);
        return this;
    }

    //TODO : send Subject in the Contact Us page
    public P02_HomePage sendSubjectTextareaContactUs(String subject) {
        sendData(driver, subjectTextareaContactUs, subject);
        return this;
    }

    //TODO : Clicks on the Send button in the Contact Us page
    public P02_HomePage clickOnContactUsSendButton() {
        clickOnElement(driver, ContactUsSendButton);
        return this;
    }

    //TODO : Clicks on the Continue Shopping button in the Contact Us page
    public P02_HomePage clickOnContinueShoppingButton() {
        clickOnElement(driver, continueShoppingButton);
        return this;
    }

    //TODO : Clicks on the Go up button in the Home page
    public P02_HomePage clickOngoUpIcon() {
        clickOnElement(driver, goUpButton);
        return this;
    }




    //TODO: Clicks on the home logo element
    public P02_HomePage clickOnHomeLogo() {
        clickOnElement(driver, HomeLogo);
        return this;
    }
    //TODO: Clicks on the shopping cart link
    public P09_ShoppingCartPage clickOnShoppingCart() {
        clickOnElement(driver, ShoppingCart);
        return new P09_ShoppingCartPage(driver);
    }
    //TODO: Clicks on the user menu link
    public P02_HomePage clickOnUserMenu() {
        clickOnElement(driver, UserMenu);
        return this;
    }

    //TODO: Clicks on the search icon
    public P02_HomePage clickOnSearchIcon() {
        clickOnElement(driver, searchIcon);
        return this;
    }
    //TODO: Sends text to the search bar
    public P02_HomePage enterDataToSearchBar(String searchText ) {
        sendData(driver, searchBar, searchText);
        pressEnter(driver, searchBar);
        return this;
    }






    //TODO: Clicks on the laptops category and navigates to laptops page
    public P03_LaptopsPage clickOnLaptopsCategory() {
        clickOnElement(driver, LaptopsCategory);
        return new P03_LaptopsPage(driver);
    }

    //TODO: Clicks on the headphones category and navigates to headphones page
    public P04_HeadphonesPage clickOnHeadphonesCategory() {
        clickOnElement(driver, HeadphonesCategory);
        return new  P04_HeadphonesPage(driver);
    }

    //TODO: Clicks on the tablets category and navigates to tablets page
    public P05_TabletsPage clickOnTabletsCategory() {
        clickOnElement(driver, TabletsCategory);
        return new P05_TabletsPage(driver);
    }

    //TODO: Clicks on the speakers category and navigates to speakers page
    public P06_SpeakersPage clickOnSpeakersCategory() {
        clickOnElement(driver, SpeakersCategory);
        return new P06_SpeakersPage(driver);
    }

    //TODO: Clicks on the mice category and navigates to mice page
    public P07_MicePage clickOnMiceCategory() {
        clickOnElement(driver, MiceCategory);
        return new P07_MicePage(driver);
    }

    //TODO: Clicks on the see offer button
    public P02_HomePage clickOnSeeOfferButton() {
        clickOnElement(driver, seeOfferButton);
        return this;
    }



    //TODO: Checks if the search result label is displayed with the specified text
    public boolean isSearchResultLabelDisplayedWithText(String searchText) {
            return getText(driver, searchResultLabel).contains(searchText);
    }






    // TODO : Clicks on the Facebook footer link and returns its href
    public String clickOnFacebookLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        var element = wait.until(ExpectedConditions.presenceOfElementLocated(facebookLink));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (org.openqa.selenium.ElementNotInteractableException e) {
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
        return element.getAttribute("href");
    }

    // TODO : Clicks on the Twitter footer link and returns its href
    public String clickOnTwitterLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        var element = wait.until(ExpectedConditions.presenceOfElementLocated(twitterLink));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (org.openqa.selenium.ElementNotInteractableException e) {
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
        return element.getAttribute("href");
    }

    // TODO : Clicks on the LinkedIn footer link and returns its href
    public String clickOnLinkedinLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        var element = wait.until(ExpectedConditions.presenceOfElementLocated(linkedinLink));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (org.openqa.selenium.ElementNotInteractableException e) {
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
        return element.getAttribute("href");
    }

    //TODO: Checks if the Facebook link is displayed
    public boolean isFacebookLinkDisplayed() {
        return findWebElement( driver,facebookLink).isDisplayed();
    }

    //TODO: Checks if the Twitter link is displayed
    public boolean isTwitterLinkDisplayed() {
        return findWebElement( driver,twitterLink).isDisplayed();
    }

    //TODO: Checks if the LinkedIn link is displayed
    public boolean isLinkedinLinkDisplayed() {
        return findWebElement( driver,linkedinLink).isDisplayed();
    }

    //TODO: Gets the href attribute of the Facebook link
    public String getFacebookLinkHref() {
        return findWebElement( driver,facebookLink).getAttribute("href");
    }

    //TODO: Gets the href attribute of the Twitter link
    public String getTwitterLinkHref() {
        return findWebElement( driver,twitterLink).getAttribute("href");
    }

    //TODO: Gets the href attribute of the LinkedIn link
    public String getLinkedinLinkHref() {
        return findWebElement( driver,linkedinLink).getAttribute("href");
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isContactUsSuccessMessageDisplayed() {
        return getText(driver, ContactUsSuccessMessage).contains("Thank you for contacting Advantage support.");
    }




    /*
    public P02_HomePage clickOnExploreNowButton() {
        List<WebElement> buttons = driver.findElements(exploreNowButton);
        for (WebElement btn : buttons) {
            if (btn.isDisplayed() && btn.isEnabled()) {
                btn.click();
                break;
            }
        }
        return this;
    }
    public P02_HomePage clickOnExploreNowButton() {
        scroll(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(exploreNowButton));
        clickOnElement(driver, exploreNowButton);
        return this;
    }

     */





}
