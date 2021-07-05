package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeSuite;



public class TestBase {
	WebDriver driver;
	@BeforeTest
	public void beforeannotate() {
String Browser ="edge";
		
		if(Browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\soft\\SDET\\Drivers\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
						}else if(Browser.equalsIgnoreCase("IE")) {
				
			System.setProperty("webdriver.ie.driver","C:\\soft\\SDET\\Drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");		
			 driver=new InternetExplorerDriver();
			
			}else if(Browser.equalsIgnoreCase("firefox")) {
					
			System.setProperty("webdriver.gecko.driver","C:\\soft\\SDET\\Drivers\\geckodriver-v0.29.1-win64 (1)\\geckodriver.exe");
					 driver=new FirefoxDriver();
			}else if(Browser.equalsIgnoreCase("edge")) {
					
			System.setProperty("webdriver.edge.driver","C:\\soft\\SDET\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			 driver=new EdgeDriver();
			}
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
}
