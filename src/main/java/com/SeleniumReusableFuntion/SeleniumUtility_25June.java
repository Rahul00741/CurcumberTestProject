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

public class SeleniumUtility_25June {
	WebDriver driver ;
	Library library;
	
	 public SeleniumUtility_25June(WebDriver driver)
	 {
		 this.driver =driver;
		 
	 }
	 
	 public boolean isSelectElement(WebElement element)
	 {
		 boolean webelement;
		 try {
			webelement = element.isSelected();
			if(webelement==true)
			{
				System.out.println("webelement is selected");
			}
		} catch (Exception e) {
			System.out.println("webelement is not selected");
			webelement = false;
		}return webelement;
	 }
	 
	 public boolean isDisplayedElement(WebElement element)
	 {
		 boolean webelement;
		 try {
			webelement = element.isDisplayed();
		} catch (Exception e) {
			System.out.println("webelement is not displayed");
			webelement = false;
		}return webelement;
	 }
	 
	 public boolean isEnabledElement(WebElement element)
	 {
		 boolean webelement;
		 try {
			webelement = element.isEnabled();
		} catch (Exception e) {
			System.out.println("webelement is not enabled");
			webelement = false;
		}return webelement;
		 
	 }
	 
	 public void sendText(WebElement element, String text)
	 
	 {
		
	 }
	
	  
}
