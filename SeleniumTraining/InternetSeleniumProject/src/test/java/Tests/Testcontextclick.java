package Tests;

import org.testng.annotations.Test;

import com.pages.contextclickpage;
import com.pages.HomePage;

import testbase.base;

public class Testcontextclick extends base {
 
	@Test
	public void getTestconntextclickdata()
	{
		HomePage hp = new HomePage(driver);
	contextclickpage cp = new contextclickpage(driver);
	
	
	hp.contextclickbutton();
	cp.RightclickonContextmenuBox();
	cp.IsdisplayedcontextMenu();
	cp.RightclickonContextmenuBox();//doubt couldnot right click
	cp.handleAlertpopup();
	}

	
}
