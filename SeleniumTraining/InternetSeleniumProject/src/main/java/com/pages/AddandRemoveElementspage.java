package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class AddandRemoveElementspage {

	WebDriver driver;
	element welement; 
	
	public void clickonAddElement()
	{
		welement.click(OR.Addelementbutton);
	}
	
	public void clickOnDeletebutton()
	{
		welement.click(OR.Deletebutton);
	}
}
