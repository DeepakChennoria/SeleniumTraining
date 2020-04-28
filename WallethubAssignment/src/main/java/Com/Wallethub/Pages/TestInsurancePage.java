/**
 * 
 */
/**
 * @author Deepak
 *
 */
package Com.Wallethub.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Com.CustomActions.Element;
import Com.ObjectRepository.WOR;

public class TestInsurancePage{
	
	WebDriver driver;
	Element webElement;

	public TestInsurancePage(WebDriver driver) {
		this.driver = driver;
		webElement = new Element(driver);
	}
	
	/**
	 * <p> Function to click rating icon.</p>
	 *   @param rating
	 */
	public TestInsurancePage clickOnRatingIcon(int rating) {
		rating = rating-1;
		webElement.waitForElement(WOR.ratingIcon);
		driver.findElements(WOR.ratingIcon).get(rating).click();
		
		return this;
	}
	
	/**
	 * <p> Function to click InsuranceTypeDropDown button.</p>
	 */
	public TestInsurancePage clickOnInsuranceTypeDropDown() {
		webElement.click(WOR.insuranceTypeDropDown);
		return this;
	}
	
	
	/**
	 * <p> Function to select Insurance type.</p>
	 *   @param InsuranceType
	 */
	public TestInsurancePage selectInsuranceTypeFromDropDown(String InsuranceType ) {
		webElement.click(By.xpath("//li[text()='"+InsuranceType+"']"));
		return this;
	}
	
	/**
	 * <p> Function to enter review text.</p>
	 *   @param InsuranceType
	 */
	public TestInsurancePage enterReviewText(String text ) {
		webElement.sendKeys(WOR.reviewTextarea,text);
		return this;
	}
	
}