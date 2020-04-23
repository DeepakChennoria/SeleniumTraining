package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class ABpage {

	WebDriver driver;
	element welement;
	
	public ABpage(WebDriver driver)
	{
		    this.driver=driver;
			welement = new element(driver);
		
	}
	
	public String getABtext()
	{
		return welement.getText(OR.ABTestControl);
	}
	
	
	public void clickonElementalSelenium()
	{
		welement.click(OR.ElementalSelenium);
	}
	
	
}
