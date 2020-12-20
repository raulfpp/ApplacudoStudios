package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebElement name;
    WebElement addToCartButton;
    WebElement confirmButton;

    public ProductPage(WebDriver driver){
        name = driver.findElement(By.cssSelector("h1[itemprop]"));
        addToCartButton = driver.findElement(By.name("Submit"));
        confirmButton = driver.findElement(By.cssSelector("div.layer_cart_cart>div>a>span"));
    }

    public String getName(){
        return name.getText();
    }

    public void clickAddToCartButton() throws InterruptedException {
        addToCartButton.click();
        Thread.sleep(1000);
        confirmButton.click();
    }
}
