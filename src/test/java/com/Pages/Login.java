package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;


	public Login(WebDriver rdriver){
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "txtUsername")
	WebElement Username;

	@FindBy(id = "txtPassword")
	WebElement Password;

	@FindBy(id = "btnLogin")
	WebElement LoginButton;

	//@FindBy(id = "forgotPasswordLink")
	//WebElement ForgetPasswordButton;

	public void Login_Username(String uname) {
		Username.sendKeys(uname);
	}

	public void Login_Password(String pwd) {
		Password.sendKeys(pwd);
	}

	public void Login_Button() {
		LoginButton.click();
	}

	//public void Login_ForgetPasswordButton() {
//		ForgetPasswordButton.click();
	//}	
	

}
