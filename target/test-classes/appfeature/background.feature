Feature: Multiple signin Options for facebook login

Background: 

Given with browser launching with url "https://www.facebook.com/"
When user login with the username "arun" and password "1234"
And click on the login button

Scenario: Checking Error message 

Then verify the failure message "The password that you've entered is incorrect. Forgotten password?"

Scenario: Using forgot password functionality

Then click on the forgot password options