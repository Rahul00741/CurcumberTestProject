package com.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static void launchApp() throws IOException 
	{
		
			FileInputStream file = new FileInputStream("C:\\Eclipse\\CucumberProject1\\config properties\\config.properties");
			prop = new Properties();
			prop.load(file);
		
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chropath"));
			driver = new ChromeDriver();
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", prop.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}
		
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
	
				
	}
	
	public void tearDown()
	{
		driver.close();
	}
	
}
