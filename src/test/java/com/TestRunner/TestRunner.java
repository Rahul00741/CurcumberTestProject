//package com.TestRunner;
//
//import org.testng.annotations.AfterClass;
//
//import com.cucumber.listener.Reporter;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;


package com.TestRunner;

//import org.junit.AfterClass;

//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions
(
	
features = "C:\\Eclipse\\Cucumber\\feature\\Admin.feature",
glue = {"com.StepDefinition"},	        
//plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report","json:src/test/resources/Reports/cucumber-html-report/jsonreport",
//},

    
		       
		     monochrome = true
		        
)
	


	public class TestRunner extends AbstractTestNGCucumberTests {
		
//		@AfterClass
//	    public static void extendReport()
//	  {
//	      Reporter.loadXMLConfig("\\src\\test\\resources\\extent-config.xml");
//	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
//	      Reporter.setSystemInfo("os", "Windows");
//	      Reporter.setTestRunnerOutput("Sample test runner output message");
//	  }

	}