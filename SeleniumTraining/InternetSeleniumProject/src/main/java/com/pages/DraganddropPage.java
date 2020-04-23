package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class DraganddropPage {

	
	WebDriver driver;
	element welement;
	
	
	
	public DraganddropPage(WebDriver driver)
	{
		this.driver=driver;
		welement = new element(driver);
		
	}
	
	public void draganddrop()
	{
		welement.draganddrop(OR.DragA,OR.DropB);
	}
}
