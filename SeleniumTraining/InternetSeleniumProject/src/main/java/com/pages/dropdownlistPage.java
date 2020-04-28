package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class dropdownlistPage {

WebDriver driver;
element welement;


public dropdownlistPage(WebDriver driver)
{
this.driver= driver;
welement = new element(driver);
	
}
/*public void clickondropdownmenu()
{
	welement.click(OR.clickondropdownoptions);}*/

public void clickondropdownoption2()
{
welement.dropdown(OR.selectoption1dropdown,"Option 1");
}



	
	

}