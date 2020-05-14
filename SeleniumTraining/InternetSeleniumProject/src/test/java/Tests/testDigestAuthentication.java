package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.HomePage;

import testbase.base;

public class testDigestAuthentication extends base {

	@Test
	public void getdigestAuthenticationdata()
	{
	HomePage hp = new HomePage(driver);
	testDigestAuthentication da= new testDigestAuthentication();
	hp.clickonDigestAuthentication();
	//hp.hiturlforbasicauth("http://admin:admin@https://the-internet.herokuapp.com/digest_auth");
	//this is the errorAssert.assertEquals(da.get,"This site can’t be reached");
	
	hp.hiturlforbasicauth("http://admin:admin@the-internet.herokuapp.com/digest_auth");
	
	//this is the errorAssert.assertEquals(da.get,"This site can’t be reached");
	//driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/digest_auth");
	}
	
	
}
