package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pagesdemo.OrangeHRMPage;
import com.qa.utility.Retry;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ShutterBagTest extends TestBase {

	@Test(retryAnalyzer = Retry.class)
	public void getDashboard() throws IOException {
		OrangeHRMPage OR=new OrangeHRMPage(driver);			
			//Reporter.log(driver.getTitle(),true); 
			
			OR.getUsername().sendKeys("Admin");
			OR.getEnterpassword().sendKeys("admin123");
			OR.getClickLogin().submit();
			String title=driver.getTitle();
			if(title=="OrangeHRM") {
				System.out.println("Logged in Successfully");
			}
			
			driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
			
			String S=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
			
			if(S.equalsIgnoreCase("Dashboard")) {
			

				Reporter.log("Dashboard is Present",true);
				 String Screenshotname = "OrangeFullPage";
			        
			        AShot SShot = new AShot(); 
			        Screenshot takeScreenshot = SShot.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(driver);
			        
			        String Destination = System.getProperty("user.dir")+"/Screenshots/"+ Screenshotname+".jpg";     
			        
			         
			        ImageIO.write(takeScreenshot.getImage(), "jpg" , new File(Destination));
			}
			else {
				Reporter.log("Dashboard is not Present",true);
				 String Screenshotname = "OrangeFailedPage";
			        
			        AShot SShot = new AShot(); 
			        Screenshot takeScreenshot = SShot.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(driver);
			        
			        String Destination = System.getProperty("user.dir")+"/Screenshots/"+ Screenshotname+".jpg";     
			        
			         
			        ImageIO.write(takeScreenshot.getImage(), "jpg" , new File(Destination));
			}
			
	}
	
	
	
}
