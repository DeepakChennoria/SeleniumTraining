package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class challengingDOM {

	WebDriver driver;
	element welement;
	
	
	
	public challengingDOM(WebDriver driver)
	{
		this.driver= driver;
		welement=new element(driver);
	}
	
	
	public void clickonfirstbutton()
	{
		welement.click(OR.firstbuttonChallengingDOM);
	}
	
	public void clickonsecondbutton()
	{
		welement.click(OR.secondbuttonchallengingDOM);
	}
	
	
	public void clickonthirdbutton()
	{
		welement.click(OR.thirdbuttonchallengingDOM);
	}
	
	public void clickondeletebuttonchallengingDOM(String username)
	{
		welement.waitForElement(By.xpath("//td[text()='"+username+"']//following::td//a[text()='delete']")).click();
	}
}
