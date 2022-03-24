Feature: Check whether Admin can create notification

Scenario: Check whether Admin can create notification

Given  Admin is on  Notification page 
When Admin clicks on submit button after selectingProgram Name from dropdown and enter details  Hackathon Name,hackathon description,Hackathon date and Hackathon comments
Then  Notifications will be submitted successfully
