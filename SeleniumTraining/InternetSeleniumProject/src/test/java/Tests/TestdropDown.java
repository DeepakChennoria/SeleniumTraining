package Tests;

import org.testng.annotations.Test;

import com.pages.DraganddropPage;
import com.pages.dropdownlistPage;
import com.pages.HomePage;

import testbase.base;

public class TestdropDown extends base{

	
	@Test
	public void getdata()
	{
	HomePage hp = new HomePage(driver);
	DraganddropPage dp = new DraganddropPage(driver);
	
	//dp.DragAndDropExample();
	//dp.DragAndDropWithMouseActionsExample();
	//dp.DragAndDropWithMouseKeysExample();
	//dp.DragAndDropWithOffsetExample();
	
//	hp.Dropdownlistlink();
//	//dp.clickondropdownmenu();
//	dp.clickondropdownoption2();
//	//dp.clickondropdownselectedoption();
	}
}
