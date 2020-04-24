package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	
	public homePage clickonBasicAuth()
	{
		welement.click(OR.BasicAuth);
		return this;
	}
	
	public void hiturlforbasicauth(String text)
	{
	welement.accessurl(text);
	}
	public void clickonCheckboxes()
	{
		welement.click(OR.Checkboxes);
	}
	public void contextclick()
	{
		welement.click(OR.ContextMenu);
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
	
	public void disappearingelement()
	{
		welement.click(OR.DisappearingElements);
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
