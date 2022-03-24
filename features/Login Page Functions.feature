Feature: Login Page Functions

Scenario Outline: Login Data driven with valid Credentials

Given  Admin/User is on LMS Log-In Screen
When  Admin/User enters Login Name as "<valid email>" and Password as "<valid password>"
When Admin/User click Submit button
Then  Admin/user navigates to LMS Home Page


Examples:

| email | password |
| admin@numpyninja.com | admin |
| staff@numpyninja.com  | staff |
| user@numpyninja.com  | user|


Scenario Outline: Login Data driven  with Invalid Credentials

Given Admin/User is on LMS Log-In Screen
When  Admin/User enters  Login Name as "<invalid email>"or  Password as "<invalid password>"
When Admin/User click Submit button
Then  Admin/user will not login successfully with invalid credentials error message


Examples:

|invaliduser@numpyninja.com  | invalidpassword |

Scenario Outline:  Reset password link Data Driven

Given Admin/User is on Answer Security Question page by by clicking on Forgot password link
When  Admin/User enters Email Address as "<reset email>"
When Admin/User enters the Answer for security Question
When Admin/User clicks on submit button
Then  Valid Message   will be displayed

Examples:

|validemail@numpyninja.com  | 
|invalidemail@numpyninja.com  | 








