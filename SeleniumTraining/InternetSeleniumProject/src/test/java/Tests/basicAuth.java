package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.basicAuthpage;
import com.pages.HomePage;

import testbase.base;

public class basicAuth extends base
{

	
	
	@Test
	public void getbasicAuth()
	{
		HomePage hp = new HomePage(driver);
		basicAuthpage bp= new basicAuthpage(driver);
		hp.clickonBasicAuth()
		.hiturlforbasicauth("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Assert.assertEquals(bp.gettextBasicAuth(),"Basic Auth");
		
	}
}