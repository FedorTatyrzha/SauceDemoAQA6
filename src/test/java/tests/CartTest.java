package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest extends BaseTest {
    @Test
    public void itemShouldBeAddedIntoCart() {
        //1. Залогинится
        //2. Добавить товар в корзину по имени
        //3. открыть корзину
        //4 . проверить товар в корзине
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);
        productsPage.addProduct("Sauce Labs Fleece Jacket");
        cartPage.openPage();
        assertEquals(cartPage.productList(), "Sauce Labs Fleece Jacket");

    }

    @Test
    public void addProductsIntoCart() {
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);
        productsPage.addProduct("Sauce Labs Backpack");
        productsPage.addProduct("Sauce Labs Bike Light");
        productsPage.addProduct("Sauce Labs Bolt T-Shirt");
        cartPage.openPage();
        assertEquals(cartPage.sizeList(), 3);

    }

    @Test
    public void allItemsThroughMenu() {
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);
        productsPage.addProduct("Sauce Labs Backpack");
        productsPage.addProduct("Sauce Labs Bike Light");
        productsPage.addProduct("Sauce Labs Bolt T-Shirt");
        cartPage.openPage();
        productsPage.openMenu();
        assertEquals(productsPage.allItems(), "div");

    }

    @Test
    public void continueShopping() {
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);
        productsPage.addProduct("Sauce Labs Backpack");
        cartPage.openPage();
        cartPage.clickContinueShopping();
        assertEquals(productsPage.secondPageUniqueLocator(), "div");
    }

}

