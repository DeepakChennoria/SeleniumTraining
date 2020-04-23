package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class checkBoxesPage {

	WebDriver driver;
	element welement;
	
	

	public checkBoxesPage(WebDriver driver)
	{
		    this.driver=driver;
			welement = new element(driver);
	}
	
	public void checkboxIsdisplayed()
	{
		welement.IsDisplayed(OR.Checkboxes);
	}
	
	/*public void clickoncheckbox()
	{
		welement.click(OR.clickoncheckbox2);
	}*/
	
	public void selectallcheckbox(By multiplecheckbox)
	{
		welement.click(OR.multiplecheckbox);
	}
	
	
}
