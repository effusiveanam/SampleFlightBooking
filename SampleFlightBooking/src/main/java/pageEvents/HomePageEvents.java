package pageEvents;



import org.openqa.selenium.WebElement;
import org.testng.Assert;


import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	
	ElementFetch ele = new ElementFetch();
	
	public void acceptCookies() 
	{
		WebElement cookie = ele.getWebElement("XPATH", HomePageElements.acceptCookies);
		if (cookie.isDisplayed()) {
			cookie.click();
		}
		
	}
	
	public void verifyIfPageIsLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", HomePageElements.destinationTextBox).size()>0, "Element not found");
	}
	
	public void enterDestination1()
	{
		ele.getWebElement("XPATH", HomePageElements.destinationTextBox).sendKeys("Muscat");

	}
	
	public void enterDestination2()
	{
		ele.getWebElement("XPATH", HomePageElements.destinationTextBox).sendKeys("Riyadh");

	}
	
	public void enterDestination3()
	{
		ele.getWebElement("XPATH", HomePageElements.destinationTextBox).sendKeys("Kuwait City");
		
	}
	
	public void selectTheDestination()
	{
		ele.getWebElement("XPATH", HomePageElements.destination).click();
		
	}
	
	public void selectFlexible()
	{
		WebElement dropDown = ele.getWebElement("XPATH", HomePageElements.departureDateDropDown);
		if (dropDown.isDisplayed()) {
			ele.getWebElement("XPATH", HomePageElements.dateFlexibleCheckBox).click();
		}
		
	}
	
	public void selectOneWay()
	{
		WebElement dropDown = ele.getWebElement("XPATH", HomePageElements.oneWayText);
		if (dropDown.isDisplayed()) {
			ele.getWebElement("XPATH", HomePageElements.oneWayCheckBox).click();
		}
	}
	
	public void selectDepartureDate() 
	{
		ele.getWebElement("XPATH", HomePageElements.departureDate).click();
	}
	
	public void searchFlight() 
	{
		ele.getWebElement("XPATH", HomePageElements.searchFlight).click();
	}
	
}
