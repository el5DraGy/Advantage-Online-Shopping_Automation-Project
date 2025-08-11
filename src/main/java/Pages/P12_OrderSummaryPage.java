package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utilities.Utility.getText;

public class P12_OrderSummaryPage {
    private final WebDriver driver;
    private final By orderSummarySection = By.xpath("//span[contains(@class,'roboto-regular ng-scope')]");

    public P12_OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOrderSummaryPageDisplayed( ) {
        return getText(driver,orderSummarySection ).equals(getOrderSummaryTitle());
    }
    public String getOrderSummaryTitle() {
        return getText(driver, orderSummarySection);
    }
}
