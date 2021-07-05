package com.qa.testscripts;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pagesdemo.OrangeHRMPage;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestNGClass extends TestBase {
	
	@Test(priority=4)
	public void testMinimize() throws IOException {
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		System.out.println("Minimization happens");
		String Screenshotname = "OrangeMinimize";
        AShot SShot = new AShot(); 
        Screenshot takeScreenshot = SShot.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(driver);
        
        String Destination = System.getProperty("user.dir")+"/Screenshots/"+ Screenshotname+".jpg";     
        
         ImageIO.write(takeScreenshot.getImage(), "jpg" , new File(Destination));
	}
@Test(priority=1)
public void initialsetup() throws IOException {
	OrangeHRMPage OR=new OrangeHRMPage(driver);
	FileInputStream Fp=new FileInputStream("C:\\Users\\PennadaH\\eclipse-workspace\\SDET.Project.Batch4\\src\\test\\java\\com\\qa\\testdata\\Testdata.properties");
	Properties Pro=new Properties();
	Pro.load(Fp);
	
	Reporter.log(driver.getTitle(),true); 
	OR.getUsername().sendKeys(Pro.getProperty("UserName"));
	OR.getEnterpassword().sendKeys(Pro.getProperty("Password"));
	OR.getClickLogin().submit();
	
	driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
	
	String S=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	
	if(S.equalsIgnoreCase("Dashboard")) {
	

		Reporter.log("Dashboard is Present",true);
	}
	else {
		Reporter.log("Dashboard is not Present",true);
	}
	
	OR.getClickAdmin().click();
	if(OR.getUserManage().getText().contains("User Management")) {
		Reporter.log("UserManagement is Present",true);
	}
	else {
		Reporter.log("UserManagement is not Present",true);
	}
	
	if(OR.getValidateJob().getText().contains("Job")) {
		Reporter.log("Job is Present",true);
	}else {
		Reporter.log("Job is not Present",true);
	}
	
	if(OR.getValidateOrganization().getText().contains("Organization")) {
		Reporter.log("Organization is Present",true);
	}else {
		Reporter.log("Organization is not Present",true);
	}
	
	if(OR.getvalidateQualification().getText().equalsIgnoreCase("Qualifications")) {
		Reporter.log("Qualifications is Present",true);
	}else {
		Reporter.log("Qualifications is not Present",true);
	}
	
	}
@Test(priority=2)
public void ValidatePageTitles() {
	OrangeHRMPage OR=new OrangeHRMPage(driver);	
	OR.getClickAdmin().click();
	Reporter.log(driver.getTitle(),true);
	OR.getClickPIM().click();;
	Reporter.log(driver.getTitle(),true);
	OR.getClickLeave().click();;
	Reporter.log(driver.getTitle(),true);
	OR.getDashboard().click();;
	Reporter.log(driver.getTitle(),true);
	OR.getDirectory().click();;
	Reporter.log(driver.getTitle(),true);
	OR.getMaintenance().click();;
	Reporter.log(driver.getTitle(),true);
}

@Test(priority='3', dependsOnMethods="initialsetup")
public void getVacancy() throws InterruptedException {
	//Hovering the Cursor
	
	
	Actions s=new Actions(driver);
	driver.manage().window().maximize();
	WebElement e=driver.findElement(By.linkText("Recruitment"));
	s.moveToElement(e).build().perform();
	WebElement el=driver.findElement(By.linkText("Vacancies"));
	el.click();
	if(driver.getCurrentUrl().contains("Vacancy")) {
		System.out.println("Vacancy is found");
		}else {
			System.out.println("Vacancy is NOT found");
		}
JavascriptExecutor JS=(JavascriptExecutor)driver;
	
	for(int i=0;i<=2;i++) {
			JS.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			System.out.println("Scrolling is done");
	}
	}
	
}

