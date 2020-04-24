package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class brokenPage {

	
WebDriver driver;
element welement;


public brokenPage(WebDriver driver)
{
	    this.driver=driver;
		welement = new element(driver);
}
public void clickonBrokenimage()
{
 welement.click(OR.BrokenImages);	
}



}
