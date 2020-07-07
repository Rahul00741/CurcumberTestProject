package com.SeleniumReusableFuntion;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Library;

public class SeleniumUtility_02_Jully {
	WebDriver driver ;
	Library library;
	
	 public SeleniumUtility_02_Jully(WebDriver driver)
	 {
		 this.driver =driver;
		 
	 }
	 
	public void snapshot(String filename) throws IOException
	{
		String path = "";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path+filename+".png");
		FileUtils.copyFile(source, dest);
	}
	
	public boolean isEnabled(WebElement element)
	{
		boolean webelement;
		try {
			webelement = element.isEnabled();
			
			
		} catch (Exception e) {
			System.out.println("element is not enabled");
			webelement = false;
		}
		return webelement;
	}
	
	public boolean isSelected(WebElement element)
	{
		boolean webelement;
		try {
			webelement = element.isSelected();
			
		}catch(Exception e)
		{
			System.out.println("webelement is not selected");
			webelement = false;
		}
		return webelement;
	}
	  
	public boolean isDisplayed(WebElement element)
	{
		boolean webelement;
		try {
			webelement = element.isDisplayed();
		}
		catch(Exception e)
		{
			System.out.println("element is not displayed");
			webelement = false;
		}
		return webelement;
	}
	
	
	
	
	
	public boolean checkAlert_Accept()
	{
		try {
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		
		System.out.println(text);
		alt.accept();
		return true;}
		catch(Exception e) {
			System.out.println("no alert");
		return false;
		}
		
	}
	
	public boolean checkAlert_dismiss()
	{
		try {
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			
			System.out.println(text);
			alt.dismiss();
			return true;
		}catch(Exception e) {
			System.out.println("no alert");
			return false;
		}
	}
	
	public void checking_checkbox(WebElement element)
	{
		boolean checkstatus;
		checkstatus = element.isSelected();
		if(checkstatus ==true)
		{
			System.out.println("checkbox already selected");
		}
		else
		{
			element.click();
		}
	}
	
	public void checking_radioButton(WebElement element)
	{
		boolean checkstatus;
		checkstatus = element.isSelected();
		if(checkstatus ==true)
		{
			System.out.println("radiobutton already selected");
		}
		else
		{
			element.click();
		}
	}
	
	public void unchecking_radioButton(WebElement element)
	{
		boolean checkstatus;
		checkstatus = element.isSelected();
		if(checkstatus ==true)
		{
			element.click();
			
		}
		else
		{
			System.out.println("radiobutton already selected");
		}
	}
	
	public void unchecking_checkBox(WebElement element)
	{
		boolean checkstatus;
		checkstatus = element.isSelected();
		if(checkstatus ==true)
		{
			element.click();
			
		}
		else
		{
			System.out.println("checkBox already selected");
		}
	}
	
	
	
	
	
	
 
}
