package Tests;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StoreInfo extends TestBase {
    @Test
    public void validateStoreInfo_NoScroll(){

        WebElement storeInfoBlock = chromeDriver.findElement(By.id("block_contact_infos"));

        WebElement address = storeInfoBlock.findElement(By.xpath(".//li[1]"));
        Assert.assertEquals(address.getText(),"Selenium Framework, Research Triangle Park, North Carolina, USA");


        WebElement email = storeInfoBlock.findElement(By.xpath("//li[3]//span//a"));
        Assert.assertEquals(email.getText(),"support@seleniumframework.com");

        WebElement phone_number = storeInfoBlock.findElement(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[2]/span"));
        Assert.assertEquals(phone_number.getText(),"(347) 466-7432");
    }
}
