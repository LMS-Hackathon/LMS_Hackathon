Feature:  Manage Assignment Submission by Admin

Scenario: Check whether Admin can manage students submission by selecting Make Grade Visible

Given Admin is on Manage Submissions(Admin) page by clicking on Manage button in Manage assignments page(admin)
When Admin clicks on submit button after selecting all th details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,Make Garde Visible and add comments 
Then Grade Details will be visible to both Admin and User View

Scenario: Check whether Admin can manage students submission by unselecting Make Grade Viisble
Given Admin is on Manage Submissions(Admin) page by clicking on Manage button in Manage assignments page(admin)
When Admin clicks on Submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,add comments 
Then Grade Details will be visible only to Admin 
