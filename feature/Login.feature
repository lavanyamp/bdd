Feature: Login Test

   Description Login to craftvilla
Background: 

Given Launch the browser
And Navigates to craftvilla

Scenario: Login with valid credentials
Given click on login to navigate to loginpage
When enter username
And click on continue
And enter password
And click on login
Then login should be successful

 
