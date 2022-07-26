Feature: Facebook

@smoke
Scenario: To Login with existing Account

Given with browser launching with url "https://www.facebook.com/"
When user login with the username "arun" and password "1234"
And click on the login button
Then Account should be opened with response code "The password that you've entered is incorrect. Forgotten password?"

@regression
Scenario: To Login with existing Account

Given with browser launching with url "https://www.facebook.com/"
When user login with the username "arun" and password "1234"
And click on the login button
Then Account should be opened with response code "The password that you've entered is incorrect. Forgotten password?"

@regression @smoke
Scenario: To Login with existing Account

Given with browser launching with url "https://www.facebook.com/"
When user login with the username "arun" and password "1234"
And click on the login button
Then Account should be opened with response code "The password that you've entered is incorrect. Forgotten password?"