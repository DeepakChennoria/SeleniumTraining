package Tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.brokenPage;
import com.pages.homePage;

import testbase.base;

public class TestbrokenImage extends base {
@Test
	public void testdata() throws ClientProtocolException, IOException
	{
		homePage hp = new homePage(driver);
		brokenPage bp= new brokenPage(driver);
	    
   hp.clickonBrokenImageslink();
	Assert.assertEquals(bp.gettextofBrokenImage(),"Broken Images");
		
				
		bp.IsImagedispalyed();
		Assert.assertFalse(bp.IsImagedispalyed());
		
	}
	
}
