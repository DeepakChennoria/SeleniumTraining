package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;


public class homePage  {

	
	 WebDriver driver;
	element welement;
	
	public homePage(WebDriver driver)
	{
	this.driver=driver;
	welement = new element(driver);
	}
	
	public boolean IshomePagetitledisplayed()
	{
		return welement.IsDisplayed(OR.homepageTitle);
	}
	
	public void clickonABtesting()
	{
		welement.click(OR.ABtestinglink);
	}
	
	public void clickonaddRemoveElements()
	{
		welement.click(OR.AddRemoveelements);
	}
	
	

	public void clickonDragandDrop()
	{
		welement.click(OR.DragandDrop);
	}
	
	public void Dropdownlist()
	{
	welement.click(OR.dropdownlist);	
	}
	
	public void dynamicControls()
	{
		welement.click(OR.DynamicContent);
	}
	
	
	
	public void verifyPageloaded() {
		// TODO Auto-generated method stub
		
	}

	
	
	/*public void clickonAddElement()
	{
		welement.click(OR.Addelementbutton);
	}
	
	public void clickonDeletebutton()
	{
		welement.click(OR.Deletebutton);
	}*/
	
	
	
	
	
}
