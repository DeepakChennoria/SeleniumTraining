package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class dynamicControlPage {

WebDriver driver;
element welement;

public dynamicControlPage(WebDriver driver)
{
	this.driver= driver;
	welement = new element(driver);
	
	}

public void verifydynamictext()
{
welement.getText(OR.verifydynamicConroltext);


}
public void clickoncheckboxdynamic()
{
	welement.click(OR.checkboxdynamic);
	
}

public void clickonremovebutton()
{
	
welement.click(OR.Removebuttondynamic);
}

public void verifymessagedynamic()
{
	welement.getText(OR.verifymessagedynamic);
}

public void clickonenablebutton()
{
	welement.click(OR.clickonenablebutton);
}


public void clickondisablebutton()
{
welement.click(OR.clickondisbalebutton);	
}

}