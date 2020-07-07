Feature: Validate The OrangeHRM functionality Application 

Background: Validate login functionality of OragneHRM 


	Given Launch the browser and Navigate to urll 
	When To verify the page title 
	Then Enter uname and pwd 
	Then Click on Submit Button 
	
#Scenario Outline: Verfiy the Admin Email Configuration functionality 
#
#	When Application should be opened and navigate to Admin Link 
#	Then Click on Configuration tab 
#	Then Click on Email Configuration 
#	Then Click on Edit Button 
#	Then Enter the Email id 
#	Then Select <"Sending_Method">
#	Then Click on Send Text Email checkbox
#	Then Enter Test Email Adresss 
#	Then Click on Save Button 
#	And  Close the Email Configuration browser 
#	
#	Examples: 
#	
#		|Sending_Method|
#		|Sendingmail|

Scenario: Verfiy the Admin Email Subscription functionality 

    When Go to Admin Link 
	Then Click on Configuration  
	Then Click on Email Subscriptions
	Then Click on Edit Btn
	Then Click on Leave Assignment Check box 
	Then Click on Save Btn
	And  Close the browser 

