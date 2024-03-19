package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;

public class Destination_Riyadh extends BaseTest {
	
	HomePageEvents homepage = new HomePageEvents();
  @Test
 public void sampleMethodForDestination2() {
	  
	  homepage.acceptCookies();
	  homepage.verifyIfPageIsLoaded();
	  homepage.enterDestination2();
	  homepage.selectTheDestination();
	  homepage.selectFlexible();
	  homepage.selectOneWay();
	  homepage.selectDepartureDate();
	  homepage.searchFlight();
  }
}
