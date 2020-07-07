package com.StepDefinition;

import java.io.IOException;

import com.BaseClass.Library;
import com.Pages.Login;
import com.Pages.OrangeHRM_Admin_Configuration_EmailConfiguration;
import com.Pages.OrangeHRM_Admin_Configuration_EmailSubscriptions;
import com.SeleniumReusableFuntion.SeleniumUtility;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Admin_Configuration_EmailSubscription_TestCase extends Library
{

	SeleniumUtility  selut;
	Login login;
	OrangeHRM_Admin_Configuration_EmailSubscriptions emailsubscription;
	

	
		@When("^Go to Admin Link$")
		public void go_to_Admin_Link() throws IOException  {
			emailsubscription = new OrangeHRM_Admin_Configuration_EmailSubscriptions(driver);
			
			emailsubscription.AdminLink();
			
	       }

		@Then("^Click on Configuration$")
		public void click_on_Configuration() {
	    	emailsubscription.Admin_Configuration();
	    }

	    @Then("^Click on Email Subscriptions$")
	    public void click_on_email_subscriptions()  {
	    	emailsubscription.Admin_Configuration_EmailSubscriptions();
	    }

	    @Then("^Click on Edit Btn$")
	    public void click_on_edit_btn() {
	    	emailsubscription.Admin_Configuration_EmailSubscriptions_Editbtn();
	    }


	    @Then("^Click on Leave Assignment Check box$")
	    public void click_on_Leave_Assignment_Check_box() throws InterruptedException  {
	    	emailsubscription.EnableEmaiNotiffication();
	    }

	    @Then("^Click on Save Btn$")
	    public void click_on_save_btn()  {
	    	emailsubscription.Admin_Configuration_EmailSubscriptions_Savebtn();
	    }

	    @Then("^Close the browser$")
		public void close_the_browser() {
	        selut = new SeleniumUtility(driver);
	        selut.snapshot( "OrangeHRM_Admin_Configuration_EmailSubscription");
	        tearDown();
	    }
	
	
	
	
}
