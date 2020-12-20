package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage {
    List<WebElement> cartItems;
    public CartPage(WebDriver driver){
        cartItems = driver.findElements(By.cssSelector("tbody>tr"));
    }

    public List<String> getProductNamesInCart(){
        ArrayList<String> productNames = new ArrayList<String>();

        for (WebElement item: cartItems) {
            productNames.add(item.findElement(By.cssSelector("p.product-name>a")).getText());
        }

        return  productNames;
    }

    public void deleteItemFromCart(int index){
        WebElement item = cartItems.get(index);
        WebElement deleteButton = item.findElement(By.cssSelector("a.cart_quantity_delete"));
        deleteButton.click();
    }

    public void reloadCart(WebDriver driver){
        cartItems = new ArrayList<WebElement>();
        cartItems = driver.findElements(By.cssSelector("tbody>tr"));
    }
}
