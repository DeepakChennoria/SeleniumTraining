package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.DraganddropPage;
import com.pages.homePage;

import testbase.base;

public class testDragandDrop extends base{

	
	@Test
	public void getdraganddrop()
	{
		homePage hp = new homePage(driver);
		DraganddropPage dp = new DraganddropPage(driver);
		
		hp.clickonDragandDrop();
		Assert.assertEquals(OR.verifytextDraganddrop,"Drag and Drop");
		dp.draganddrop();
		
	}
}
