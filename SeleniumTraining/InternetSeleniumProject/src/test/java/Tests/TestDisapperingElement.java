package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.OR;
import com.pages.disapperingElementsPage;
import com.pages.HomePage;

import testbase.base;

public class TestDisapperingElement extends base {

	@Test
	public void clickonTestDisappearingElement()
	{
		HomePage hp = new HomePage(driver);
		disapperingElementsPage dep = new disapperingElementsPage(driver);
		
		hp.disappearingelement();
		
Assert.assertEquals(dep.getTextDisappearingElements(),"Disappearing Elements");
		dep.mousehoverandclickonHomebutton();
		dep.navigatetoAboutpage();
		dep.clickbypressingtabkeyandenteronAbout();
		
	}
}
