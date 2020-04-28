package Tests;

import org.testng.annotations.Test;

import com.pages.challengingDOM;
import com.pages.homePage;

import testbase.base;

public class TestChallengingDOM extends base {

	
	homePage hp;
	challengingDOM dom;
	
	public TestChallengingDOM()
	{
		hp = new homePage(driver);
		dom= new challengingDOM(driver);
	}
@Test	
public void gettestdataofChallengingDOM()
{
hp.clickonchallengingdom();
dom.clickonfirstbutton();
dom.clickonsecondbutton();
dom.clickonthirdbutton();
dom.clickondeletebuttonchallengingDOM("Iuvaret7");
}
	
@Test
public void gettestdataofChallengingDOM1()
{
hp.clickonchallengingdom();
dom.clickonfirstbutton();
dom.clickonsecondbutton();
dom.clickonthirdbutton();
dom.clickondeletebuttonchallengingDOM("Iuvaret8");
}
	

}
