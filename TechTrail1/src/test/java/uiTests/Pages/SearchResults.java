package uiTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResults {
    List<WebElement> searchResults;
    WebElement errorMessage;
    WebElement resultCountMessage;
    public SearchResults(WebDriver driver){
        resultCountMessage = driver.findElement(By.cssSelector("span.heading-counter"));
        int resultsNumber = Integer.parseInt( resultCountMessage.getText().split(" ")[0]);
        searchResults = new ArrayList<WebElement>();
        if (resultsNumber > 0)
            { searchResults = driver.findElements(By.cssSelector("ul.product_list>*"));}
        else {
            errorMessage = driver.findElement(By.cssSelector("p.alert.alert-warning"));
        }

    }

    public String getResultCountMessage(){
        return resultCountMessage.getText();
    }

    public String getNoResultsMessage(){
        return errorMessage.getText();
    }

    public int getSearchResultCount(){
        return searchResults.size();
    }
}
