package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.dynamicControlPage;
import com.pages.HomePage;

import testbase.base;

public class TestDynamicControl extends base
{
	@Test
public void getDynamicControl()
{
HomePage hp = new HomePage(driver);
dynamicControlPage dcp=new dynamicControlPage(driver);

 hp.dynamicControls();
Assert.assertEquals(OR.verifydynamicConroltext,"\r\n" + 
		"This example demonstrates when elements (e.g., checkbox, input field, etc.) are changed asynchronously.");
 dcp.clickoncheckboxdynamic();
 dcp.clickonremovebutton();
 dcp.clickonenablebutton();
 dcp.clickondisablebutton();


}
	
}
