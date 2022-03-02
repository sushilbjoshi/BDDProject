package com.stepdefs;

import BDDPOM.GoibiboFlightsPOM;
import BDDPOM.GoibiboHotelsPOM;
import BDDPOM.BaseFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GoibiboTest extends BaseFile {
	@Given("^user should be on flights page$")
	public void user_should_be_on_flights_page() throws Throwable {

		launchBrowser();
		driver.get("https://www.goibibo.com/flights/");//background
		driver.manage().window().maximize();

	}

	@When("^user enters source destination date clicks search$")
	public void user_enters_source_destination_date_clicks_search() throws Throwable {
		GoibiboFlightsPOM flightspage = new GoibiboFlightsPOM(driver);
		flightspage.searchFlights("Pune", "New York");

	}

	@Then("^Flights should be displayed$")
	public void flights_should_be_displayed() throws Throwable {

		String expTitle = "Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Package at Goibibo";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, actualTitle);
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and date clicks search$")
	public void user_enters_and_and_date_clicks_search(String source, String destination) throws Throwable {
		GoibiboFlightsPOM flightspage = new GoibiboFlightsPOM(driver);
		flightspage.searchFlights(source, destination);
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {

		driver.close();

	}

	@Given("^user should be on hotels page$")
	public void user_should_be_on_hotels_page() throws Throwable {

		launchBrowser();
		driver.get("https://www.goibibo.com/hotels/");
		driver.manage().window().maximize();

	}

	@When("^user enters Where dates clicks search$")
	public void user_enters_Where_dates_clicks_search() throws Throwable {
		
		GoibiboHotelsPOM hotelsPage = new GoibiboHotelsPOM(driver);
		
		hotelsPage.serachHotels("Pune", "13", "15", "December 2021");
		

	}

	@Then("^Hotels should be displayed$")
	public void hotels_should_be_displayed() throws Throwable {
		
		System.out.println(driver.getTitle());

		String expTitle = "Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Package at Goibibo";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, actualTitle);
		
		
	}

}
