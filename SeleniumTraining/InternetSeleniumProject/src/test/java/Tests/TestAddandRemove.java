package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.AddandRemoveElementspage;
import com.pages.HomePage;

import testbase.base;

public class TestAddandRemove extends base{

	@Test
	public void testdata()
	{
	HomePage hp = new HomePage(driver);
	AddandRemoveElementspage arep=new AddandRemoveElementspage(driver);
	
	hp.clickonaddRemoveElements();
	Assert.assertEquals(arep.verifyTextAddandRemoveText(),"Add/Remove Elements");
	
	arep.clickonAddElement();
	Assert.assertTrue(arep.IsdisplayedDeletebutton());
	
	arep.clickOnDeletebutton();
	}
	
}
