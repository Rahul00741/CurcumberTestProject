package com.StepDefinition;

import java.io.IOException;

import com.BaseClass.Library;
import com.Pages.Login;
import com.SeleniumReusableFuntion.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage_TestCase extends Library{
	
	SeleniumUtility  selut;
	Login login;
	
	@Given("^Open the browser and naviate to url$")
	public void open_the_browser_and_naviate_to_url() throws IOException  {
		launchApp();
	   
	}

	@When("^To verify the page title$")
	public void to_verify_the_page_title()  {
		selut=	new SeleniumUtility(driver);
	  selut.getTitle();
	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String username, String password)  {
		
		login = new Login(driver);
		login.Login_Username(username);
		login.Login_Password(password);
	   
	}

	@Then("^Click on login button$")
	public void click_on_login_button()  {
	   login.Login_Button();
	}

	@Then("^Take screenshot and close the browser$")
	public void take_screenshot_and_close_the_browser()  {
	    //selut.snapshot("LoginPage");
	    tearDown();
	}


}
