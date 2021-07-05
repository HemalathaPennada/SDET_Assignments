package com.qa.pagesdemo;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPage {

	WebDriver driver;
	
	
	@FindBy(id="txtUsername")
	WebElement Username;
	public WebElement getUsername() {
		return Username;
	}
	@FindBy(id="txtPassword")
	WebElement Password;
	public WebElement getEnterpassword() {
		return Password;
	}
	
	@FindBy(id="btnLogin")
	WebElement Login;
	
	public WebElement getClickLogin() {
		return Login;
	}
	
	@FindBy(linkText="Admin")
	WebElement Admin;
	
	public WebElement getClickAdmin() {
		return Admin;
	}
		
	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement Dashboard;
	 public WebElement getvalidateDashboard() {
		 return Dashboard;
	 }
	 
	 @FindBy(id="menu_admin_UserManagement")
	 WebElement UserManage;
	 public WebElement getUserManage() {
		 return UserManage;
	 }
	 
@FindBy(id="searchSystemUser_userName")
WebElement UserNametwo;
public WebElement getUserNameAdmin(){
	return UserNametwo;
}
	 
	 @FindBy(id="menu_admin_Job")
	 WebElement Job;
	 public WebElement getValidateJob() {
		 return Job;
	 }
	 @FindBy(xpath="//h1[contains(text(),'Job Titles')]")
	 WebElement JobTitle;
	 public WebElement getValidateJobTitle() {
		 return JobTitle;
	 }
	 
	 @FindBy(id="menu_admin_Organization")
	 WebElement Organization;
	 public WebElement getValidateOrganization() {
		 return Organization;
	 }
	 @FindBy(id="menu_admin_Qualifications")
		WebElement Qualifications;
	 public WebElement getvalidateQualification() {
		 return Qualifications;
	 }
	 @FindBy(id="menu_pim_viewPimModule")
	 WebElement PIM;
	 public WebElement getClickPIM() {
		 return PIM;
	 }
	 @FindBy(id ="menu_leave_viewLeaveModule")
	 WebElement Leave;
	 public WebElement getClickLeave() {
		 return Leave;
	 }
	 @FindBy(id ="menu_dashboard_index")
	 WebElement Dashboardlink;
	 public WebElement getDashboard() {
		 return Dashboardlink;
	 }
	 @FindBy(id="menu_directory_viewDirectory")
	 WebElement Directory;
	 
	 public WebElement getDirectory() {
		 return Directory;
	 }
	 @FindBy(id ="menu_maintenance_purgeEmployee")
	 WebElement Maintenance;
	 public WebElement getMaintenance() {
		 return Maintenance;
	 }
	 
	@FindAll(@FindBy(tagName="text"))
	List<WebElement> Textbox;
	public List<WebElement> getAllTextboxes(){
		return Textbox;
	}
	
	
	@FindBy(linkText="Forgot")
	WebElement Forgot;
	public WebElement getAlllinks() {
		return Forgot;
	}
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement Recruitment;
	public WebElement getVacancies() {
		return Recruitment;
	}
	@FindBy(id="menu_time_viewTimeModule")
	WebElement Time;
	public WebElement getTime() {
		return Time;
	}
	
		
	@FindBy(tagName="a")
	WebElement Employeeheader;
	
	public WebElement getEmployeeheader() {
		return Employeeheader;
	}
	
	@FindBy(xpath="//label[contains(text(),'Employee Name')]")
	WebElement Employee;
	
	public WebElement getEmployeeSearch() {
		return Employee;
	}
	
	@FindBy(id="empsearch_employee_name_empName")
	WebElement EmployeeNametext;
	
	public WebElement EnterEmployeeName() {
		return EmployeeNametext;
	}
	
	@FindBy(xpath="//input[@id='MP_link']")
	WebElement MarketPlace;

	public WebElement getMarketPlace() {
		return MarketPlace;
	}
	
	@FindBy(xpath="//a[@id='welcome']")
	WebElement Welcome;
	public WebElement getWelcome() {
		return Welcome;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/a[1]/img[1]")
	WebElement Leavemodule;
	public WebElement getLeave() {
		return Leavemodule;
	}
	
	@FindBy(xpath="//span[contains(text(),'Assign Leave')]")
	WebElement Assignleave;
	public WebElement getAssignLeave() {
		return Assignleave;
	}
	
	public OrangeHRMPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
