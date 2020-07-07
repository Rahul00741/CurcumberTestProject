Feature: Validate The OrangeHRM functionality Application 

Background: Validate login functionality of OragneHRM 


	Given Launch the browser and Navigate to url 
	When To Validate the title of Loginpage 
	Then Enter username and password 
	Then Click on login Button 
	
	
Scenario Outline: Verfiy the Assign Leave tab of Leave Page 

	When User should be on Home page and navigate to Assign Leave Tab
	Then Enter "<employee name>" 
	Then Select "<leave type>" and Leave Duration 
	Then Click Assign Button 
	And Close the Browser 
	
	Examples: 
		|employee name|leave type|
		|Hannah Flores|FMLA US|
		
		
