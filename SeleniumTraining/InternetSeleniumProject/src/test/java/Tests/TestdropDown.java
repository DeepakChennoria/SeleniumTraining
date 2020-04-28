package Tests;

import org.testng.annotations.Test;

import com.pages.dropdownlistPage;
import com.pages.homePage;

import testbase.base;

public class TestdropDown extends base{

	
	@Test
	public void getdata()
	{
	homePage hp = new homePage(driver);
	dropdownlistPage dp = new dropdownlistPage(driver);
	
	
	hp.Dropdownlistlink();
	//dp.clickondropdownmenu();
	dp.clickondropdownoption2();
	//dp.clickondropdownselectedoption();
	}
}
