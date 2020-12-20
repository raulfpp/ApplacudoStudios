package Tests;

import Base.DriverManager;
import Pages.Index;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreInfo  {
    @Test
    public void validateStoreInfo_NoScroll(){

        WebDriver chromeDriver = DriverManager.getCleanDriver();
        Index indexPage = new Index(chromeDriver);
        Assert.assertEquals(indexPage.getAddress(),"Selenium Framework, Research Triangle Park, North Carolina, USA");
        Assert.assertEquals(indexPage.getMail(),"support@seleniumframework.com");
        Assert.assertEquals(indexPage.getPhone(),"(347) 466-7432");

    }


}
