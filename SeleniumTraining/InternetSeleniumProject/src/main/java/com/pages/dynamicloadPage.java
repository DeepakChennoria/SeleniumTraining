package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class dynamicloadPage {

	
	WebDriver driver;
	element welement;
	
	public dynamicloadPage(WebDriver driver)
	{
		this.driver=driver;
		welement =new element(driver);
	}
	
	
	public void clickonExampple1Dynamicload()
	{
		welement.click(OR.clickonDynamicLoadExample1);
	
			}
	
	public void clickonstartbutton()
	{
		welement.click(OR.clickonstartbutton);
	}
	
	public String getTextDynamicload()
	{
		return welement.getText(OR.verifytextofDynamicload);
		
	}
}
