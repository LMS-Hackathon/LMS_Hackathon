package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.Add_EditBatches_adminPage;
import pageObjects.Add_EditClasses_AdminPage;
import pageObjects.Add_EditPrograms_adminPage;
import pageObjects.AnsSecurityQuestPage;
import pageObjects.LaunchApplicationPage;
import pageObjects.LoginPage;
import pageObjects.ManageAssignments_AddEditPage;
import pageObjects.ManageAssignments_AdminPage;
import pageObjects.ManageAssignments_UserViewPage;
import pageObjects.ManageAttendancePage;
import pageObjects.ManageBatchesPage;
import pageObjects.ManageClassesAdminView;
import pageObjects.ManageNotificationPage;
import pageObjects.ManageProgramsPage;
import pageObjects.ManageRecordingPage;
import pageObjects.ManageRegisteredUsersPage;
import pageObjects.ManageUnRegisteredUsersPage;
import pageObjects.ManageUser_Edit_Page;
import pageObjects.ManageUser_View_Page;
import pageObjects.ManageUsers_AdminPage;
import pageObjects.ManagesubmissionsPage;
import utilities.ReadConfig;

public class BaseClass {
	
	public WebDriver driver;
	public LaunchApplicationPage ap;
	public LoginPage lp;
	public AnsSecurityQuestPage sp;
	public String current_email;
	public pageObjects.ManageAssignments_AddEditPage map;
	public ManageAttendancePage mat;
	public ManageAssignments_AdminPage mp;
	public ManageAssignments_UserViewPage mvp;
	public String username="admin@numpyninja.com";
    public String password="password";
	public ManageClassesAdminView mav;
	public Add_EditClasses_AdminPage aep;
	public ManageBatchesPage mbp;
	public Add_EditBatches_adminPage aebp;
	public  ManageNotificationPage mnp;
	public Add_EditPrograms_adminPage aepa;
	public ManageProgramsPage mpp;
	public ManageRecordingPage mrp;
	public ManagesubmissionsPage msp;
	public ManageAssignments_AdminPage mnap;
	public ManageUsers_AdminPage mup;
	public  ManageUser_Edit_Page mep;
	public ManageUnRegisteredUsersPage mrup;
	
	public ReadConfig readconfig =new ReadConfig();
	
	
	
	


}
