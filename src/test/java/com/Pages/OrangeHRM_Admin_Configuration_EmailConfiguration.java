package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SeleniumReusableFuntion.SeleniumUtility;





public class OrangeHRM_Admin_Configuration_EmailConfiguration 
{
	WebDriver driver;
	SeleniumUtility selut = new SeleniumUtility(driver);
	
	public OrangeHRM_Admin_Configuration_EmailConfiguration (WebDriver ldriver)
	{
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']/b")
	WebElement AdminLink;
	
	@FindBy(xpath="(//*[@class='arrow'])[5]")
	WebElement Admin_Configuration;
	
	@FindBy(xpath="//a[text()='Email Configuration']")
	WebElement Admin_Configuration_EmailConfiguration;
	
	@FindBy(xpath="//input[@id='editBtn']")
	WebElement Admin_Configuration_EmailConfiguration_Editbtn;
	
	@FindBy(xpath="//input[@id='emailConfigurationForm_txtMailAddress']")
	WebElement Admin_Configuration_EmailConfiguration_MailSentAs;
	
	@FindBy(xpath="//*[@id='emailConfigurationForm_cmbMailSendingMethod'][1]")
	WebElement Admin_Configuration_EmailConfiguration_SendingMethod;
	
	@FindBy(id = "emailConfigurationForm_chkSendTestEmail")
	WebElement Admin_Configuration_EmailConfiguration_SendTestEmail;
	
	@FindBy (id = "emailConfigurationForm_txtTestEmail")
	WebElement Admin_Configuration_EmailConfiguration_TestEmailAddrs;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement Admin_Configuration_EmailConfiguration_Savebtn;
	
	@FindBy(xpath="//input[@value='Reset']")
	WebElement Admin_Configuration_EmailConfiguration_Resetbtn;
	
	
	//Click on Admin Link
	public void AdminLink(){
		AdminLink.click();
	}
	
	//Click on Configuration
	public void Admin_Configuration()
	{
		Admin_Configuration.click();
	}
	
	//click on EmailConfiguration	
	public void Admin_Configuration_EmailConfiguration()
	{
		
		Admin_Configuration_EmailConfiguration.click();
	}
	
	//click on EmailConfiguration Edit button
	public void Admin_Configuration_EmailConfiguration_Editbtn() 
	{
		
		Admin_Configuration_EmailConfiguration_Editbtn.click();
		
	}
	
	//Enter email-id into MailSentAs field
	public void Admin_Configuration_EmailConfiguration_MailSentAs(String MailSendAs)
	{
		Admin_Configuration_EmailConfiguration_MailSentAs.clear();
		Admin_Configuration_EmailConfiguration_MailSentAs.sendKeys(MailSendAs);
	}
	
	//Select e-mail sending method frmo drop down Sending method as Sendingmail
	public void Admin_Configuration_EmailConfiguration_SendingMethodDropDown()
	{
		selut.selectDropDownByIndex(Admin_Configuration_EmailConfiguration_SendingMethod, 0);
	}
	
	public void Admin_Configuration_EmailConfiguration_SendTestEmail()
	{
		
		selut.checkbox_Checking(Admin_Configuration_EmailConfiguration_SendTestEmail);
	}
	
	public void Admin_Configuration_EmailConfiguration_TestEmailAddrs(String TestMailAddrs)
	{
		Admin_Configuration_EmailConfiguration_TestEmailAddrs.clear();
		Admin_Configuration_EmailConfiguration_TestEmailAddrs.sendKeys(TestMailAddrs);
	}
	//Click on Save button
	public void Admin_Configuration_EmailConfiguration_Savebtn()
	{
		Admin_Configuration_EmailConfiguration_Savebtn.click();
	}
	
	
	
	//Click on reset button
	public void Admin_Configuration_EmailConfiguration_Resetbtn()
	{
		Admin_Configuration_EmailConfiguration_Resetbtn.click();
	}
}
