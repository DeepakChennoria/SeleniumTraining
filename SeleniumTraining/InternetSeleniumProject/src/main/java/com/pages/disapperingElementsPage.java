package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class disapperingElementsPage {

	WebDriver driver;
	element welement;
	
	public disapperingElementsPage(WebDriver driver)
	{
		this.driver= driver;
		welement= new element(driver);
	}
	public String getText()// where to apply assert .assertequals
	{
		return welement.getText(OR.DisappearingElementsText);
	}
	
	public void mousehoverandclickonHomebutton()
	{
		welement.mousehoverandclick(OR.HomeDisapperingElements);
		
	}
	
	
	
}
