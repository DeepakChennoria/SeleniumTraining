package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.ABpage;
import com.pages.homePage;

import testbase.base;

public class TestABControl extends base {
    
	@Test
	public void testdata()
	{
		homePage hp = new homePage(driver);
		ABpage ap= new ABpage(driver);
		
		hp.clickonABtesting();
		Assert.assertEquals(ap.geturlofABpage(),"http://the-internet.herokuapp.com/abtest" );
		ap.clickonElementalSelenium();
		System.out.println("project starts with git");
		
		 
		
	}
	
	
	
}
