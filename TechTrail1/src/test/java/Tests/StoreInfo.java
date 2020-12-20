package Tests;

import Base.TestBase;
import Pages.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StoreInfo extends TestBase {
    @Test
    public void validateStoreInfo_NoScroll(){

        Index indexPage = new Index(chromeDriver);
        Assert.assertEquals(indexPage.getAddress(),"Selenium Framework, Research Triangle Park, North Carolina, USA");
        Assert.assertEquals(indexPage.getMail(),"support@seleniumframework.com");
        Assert.assertEquals(indexPage.getPhone(),"(347) 466-7432");

    }


}
