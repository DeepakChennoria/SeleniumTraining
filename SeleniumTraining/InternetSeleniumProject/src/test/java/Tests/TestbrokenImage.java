package Tests;

import org.testng.annotations.Test;

import com.pages.brokenPage;
import com.pages.homePage;

import testbase.base;

public class TestbrokenImage extends base {
@Test
	public void testdata()
	{
		homePage hp = new homePage(driver);
		brokenPage bp= new brokenPage(driver);
		
		bp.clickonBrokenimage();
	}
	
}
