package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    public static final By ITEM_NAME = By.cssSelector(".inventory_item_name");
    public static final By CHECKOUT_BUTTON = By.cssSelector(".btn_action.checkout_button");
    public static final By CONTINUE_SHOPPING = By.xpath("//*[contains(text(),'Continue Shopping')]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        //      driver.get("https://www.saucedemo.com/cart.html");
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    public String productList() {
        return driver.findElement(ITEM_NAME).getText();
    }

    public int sizeList() {
        List<WebElement> elements = driver.findElements(ITEM_NAME);
        return elements.size();
    }

    public void clickContinueShopping() {
        driver.findElement(CONTINUE_SHOPPING).click();

    }

    public void checkOut() {
        driver.findElement(CHECKOUT_BUTTON).click();
    }

}


