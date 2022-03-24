Feature: Assignment functions performed by Admin
 
 @sanity
  Scenario: Check whether Admin can add New assignments for particular Batch
  	Given Admin is on Add tab of manage Assignments page(admin view) by clicking on Add Assignment in Manage Assignments Page(admin)
  	When Admin clicks on submit button after selecting Batch and enters Assignment name, Assignment Description , Assignment Due, Upload assignments
  	Then Created assignments will be displayed in Manage Assignments Page(admin) and Manage Assignment page(User View)
  @regression
  Scenario: Check whether Admin can Edit existing assignments for particular Batch
  	Given Admin is on Edit tab of manage Assignments page(admin view) by clicking on Add Assignment in Manage Assignments Page(admin)
  	When Admin clicks on submit button after updating one or more assignment details
  	Then Updated assignment details will be displayed in Manage Assignments Page(admin) and Manage Assignment page(User View)
  	
  Scenario: Check whether Admin can Delete existing assignments for particular Batch
  	Given Admin is on Manage Assignments Page(admin)
  	When Admin clicks on Trash icon after selecting existing assignments
  	Then Deleted assignment will be removed from Admin View in Manage Assignments Page(admin) and Manage Assignment page(User View)
  	
  	 

































