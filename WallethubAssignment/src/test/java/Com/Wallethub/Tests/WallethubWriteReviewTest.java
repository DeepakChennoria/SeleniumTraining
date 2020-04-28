package Com.Wallethub.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.TestBase.Base;
import Com.Utils.JsonDataReader;
import Com.Wallethub.Pages.TestInsurancePage;

public class WallethubWriteReviewTest extends Base {
	
	 JsonDataReader jDR;
	 public WallethubWriteReviewTest() {
		 jDR = new JsonDataReader("wallethub"); 
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
	 * <h1>wallethubWriteReview_ID002</h1>
	 * <p>
	 * This test verifies wallethub write review feature
	 * </p>
	 *
	 * @author Deepak Kumar
	 * @version 1.0
	 * @since 2020-04-25
	 */
	@Test
	public void wallethubWriteReview_ID002() {
		TestInsurancePage testInsurancePage = new TestInsurancePage(driver);
		testInsurancePage.clickOnRatingIcon(4)
						.clickOnInsuranceTypeDropDown()
						.selectInsuranceTypeFromDropDown("Health Insurance")
						.enterReviewText("tddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddhdgdg");

	}

}

