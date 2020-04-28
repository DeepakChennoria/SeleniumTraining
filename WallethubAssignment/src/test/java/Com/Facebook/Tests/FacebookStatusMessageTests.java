package Com.Facebook.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.Facebook.Pages.FacebookHomePage;
import Com.Facebook.Pages.FacebookLandingPage;
import Com.TestBase.Base;
import Com.Utils.JsonDataReader;

public class FacebookStatusMessageTests extends Base {
	
	JsonDataReader jDR;
	 public FacebookStatusMessageTests() {
		 jDR = new JsonDataReader("facebook"); 
	 }

	/**
	 * <h1>Before Test method for test setup</h1>
	 *
	 * @author Deepak Kumar
	 * @version 1.0
	 * @since 2020-04-25
	 * @param  url
	 */
	@Parameters({ "url" })
	@BeforeTest
	public void beforeTest(String url) {
		accessURL(url);
	}

	/**
	 * <h1>facebookStatusMessage_ID001</h1>
	 * <p>
	 * This test verifies facebook status message post
	 * </p>
	 *
	 * @author Deepak Kumar
	 * @version 1.0
	 * @since 2020-04-25
	 */
	@Test
	public void facebookStatusMessage_ID001() {
		FacebookHomePage facebookHomePage = new FacebookHomePage(driver);
		FacebookLandingPage facebookLandingPage = new FacebookLandingPage(driver);

		facebookHomePage.loginToFacebook(jDR.GetData("username")
										,jDR.GetData("password"));
		
		facebookLandingPage.enterStatusText(jDR.GetData("statusMessage"));
							//.clickPostButton();

		//TODO - Assertion is not added as it will post the status in my account. :)
	}

}
