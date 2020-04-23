package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class disapperingElementsPage {

	WebDriver driver;
	element welement;
	
	public void getText()// where to apply assert .assertequals
	{
		welement.getText(OR.DisappearingElementsText);
	}
	
	public void clickonHome()
	{
		welement.click(OR.HomeDisapperingElements);
	}
}
