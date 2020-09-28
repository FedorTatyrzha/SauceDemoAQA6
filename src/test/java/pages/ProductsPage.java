package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    String productLocator = ("//*[contains(text(),'%s')]/ancestor::div[@class='inventory_item']//*[text()='ADD TO CART']");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public void addProduct(String productName) {
        driver.findElement(By.xpath(String.format(productLocator, productName))).click();

    }

    public void openMenu() {
        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
    }

    public String allItems() {
        driver.findElement(By.id("inventory_sidebar_link")).click();
        return driver.findElement(By.cssSelector(".product_label")).getTagName();
    }

    public String secondPageUniqueLocator() {
        return driver.findElement(By.cssSelector(".product_label")).getTagName();
    }
}
