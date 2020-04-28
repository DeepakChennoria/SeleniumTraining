package Tests;

import org.testng.annotations.Test;

import com.pages.contextclickpage;
import com.pages.homePage;

import testbase.base;

public class Testcontextclick extends base {
 
	@Test
	public void getTestconntextclickdata()
	{
		homePage hp = new homePage(driver);
	contextclickpage cp = new contextclickpage(driver);
	
	
	hp.contextclick();
	cp.contextMenuIsdisplayed();
	cp.RightclickonContextmenuBox();//doubt couldnot right click
	
	}

	
}
