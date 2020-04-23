package Tests;

import com.pages.contextclickpage;
import com.pages.homePage;

import testbase.base;

public class Testcontextclick extends base {
 
	
	public void getTestconntextclickdata()
	{
		homePage hp = new homePage(driver);
	contextclickpage cp = new contextclickpage(driver);
	
	cp.contextMenuIsdisplayed();
	cp.RightclickonContextmenuBox();
	
	}

	
}
