Feature: Login1 Functionality
Background: User is on Flipkart main page and mouse over on Login button
Given user open "Chrome" browser with exe path as "E:\\abhi\\chromedriver.exe"
Given user enter "https://www.flipkart.com/" as url
Given user click on cancel button to close login
Given user move on Login button

@SmokeTest
Scenario: Login functionality with valid credentials
When user click on my profile
When user enter "abhi15891@gmail.com" as username
When user enter "@bhi12345" as password
When user click on Login button
Then Application shows profile to user
