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
	
	public boolean Isdisplayedcheckbox()
	{
		return welement.IsDisplayed(OR.Checkboxes);
	}
	
	public void clickoncheckbox1()
	{
		welement.click(By.xpath("//div[@id='content']//input[1]"));
	}
	public void clickoncheckbox2()
	{
		welement.click(By.xpath("//div[@id='content']//input[2]"));
	}
	
	public void selectallcheckbox(By multiplecheckbox)
	{
		welement.click(OR.multiplecheckbox);
	}
	
	
}
