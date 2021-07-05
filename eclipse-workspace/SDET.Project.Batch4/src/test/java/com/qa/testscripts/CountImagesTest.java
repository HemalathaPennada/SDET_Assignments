package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CountImagesTest extends TestBase {
	
	@Test
	public void getAllTextbox() {
		List<WebElement> textbox= driver.findElements(By.className("form-hint"));
		System.out.println("Textbox Count"+textbox.size());
		for(WebElement text:textbox) {
			System.out.println("Text Box Values are"+text.getText());
		}
	}
	@Test
	public void getAllLinks() {
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links "+links.size());
		for(WebElement link:links) {
			System.out.println("Link Box Values are"+link.getAttribute("href"));
		}
	}
	
	@Test
	public void getAllImages() {
		List<WebElement> Images=driver.findElements(By.tagName("img"));
		System.out.println("Total Number of Images "+Images.size());
	}
	
}
