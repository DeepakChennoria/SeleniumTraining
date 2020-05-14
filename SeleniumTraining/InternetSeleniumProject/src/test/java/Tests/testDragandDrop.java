package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.DraganddropPage;
import com.pages.HomePage;

import testbase.base;

public class testDragandDrop extends base{

	
	@Test
	public void getdraganddrop()
	{
		HomePage hp = new HomePage(driver);
		DraganddropPage dp = new DraganddropPage(driver);
		
		hp.clickonDragandDrop();
		Assert.assertEquals(dp.getTextDragandDrop(),"Drag and Drop");
		dp.draganddrop();
		
	}
}
