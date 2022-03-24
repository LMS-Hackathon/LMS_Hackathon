Feature: View new Unassigned Users(Admin)Page

#Background: Admin is logged in & Programs, Batches and Users(Registeed and Unregistered) were created already

Scenario: Check  whether Admin can be able  to view New Unassigned user 

Given  Admin is on LMS   Admin  User Page
When Admin clicks on New Unassigned User hyperlink
Then Admin will be navigated to  Manage user(admin) page, Unregistered User list will be displayed

Scenario: Check whether Admin can be able to edit Unregistered user

Given Admin is on  Manage user(admin) page, Unregistered User list
When Admin clicks on edit icon of particular unregistered user and admin will be navigated to manage users(admin) page
Then Admin will be able to edit User details like Time zone, User  role , Program and click on save

Scenario: Check whether Admin can be able to delete Unregistered user

Given Admin is on  Manage user(admin) page, Unregistered User list
When Admin clicks on trash icon of particular unregistered user
Then Deleted unregistered user will be removed from Unregistered users list

#Feature :Pagination
Scenario: Check functionality of Pagination at Manage user(Admin) page

Given Admin is on Manage users(admin) page of User list(Unregistered)
When  When result is containing many user records
Then Large number of user records will be divided into smaller discrete pages


