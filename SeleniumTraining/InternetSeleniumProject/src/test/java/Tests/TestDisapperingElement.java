package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.disapperingElementsPage;
import com.pages.homePage;

import testbase.base;

public class TestDisapperingElement extends base {

	@Test
	public void clickonTestDisappearingElement()
	{
		homePage hp = new homePage(driver);
		disapperingElementsPage dep = new disapperingElementsPage(driver);
		
		hp.disappearingelement();
		
Assert.assertEquals(OR.DisappearingElementsText,"Disappearing Elements");
		dep.mousehoverandclickonHomebutton();
		
	}
}
