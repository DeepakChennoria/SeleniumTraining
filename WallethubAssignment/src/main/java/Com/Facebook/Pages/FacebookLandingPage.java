package Com.Facebook.Pages;

import org.openqa.selenium.WebDriver;

import Com.CustomActions.Element;

import Com.ObjectRepository.FOR;

public class FacebookLandingPage {

	WebDriver driver;
	Element webElement;

	public FacebookLandingPage(WebDriver driver) {
		this.driver = driver;
		webElement = new Element(driver);
	}

	/**
	 * <p> Function to enter status message.</p>
	 * * @param StatusText
	 */
	public FacebookLandingPage enterStatusText(String statusText) {
		webElement.sendKeys(FOR.statusText, statusText);
		return this;
	}

	/**
	 * <p> Function to click Post button.</p>
	 */
	public FacebookLandingPage clickPostButton() {
		webElement.click(FOR.postButton);
		return this;
	}

}
