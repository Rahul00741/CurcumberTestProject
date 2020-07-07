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

public class SeleniumUtility_prct_21June {
	WebDriver driver ;
	Library library;
	 
	public void rightClick(WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick().build().perform();
	}
	
	public void hovertoElement(WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element);
	}
	
	public void dobuleClickElement(WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick().build().perform();
	}
	
	public void dragAnddropElements(WebElement source, WebElement dest)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(source,dest);
	}
	
	public void snapshot(String filename) throws IOException
	{
		String path = "";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path+filename+". png");
		FileUtils.copyFile(source, dest);
	}
	
	public void selectbyValueDropdown(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void selectbyIndexDropdown(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void selectbyVisibleTextDropdown(WebElement element, String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
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
	
	public void move_Forward()
	{
		driver.navigate().forward();
	}
	
	public void move_back()
	{
		driver.navigate().back();
	}
	
	public void refreshPage()
	{
		driver.navigate().refresh();
	}
	
	public void gettitle()
	{
		driver.getTitle();
	}
	
	public void upKey(WebElement element)
	{
		element.sendKeys(Keys.UP);
	}
	
	public void downKey(WebElement element)
	{
		element.sendKeys(Keys.DOWN);
	}
	
	public void enterKey(WebElement element)
	{
		element.sendKeys(Keys.ENTER);
	}
	
	public void keyCombination(WebElement element)
	{
		element.sendKeys(Keys.chord(Keys.ALT, Keys.TAB));
	}
	
	public void keyboardEvents(WebElement element, String Key, String alphabet)
	{
		element.sendKeys(Keys.chord(Key, alphabet));
	}
	
	public boolean checkAlert_Accept()
	{
		try {
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			
			System.out.println(text);
			alt.accept();
			return true;
		} catch (Exception e) {
			System.out.println("No alert");
			return false;
		}
	}
	
	public boolean checkAlert_Dismiss()
	{
		try {
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			
			System.out.println(text);
			alt.dismiss();
			return true;
		} catch (Exception e) {
			System.out.println("No alert");
			return false;
		}
		
	}
	
	public void checking_CheckBox(WebElement element)
	{
		boolean checkstatus;
		checkstatus = element.isSelected();
		if(checkstatus==true)
		{
			System.out.println("checkbox box is already selected");
		}
		
		else
		{
			element.click();
			System.out.println("Checkbox is checked");
		}
		
	}
	
	public void checkRadio_NotSelected(WebElement element)
	{
		boolean radiocheck;
		radiocheck = element.isSelected();
		if(radiocheck==true)
		{
			element.click();
			System.out.println("radio button is unselected");
		}
		
		else
		{
			System.out.println("radio button already selected");
		}
	}
	
	public void checkUnchecking_Radio(WebElement element)
	{
		boolean radiocheck;
		radiocheck = element.isSelected();
		if(radiocheck==true)
		{
			element.click();
			System.out.println("unchecked radio");
		}
		
		else
		{
			System.out.println("radio button is aleady unchecked");
		}
	}
	
	public void checkUnchecking_Checkbox(WebElement element)
	{
		boolean radiocheck;
		radiocheck = element.isSelected();
		if(radiocheck==true)
		{
			element.click();
			System.out.println("unchecked checkbox");
		}
		
		else
		{
			System.out.println("checkbox is aleady unchecked");
		}
	}
	
	public String gettext(WebElement element)
	{
		WebElement webelement =this.waitforElementClickable(element);
		webelement = this.waitforElementClickable(element);
		return webelement.getText();
	}
	
	public String getValue(WebElement element)
	{
		WebElement webelement = this.waitforElementVisibility(element);
		webelement = this.waitforElementVisibility(element);
		return webelement.getAttribute("value");
		
	}
	
	public void sendMessage(WebElement element, String text)
	{
		WebElement webelement = this.waitforElementClickable(element);
		webelement.clear();
		webelement.sendKeys(text);
	}
	
	public void cleckonElement(WebElement element)
	{
		WebElement webelement = this.waitforElementClickable(element);
		webelement = this.waitforElementClickable(element);
		webelement.click();
	}
	
	public boolean isSlected(WebElement element)
	{
		boolean webelement;
		try {
			webelement = element.isSelected();
			System.out.println("selected");
			
		} catch (Exception e) {
			System.out.println("Not selected");
			webelement =  false;
		}
		return webelement;
	}
	
	public boolean isEnabled(WebElement element)
	{
		boolean webelement;
		
		try {
			webelement = element.isEnabled();
			System.out.println("element enabled");
		} catch (Exception e) {
			System.out.println("Not enabled");
			webelement = false;
		}
		return webelement;
	}
	
	public boolean isDisplayed(WebElement element)
	{
		boolean webelement;
		
		try {
			webelement = element.isDisplayed();
			System.out.println("element displayed");
		} catch (Exception e) {
			System.out.println("Not displayed");
			webelement = false;
		}
		return webelement;
	}
}
