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

public class SeleniumUtility_prct_20June {
	WebDriver driver ;
	Library library;
	 
	public void snapshot(String filename) throws IOException
	{
		String path = "";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path+filename+".png");
		FileUtils.copyFile(source, dest);
	}
	
	// move forward
	public void navigate_forward()
	{
		
		driver.navigate().forward();
	}
	
	//move backward
	public void navigate_back()
	{
		driver.navigate().back();
	}
	
	//refresh page
	
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
	
	public boolean isElementselected(WebElement element)
	{
		boolean webelement;
		try {
			webelement = element.isSelected();
			System.out.println(webelement);
			return true;
		} catch (Exception e) {
			System.out.println("element not selected");
			return false;
			
		}
	}
	
	public boolean isElementDisplayed(WebElement element)
	{
		boolean webelement;
		try {
			webelement = element.isDisplayed();
			System.out.println(webelement);
			
		} catch (Exception e) {
			System.out.println("element is not displayed");
			return false;
		}
		return webelement;
	}
	
	public boolean isElementenabled(WebElement element)
	{
		boolean webelement;
		try {
			webelement = element.isEnabled();
			
		} catch (Exception e) {
			System.out.println("element is not enabled");
			return false;
		}
		return webelement;
	}
	
	public void Check_checkbox(WebElement element)
	{
		boolean checkstatus;
		checkstatus = element.isSelected();
		if(checkstatus==true)
		{
			System.out.println("checkbox is Already checked");
		}
		else
		{
			element.click();
			System.out.println("checkbox is checked");
			
		}
		
	}
	
	public void uncheck_radioButton(WebElement element)
	{
		boolean radio;
		radio = element.isSelected();
		if(radio == true)
		{
			element.click();
			System.out.println("unchecked the radiobutton");
		}
		else
		{
			System.out.println("radio button is Already unchecked");
		}
	}
	
	public void check_checkboxUnChecking(WebElement element)
	{
		boolean checkstatus;
		checkstatus = element.isSelected();
		if(checkstatus == true)
		{
			element.click();
			System.out.println("chechbox is unchecked");
		}
		else
		{
			
			System.out.println("checkbox already unchecked");
		}
		
	}
	
	public void check_radioChecked(WebElement element)
	{
		boolean checkRadio;
		checkRadio = element.isSelected();
		if(checkRadio == true)
		{
			System.out.println("radio button is already on");
		}
		
		else
		{
			element.click();
			System.out.println("radio button is on");
		}
	}
	
	public WebElement waitforElementClickable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public WebElement waitforElementVisibility(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String gettext(WebElement element)
	{
		WebElement webelement = this.waitforElementClickable(element);
		webelement = this.waitforElementClickable(element);
		return webelement.getText();
	}
	
	public void sendtextMsg(WebElement element, String text)
	{
		WebElement webelement = this.waitforElementVisibility(element);
		webelement.clear();
		webelement.sendKeys(text);
	}
	
	public String getValue(WebElement element)
	{
		WebElement webelement = this.waitforElementClickable(element);
		webelement = this.waitforElementClickable(element);
		return webelement.getAttribute("value");
	}
	
	public void clickonElement(WebElement element)
	{
		WebElement webelement = this.waitforElementClickable(element);
		webelement = this.waitforElementClickable(element);
		webelement.click();
	}
	
	public boolean checkAlert_Accept()
	{
		try {
			
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			
			System.out.println("Alert accepted"+text);
			alt.accept();
			return true;
			
		} catch (Exception e) {
			System.out.println("No Alert");
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
			
		} catch (Exception e) {
			System.out.println("No alter dismiss");
			return false;
		}
		
	}
	
	public void selectByValueDropdown(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void selectByIndex(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void selectByVisibiletextDropdown(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	
	public void hoverToElement(WebElement element)
	{
		Actions act  = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public void dragAndDrop(WebElement src, WebElement dst)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst).build().perform();
	}
	
	public void doubleClick(WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick().build().perform();
	}
	
	public void rightclick(WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick().build().perform();
	}
	
	
}
