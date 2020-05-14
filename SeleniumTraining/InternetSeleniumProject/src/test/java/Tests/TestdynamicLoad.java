package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.dynamicloadPage;
import com.pages.HomePage;

import testbase.base;

public class TestdynamicLoad extends base{

	HomePage hp = new HomePage(driver);
	dynamicloadPage dlp = new dynamicloadPage(driver);
	
	
	@Test
	public void getdataofdynamicload()
	{
	hp.dynamicloading();
	dlp.clickonExampple1Dynamicload();
	dlp.clickonstartbutton();
	Assert.assertEquals(OR.verifytextofDynamicload,"Hello World!");
	}
}
