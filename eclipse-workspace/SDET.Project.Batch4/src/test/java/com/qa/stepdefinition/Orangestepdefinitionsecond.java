package com.qa.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qa.pagesdemo.OrangeHRMPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Orangestepdefinitionsecond {
	WebDriver driver;
	OrangeHRMPage OR;
	@Given("^the Browser is Invoked$")
	public void the_Browser_is_Invoked()  {
		System.setProperty("webdriver.chrome.driver", "C:\\\\soft\\\\SDET\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		   driver = new ChromeDriver();
		   OR=new OrangeHRMPage(driver);
		 
	   
	}

	@Then("^Orange should be loaded$")
	public void orange_should_be_loaded()  {
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^Enter the credentials$")
	public void enter_the_credentials()  {
		 OR.getUsername().sendKeys("Admin");
	     OR.getEnterpassword().sendKeys("admin123");
	     OR.getClickLogin().click();
	}

	@Then("^User should be successfully logged in$")
	public void user_should_be_successfully_logged_in()  {
		String content=OR.getDashboard().getText();
	    Assert.assertEquals("Dashboard", content);
	}

	@Given("^When I click on Admin Link$")
	public void when_I_click_on_Admin_Link()  {
	   OR.getClickAdmin().click();
	}

	@Then("^Click on Job$")
	public void click_on_Job()  {
	    OR.getValidateJob().click();
	    
	}

	@Then("^validate text Job Title$")
	public void validate_text_Job_Title()  {
		Actions s=new Actions(driver);
	    driver.manage().window().maximize();
		WebElement e=driver.findElement(By.linkText("Job"));
		s.moveToElement(e).build().perform();
		WebElement el=driver.findElement(By.linkText("Job Titles"));
		el.click();
		if(OR.getValidateJobTitle().getText().contains("Job Titles")){
			System.out.println("Job Titles is Present");
		}else {
			System.out.println("Job Titles is not Present");
		}
	}
	
	@Then("^Enter the UserName \"([^\"]*)\"$")
	public void enter_the_UserName(String user)  {
	   OR.getUserNameAdmin().sendKeys(user);
	}
	
	@Then("^Enter the UserName details \"([^\"]*)\"$")
	public void enter_the_UserName_details(String username)  {
	 OR.getUserNameAdmin().sendKeys(username);
	}
	
	@Then("^Enter the UserName in the textbox$")
	public void enter_the_UserName_in_the_textbox(DataTable userinfo)  {
	    List<String> user1=userinfo.asList(String.class);
	    for(String u:user1) {
	    	OR.getUserNameAdmin().sendKeys(u);
	    	OR.getUserNameAdmin().clear();
	    }
	
	}
	
	@Then("^Close Orange Browser$")
	public void close_Orange_Browser()  {
	driver.close();
	}

}
