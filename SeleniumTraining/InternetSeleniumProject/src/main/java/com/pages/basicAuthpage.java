package com.pages;

import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class basicAuthpage {
 WebDriver driver;
 element welement;
 
 public basicAuthpage(WebDriver driver)
 {
	 this.driver= driver;
	 welement =new element(driver);
 }
 
 public String gettextBasicAuth()
 {
	return welement.getText(OR.verifyBasicAuth);
	 
 }

	
}
