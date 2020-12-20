package uiTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Form1 {

    public WebDriver driver;
    public WebElement firstName;
    public WebElement phoneNumber;
    public WebElement gender;
    public WebElement tittle;
    public WebElement submit;

    public By lastName = By.id("lastName");

    public Form1(WebDriver driver){
        this.driver = driver;
        firstName = driver.findElement(By.id("firstName"));
        gender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
        phoneNumber = driver.findElement(By.id("userNumber"));
        submit = driver.findElement(By.id("submit"));
        tittle = driver.findElement(By.xpath("//*[@id=\\\"genterWrapper\\\"]/div[2]/div[2]/label"));
    }
}
