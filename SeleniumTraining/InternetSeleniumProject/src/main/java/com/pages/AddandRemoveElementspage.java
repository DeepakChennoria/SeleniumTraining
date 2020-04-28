package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class AddandRemoveElementspage {

	WebDriver driver;
	element welement; 
	
	
	public AddandRemoveElementspage(WebDriver driver)
	{
		this.driver=driver;
		welement = new element(driver);
	}
	public void clickonAddElement()
	{
		welement.click(OR.Addelementbutton);
	}
	
	public void clickOnDeletebutton()
	{
		welement.click(OR.Deletebutton);
	}
	
	public String verifyTextAddandRemoveText()
	{
		return welement.getText(OR.verifyAddandRemoveElementText);
		
	}
	
	public boolean IsdisplayedDeletebutton()
	{
		return welement.IsDisplayed(OR.Deletebutton);
		
	}
	
	
	
}
