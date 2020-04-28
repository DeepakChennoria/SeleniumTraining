package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.dynamicloadPage;
import com.pages.homePage;

import testbase.base;

public class TestdynamicLoad extends base{

	homePage hp = new homePage(driver);
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
