Feature: Login function validation 
@sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page logout Title should be "Your store. Login" 
	And close browser 	
	
@newtest	
	Scenario: Successful Login with Valid username & password
	Given User Launch the Chrome browser 
	When User opens the URL "http://admin-demo.nopcommerce.com/login" 
	And User enters username as "admin@yourstore.com" and pwd as "admin" 
	And Click on the Login 
	Then Page Title should be on the page  "Dashboard / nopCommerce administration" 
	When User click on the Log out link 
	Then Page logout Title should be present "Your store. Login" 
	And close the browser 	
	
