package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class contextclickpage {

	WebDriver driver;
	element welement;
	
	public contextclickpage(WebDriver driver)
	{
		    this.driver=driver;
			welement = new element(driver);
	}
	
	
	public boolean IsdisplayedcontextMenu()
	{
	return welement.IsDisplayed(OR.ContextMenu);
	 
	}
	
	public void RightclickonContextmenuBox ()
	{
	welement.contextclick1(OR.Rightclickoncontextmenubox);
	}
	
	public void handleAlertpopup()
	{
		welement.acceptAlert();
	}
	
}
