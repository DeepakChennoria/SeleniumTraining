package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;

public class DynamicContentPage {
	
	WebDriver driver;
	element welement;


	public DynamicContentPage(WebDriver driver)
	{
	this.driver= driver;
	welement = new element(driver);
		
	}
	
	public boolean isPageTextDisplayed(String text) {
		
		return welement.IsDisplayed(By.xpath("//div[@class='example']//p[text()='"+text+"']"));
	}

}
