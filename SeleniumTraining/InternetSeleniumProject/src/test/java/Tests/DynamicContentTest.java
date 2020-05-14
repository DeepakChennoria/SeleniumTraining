package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DynamicContentPage;
import com.pages.HomePage;

import testbase.base;


public class DynamicContentTest extends base
{

	
	
	@Test
	public void DynamicContetTest_001()
	{
		HomePage hp = new HomePage(driver);
		DynamicContentPage  dc = new DynamicContentPage(driver);
		hp.clickDynamicContentLink();
		
		//dc.
		
	}

}
