package com.qa.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pagesdemo.OrangeHRMPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeStepdefinition {
WebDriver driver;
OrangeHRMPage OR;
	
	@Given("^When I am in OrangeHRP Application$")
	public void when_I_am_in_OrangeHRP_Application()  {
	   System.setProperty("webdriver.chrome.driver", "C:\\\\soft\\\\SDET\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	   driver = new ChromeDriver();
	   OR=new OrangeHRMPage(driver);
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@Then("^Login to Application$")
	public void login_to_Application()  {
     OR.getUsername().sendKeys("Admin");
     OR.getEnterpassword().sendKeys("admin123");
     OR.getClickLogin().click();
	}

	@When("^Dashboard page is available$")
	public void dashboard_page_is_available()  {
    String content=OR.getDashboard().getText();
    Assert.assertEquals("Dashboard", content);
	}

	@When("^click on Admin menu$")
	public void click_on_Admin_menu()  {
   OR.getClickAdmin().click();
	}

	@Then("^Close the Browser$")
	public void close_the_Browser()  {
driver.close();
	}

}
