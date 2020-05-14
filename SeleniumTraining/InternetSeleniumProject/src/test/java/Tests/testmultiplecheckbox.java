package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.checkBoxesPage;
import com.pages.HomePage;

import testbase.base;

public class testmultiplecheckbox extends base {
	@Test
	public void getcheckboxdata()
	{
		HomePage hp = new HomePage(driver);
		checkBoxesPage cp= new checkBoxesPage(driver);
		
   hp.clickonCheckboxeslink();
   cp.clickoncheckbox2();
   cp.clickoncheckbox1();
   cp.clickoncheckbox2();
  	//Assert.assertTrue(cp.Isdisplayedcheckbox());	
	cp.selectallcheckbox(OR.multiplecheckbox);//it is not accepting the multiple checkbox
	
	
	}

}


/*
 * public void dismissAlert()
 * {
 * 
 * driver.switchTo().Alert();
 * }
 * 
 * 
 * 
 * */
 