Feature: Assignment functions performed by User

 Scenario: Check whether User can Edit existing assignments for particular Batch
  	Given Given User  is on  manage Assignments page(User view) by clicking on edit Assignment in Manage Assignments Page(admin)
  	When Admin clicks on download  button after updating one or more assignment details
  	Then  Message will be displayed like " Assignments are successfully downloaded"
  	