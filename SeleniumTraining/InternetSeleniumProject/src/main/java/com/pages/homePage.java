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
	
	public void clickonBrokenImageslink()
	{
		welement.click(OR.BrokenImages);
	}
	
	
	public void clickonCheckboxeslink()
	{
		welement.click(OR.Checkboxes);
	}
	public void contextclickbutton()
	{
		welement.click(OR.ContextMenu);
	}

	
	public void clickonDigestAuthentication()
	{
		welement.click(OR.DigestAuthentication);
		
			}
	
	public void hiturlforDigestAuthentication(String text)
	{
		welement.accessurl(text);
	}
	public void clickonDragandDrop()
	{
		welement.click(OR.DragandDrop);
	}
	
	public void Dropdownlistlink()
	{
	welement.click(OR.dropdownlist);	
	}
	
	
	public void clickonchallengingdom()
	{
		welement.click(OR.challengingDOM);
	}
	public void dynamicControls()
	{
		welement.click(OR.DynamicContent);
	}
	
	public void disappearingelement()
	{
		welement.click(OR.DisappearingElements);
	}
	
		public void dynamicloading()
	{
		welement.click(OR.clickonDynamicLoading);
	}
		
		
		public void entryadd()
		{
			welement.click(OR.entryAD);
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
