package com.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Library;
import com.Pages.Login;
import com.Pages.OrangeHRM_Leave_AssignLeave;
import com.SeleniumReusableFuntion.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class OrangeHRM_Leave_AssignLeave_TestCase extends Library

{
	Login login;
	SeleniumUtility selut;
	OrangeHRM_Leave_AssignLeave assignleave;
	
	@Given("^Launch the browser and Navigate to url$")
	public void launch_the_browser_and_Navigate_to_url() throws IOException  {
		launchApp();
	}
	
	@Then("^Enter username and password$")
	public void enter_username_and_password()  {
		login = new Login(driver);
	    login.Login_Username("Admin");
	    login.Login_Password("admin123");
	}

	@Then("^Click on login Button$")
	public void click_on_login_Button()  {
		login.Login_Button();
	}
	
	
	@When("^User should be on Home page and navigate to Assign Leave Tab$")
	public void user_should_be_on_Home_page_and_navigate_to_Assign_Leave_Tab() throws IOException  {
		
		assignleave = new OrangeHRM_Leave_AssignLeave(driver);
		assignleave.Leave_leavelink();
		assignleave.Leave_AssignLeave();
		
	}
	@Then("^Enter \"([^\"]*)\"$")
	public void enter(String emp)  {
		 assignleave.Leave_AssignLeave_EmployeeName("Linda Anderson");
	    }
	
	
	@Then("^Select \"([^\"]*)\" and Leave Duration$")
	public void select_and_Leave_Duration(String value) throws InterruptedException  {
	   
		selut = new SeleniumUtility(driver);
		assignleave.Leave_AssignLeave_LeaveTypeDropdwon(value);
		Thread.sleep(5000);
		if(value == "FMLA US")
		{
			assignleave.Leave_AssignLeave_FromDate("2020-06-03");
			assignleave.Leave_AssignLeave_ToDate("2020-06-03");
			assignleave.Leave_AssignLeave_Comments("Full Day");
		}
	}
	
	@Then("^Click Assign Button$")
	public void click_Assign_Button() {
		assignleave.Leave_AssignLeave_Assignbtn();
	}
	
	@Then("^Close the Browser$")
	public void close_the_Browser()  {
	    
		selut.snapshot("OrangeHRM_Leave_AssignLeave");
		tearDown();
	}
}
