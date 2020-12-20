package Tests;

import Base.TestBase;
import Pages.CartPage;
import Pages.Index;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ShoppingCart extends TestBase {
    @Test
    public void addToCart(){
        Index indexPage = new Index(chromeDriver);
        indexPage.openFeaturedItem(0);

        ProductPage productPage = new ProductPage(chromeDriver);
        String productName = productPage.getName();
        productPage.clickAddToCartButton();

        CartPage cartPage = new CartPage(chromeDriver);
        List<String> productsInCart = cartPage.getProductNamesInCart();

        Assert.assertTrue(productsInCart.contains(productName));

    }

    @Test
    public void deleteFromCart() throws InterruptedException {
        Index indexPage = new Index(chromeDriver);
        indexPage.openFeaturedItem(0);

        ProductPage productPage = new ProductPage(chromeDriver);
        String productName = productPage.getName();
        productPage.clickAddToCartButton();

        CartPage cartPage = new CartPage(chromeDriver);
        cartPage.deleteItemFromCart(0);

        Thread.sleep(1000);
        cartPage.reloadCart(chromeDriver);
        List<String> productsInCart = cartPage.getProductNamesInCart();

        Assert.assertFalse(productsInCart.contains(productName));
    }
}
