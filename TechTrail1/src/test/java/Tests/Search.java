package Tests;

import Base.DriverManager;
import Pages.Index;
import Pages.SearchResults;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search {
    @Test
    public void Search_Positive(){
        WebDriver chromeDriver = DriverManager.getCleanDriver();
        Index indexPage = new Index(chromeDriver);
        indexPage.enterSearch("Dress");

        SearchResults searchResultsPage = new SearchResults(chromeDriver);

        Assert.assertTrue(searchResultsPage.getSearchResultCount()>0);
    }

    @Test
    public void Search_Negative(){
        WebDriver chromeDriver = DriverManager.getCleanDriver();
        Index indexPage = new Index(chromeDriver);
        indexPage.enterSearch("NoResultsPlz");

        SearchResults searchResultsPage = new SearchResults(chromeDriver);

        Assert.assertEquals(searchResultsPage.getNoResultsMessage(),"No results were found for your search \"NoResultsPlz\"");
        Assert.assertEquals(searchResultsPage.getResultCountMessage(),"0 results have been found.");
    }
}
