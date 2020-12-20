package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Index {

    private WebElement searchBar;
    private WebElement storeInfoBlock;
    private List<WebElement> featuredItems;
    public Index(WebDriver driver){
        searchBar = driver.findElement(By.id("search_query_top"));
        storeInfoBlock = driver.findElement(By.id("block_contact_infos"));
        featuredItems = driver.findElements(By.cssSelector("#homefeatured>li"));
    }

    public String getAddress(){
        WebElement address = storeInfoBlock.findElement(By.xpath(".//li[1]"));
        return address.getText();
    }

    public String getMail(){

        WebElement email = storeInfoBlock.findElement(By.xpath("//li[3]//span//a"));
        return email.getText();
    }

    public String getPhone(){
        WebElement phone_number = storeInfoBlock.findElement(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[2]/span"));
        return phone_number.getText();
    }

    public void enterSearch(String searchCriteria){
        searchBar.sendKeys(searchCriteria);
        searchBar.sendKeys(Keys.ENTER);
    }

    public void openFeaturedItem (int index){
        WebElement item = featuredItems.get(index);
        item.click();
    }
}
