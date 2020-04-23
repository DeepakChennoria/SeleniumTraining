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
	
	
	public void contextMenuIsdisplayed()
	{
	 welement.IsDisplayed(OR.ContextMenutext);
	 
	}
	
	public void RightclickonContextmenuBox ()
	{
		welement.contextclick(OR.Rightclickoncontextmenubox);
	}
	
	
	
}
