package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pagesdemo.OrangeHRMPage;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class EmployeeTest extends TestBase {
	
	@Test
	public void EmployeeTestmatch() throws IOException, InterruptedException {
	OrangeHRMPage OR=new OrangeHRMPage(driver);
	OR.getUsername().sendKeys("Admin");
	OR.getEnterpassword().sendKeys("admin123");
	OR.getClickLogin().submit();
	OR.getClickPIM().click();

		//Thread.sleep(2000);
	//String text=OR.getEmployeeheader().getText();
	//System.out.println(text);
	if(OR.getEmployeeSearch().getText().contains("Name")){
		Reporter.log("Employee Information is Present",true);
		Thread.sleep(2000);
		OR.EnterEmployeeName().sendKeys("Linda Anderson");
		Reporter.log("Employee Information is Entered",true);
		String Screenshotname = "OrangeFullPagePassPIM";
        AShot SShot = new AShot(); 
        Screenshot takeScreenshot = SShot.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(driver);
        
        String Destination = System.getProperty("user.dir")+"/Screenshots/"+ Screenshotname+".jpg";     
        
         
        ImageIO.write(takeScreenshot.getImage(), "jpg" , new File(Destination));
	}
	else {
		Reporter.log("Employee Information is not Present",true);
		String Screenshotname = "OrangeFullPageFailPIM";
        AShot SShot = new AShot(); 
        Screenshot takeScreenshot = SShot.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(driver);
        
        String Destination = System.getProperty("user.dir")+"/Screenshots/"+ Screenshotname+".jpg";     
        
         
        ImageIO.write(takeScreenshot.getImage(), "jpg" , new File(Destination));
	}
	}
}
