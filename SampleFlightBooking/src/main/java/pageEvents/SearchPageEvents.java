package pageEvents;

import org.testng.Assert;

import pageObjects.HomePageElements;
import pageObjects.searchPageElements;
import utils.ElementFetch;

public class SearchPageEvents {
	
	ElementFetch ele = new ElementFetch();
	
	public void verifyIfPageIsLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", searchPageElements.searchLoading).size()>0, "Element not found");
	}
	
    public void validateResult() 
    {
    	//Assertions for search result validations
    	String ActualTitle = ele.getWebElement("XPATH", HomePageElements.departureDate).getText();
    	String ExpectedTitle = ele.getWebElement("XPATH", searchPageElements.searchDateResult).getText();
    	Assert.assertEquals(ActualTitle, ExpectedTitle);
    	System.out.println("Assert passed");
    	
    }
}
