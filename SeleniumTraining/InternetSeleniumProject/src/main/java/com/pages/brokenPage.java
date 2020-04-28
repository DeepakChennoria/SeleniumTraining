package com.pages;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
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

public String gettextofBrokenImage()
{
	 return welement.getText(OR.verifybrokenImages);

}
public void clickonBrokenimage()
{
 welement.click(OR.BrokenImages);	
}

public String getsourceofImage()
{
	return welement.getattribute(OR.BrokenImage1,"src");
	}

public boolean IsImagedispalyed() throws ClientProtocolException, IOException
{
	return  welement.IsImageaccessible(OR.BrokenImage1);
	}


}
