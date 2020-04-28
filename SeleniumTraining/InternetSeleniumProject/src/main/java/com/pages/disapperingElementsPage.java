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
	public String getTextDisappearingElements()
	{
		return welement.getText(OR.DisappearingElementsText);
	}
	
	public void mousehoverandclickonHomebutton()
	{
		welement.mousehoverAndClick(OR.HomeDisapperingElements);
		
	}
	
	
	public void navigatetoAboutpage()
	{
		welement.navigatebackpage();
	}
	
	public void clickbypressingtabkeyandenteronAbout()
	{
		welement.clickbypressingtabandeneterkey(OR.aboutDisappearingElements);
	}
	
}
