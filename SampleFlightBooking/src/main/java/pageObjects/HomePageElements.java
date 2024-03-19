package pageObjects;

public interface HomePageElements {
	
	String acceptCookies = "//*[@id=\"onetrust-accept-btn-handler\"]";
	String destinationTextBox = "/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[1]/div/input";
	String destination = "/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[2]/section/ol/li/div";
    String departureDateDropDown = "//*[@id=\"search-flight-control\"]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[1]/h2";
	String dateFlexibleCheckBox = "//*[@id=\"search-flight-control\"]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[1]/div/label[1]/input";
	String oneWayText = "/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[1]/div/label[2]";
    String oneWayCheckBox = "/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[1]/div/label[2]/input";
    String departureDate = "/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[3]/table/tbody/tr[5]/td[2]/button";
    String searchFlight = "//*[@id=\"search-flight-control\"]/section/div[4]/div[2]/div[3]/form/button";
}