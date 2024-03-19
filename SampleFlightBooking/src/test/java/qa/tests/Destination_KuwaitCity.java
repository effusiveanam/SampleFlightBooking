package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;

public class Destination_KuwaitCity extends BaseTest {
	
	HomePageEvents homepage = new HomePageEvents();
	
  @Test
 public void sampleMethodForDestination3() {
	  
	  homepage.acceptCookies();
	  homepage.verifyIfPageIsLoaded();
	  homepage.enterDestination3();
	  homepage.selectTheDestination();
	  homepage.selectFlexible();
	  homepage.selectOneWay();
	  homepage.selectDepartureDate();
	  homepage.searchFlight();
 }
}
