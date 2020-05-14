package Tests;

import org.testng.annotations.Test;

import com.pages.challengingDOM;
import com.pages.HomePage;

import testbase.base;

public class TestChallengingDOM extends base {

	
private	HomePage hp;
	private challengingDOM dom;
	
	private void init()
	{
		hp = new HomePage(driver);
		dom= new challengingDOM(driver);
	}
@Test	
public void gettestdataofChallengingDOM()
{
	init();
hp.clickonchallengingdom();
dom.clickonfirstbutton();
dom.clickonsecondbutton();
dom.clickonthirdbutton();
dom.clickondeletebuttonchallengingDOM("Iuvaret7");
}


@Test
public void gettestdataofChallengingDOM1()
{
	init();
hp.clickonchallengingdom();
dom.clickonfirstbutton();
dom.clickonsecondbutton();
dom.clickonthirdbutton();
dom.clickondeletebuttonchallengingDOM("Iuvaret8");
}

	

}
