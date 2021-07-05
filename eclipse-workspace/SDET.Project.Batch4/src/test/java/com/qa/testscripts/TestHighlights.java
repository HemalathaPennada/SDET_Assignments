package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.pagesdemo.OrangeHRMPage;

public class TestHighlights extends TestBase {

	
	@Test
	public void initialTest() {
		
		OrangeHRMPage OR=new OrangeHRMPage(driver);
		OR.getUsername().sendKeys("Admin");
		OR.getEnterpassword().sendKeys("admin123");
		OR.getClickLogin().submit();
		
		OR.getMarketPlace().click();
		OR.getClickPIM().click();
		OR.getTime().click();
		OR.getMaintenance().click();
		driver.findElement(By.linkText("Admin")).click();
		if(OR.getWelcome().getText().contains("Welcome")){
			System.out.println("Welcome is found");
		}else {
			System.out.println("Welcome is not found");
		}
	}
}
