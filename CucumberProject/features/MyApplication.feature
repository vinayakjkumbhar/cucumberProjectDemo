@tag
Feature: Login to LTM server 
  User want to login LTM server with valid and invalid login data 
  
  @tag1
  Scenario: User login with valid user name and password 
  Given Opne chrome browser and enter LTM server url
  When User enter valid UserName and Passowrd    
  Then User should be able to login successfully.
	
	