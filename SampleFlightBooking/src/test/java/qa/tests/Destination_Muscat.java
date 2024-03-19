package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.SearchPageEvents;

public class Destination_Muscat extends BaseTest {
	
	HomePageEvents homepage = new HomePageEvents();
	SearchPageEvents searchpage = new SearchPageEvents();
  @Test
  public void sampleMethodForDestination1() {
	  
	  homepage.acceptCookies();
	  try{
		  Thread.sleep(5000);
		  }
		  catch(InterruptedException ie){
		  }
	  homepage.verifyIfPageIsLoaded();
	  homepage.enterDestination1();
	  homepage.selectTheDestination();
	  try{
		  Thread.sleep(5000);
		  }
		  catch(InterruptedException ie){
		  }
	  homepage.selectFlexible();
	  homepage.selectOneWay();
	  homepage.selectDepartureDate();
	  homepage.searchFlight();
	  searchpage.verifyIfPageIsLoaded();
	  try{
		  Thread.sleep(10000);
		  }
		  catch(InterruptedException ie){
		  }
	  
  }
}
