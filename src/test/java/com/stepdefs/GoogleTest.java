package com.stepdefs;

import BDDPOM.BaseFile;
import cucumber.api.java.en.Given;

public class GoogleTest extends BaseFile {
	
	@Given("^user should be on Google page$")
	public void user_should_be_on_Google_page() throws Throwable {
		launchBrowser();
		driver.get("https://www.google.co.in/");
	    
	}

}
