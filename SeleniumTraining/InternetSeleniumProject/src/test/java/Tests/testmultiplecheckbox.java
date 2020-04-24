package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.checkBoxesPage;
import com.pages.homePage;

import testbase.base;

public class testmultiplecheckbox extends base {
	@Test
	public void getcheckboxdata()
	{
		homePage hp = new homePage(driver);
		checkBoxesPage cp= new checkBoxesPage(driver);
		
   hp.clickonCheckboxes();
  	Assert.assertTrue(cp.Isdisplayedcheckbox());	
	cp.selectallcheckbox(OR.multiplecheckbox);
	
	
	}

}
