package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Form1;


public class LlenarFormulario extends  TestBase {

    @Test
    public void LlenarFormularioInformacionMinima(){
        Form1 form = new Form1(chromeDriver);

        form.firstName.sendKeys("Karen");
        chromeDriver.findElement(form.lastName).sendKeys("Liska");
        form.phoneNumber.sendKeys("5021234567");
        form.gender.click();
        form.submit.click();
    }
}
