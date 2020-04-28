package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class digestAuthenticationlink {
	
	WebDriver driver;
	element welement;
	
	
	public digestAuthenticationlink(WebDriver driver)
	{
		this.driver= driver;
		welement = new element(driver);
		
	}

	
	public void geturl()
	{
		welement.geturl();
	}
	
public void clickonDigestAuthenticationlink()
{
	welement.click(OR.DigestAuthentication);
}

public void getTextDigestAuthenetication()
{
welement.getText(OR.DigestAuthentication);	
}

}
