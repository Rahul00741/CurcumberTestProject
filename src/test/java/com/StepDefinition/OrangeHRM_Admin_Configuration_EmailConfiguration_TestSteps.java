package com.StepDefinition;

import java.io.IOException;

import com.BaseClass.Library;
import com.Pages.Login;
import com.Pages.OrangeHRM_Admin_Configuration_EmailConfiguration;
import com.SeleniumReusableFuntion.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Admin_Configuration_EmailConfiguration_TestSteps extends Library
{

	SeleniumUtility  selut;
	Login login;
	OrangeHRM_Admin_Configuration_EmailConfiguration emailconfiguration;
	
	@Given("^Launch the browser and Navigate to urll$")
	public void launch_the_browser_and_Navigate_to_Admin_Link() throws IOException  {
	    
		launchApp();
	}

	@When("^To Validate the title of Loginpage$")
	public void to_Validate_the_title_of_Loginpage()  {
	    
	    selut = new SeleniumUtility(driver);
	    selut.getTitle();
	}

	@Then("^Enter uname and pwd$")
	public void enter_uname_and_pwd()  {
	    login = new Login(driver);
	    login.Login_Username("Admin");
	    login.Login_Password("admin123");
//	    login.Login_Button();
	    
	}

	@Then("^Click on Submit Button$")
	public void click_on_Submit_Button()  {
	    login.Login_Button();
	}

	@When("^Application should be opened and navigate to Admin Link$")
	public void application_should_be_opened_and_navigate_to_Admin_Link()  {
		
		emailconfiguration = new OrangeHRM_Admin_Configuration_EmailConfiguration(driver);
		emailconfiguration.AdminLink();
	    
	}

	@Then("^Click on Configuration tab$")
	public void click_on_Configuration_tab()  {
		emailconfiguration.Admin_Configuration();
	}

	@Then("^Click on Email Configuration$")
	public void click_on_Email_Configuration()  {
		emailconfiguration.Admin_Configuration_EmailConfiguration();  
	}
	
	@Then("^Click on Edit Button$")
	public void click_on_Edit_Button() throws InterruptedException  {
		
		emailconfiguration.Admin_Configuration_EmailConfiguration_Editbtn();
		Thread.sleep(2000);
	}

	@Then("^Enter the Email id$")
	public void enter_the_Email_id()  {
		emailconfiguration.Admin_Configuration_EmailConfiguration_MailSentAs("admin@gmail.com");
	}

	@Then("^Select <\"([^\"]*)\">$")
	public void select(String arg1)  {
		emailconfiguration.Admin_Configuration_EmailConfiguration_SendingMethodDropDown();
	}
	
	@Then("^Click on Send Text Email checkbox$")
	public void click_on_Send_Text_Email_checkbox() {
		emailconfiguration.Admin_Configuration_EmailConfiguration_SendTestEmail();
	}

	@Then("^Enter Test Email Adresss$")
	public void enter_Test_Email_Adresss()  {
		emailconfiguration.Admin_Configuration_EmailConfiguration_TestEmailAddrs("admin@gmail.com");
	}

	@Then("^Click on Save Button$")
	public void click_on_Save_Button()  {
		emailconfiguration.Admin_Configuration_EmailConfiguration_Savebtn();
	}
	
	@Then("^Close the Email Configuration browser$")
	public void close_the_Email_Configuration_browser()  {
	   tearDown();
	}
//	@Then("^Close the browser$")
//	public void close_the_browser()  {
//				tearDown();
//	}
}
