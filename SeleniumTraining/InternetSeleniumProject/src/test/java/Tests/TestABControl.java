package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.ABpage;
import com.pages.HomePage;

import testbase.base;

public class TestABControl extends base {
    
	@Test
	public void testdata()
	{
		HomePage hp = new HomePage(driver);
		ABpage ap= new ABpage(driver);
		
		hp.clickonABtesting();
		Assert.assertEquals(ap.geturlofABpage(),"http://the-internet.herokuapp.com/abtest" );
		ap.clickonElementalSelenium();
		System.out.println("project starts with git");
		
		 
		
	}
	
	
	
}
