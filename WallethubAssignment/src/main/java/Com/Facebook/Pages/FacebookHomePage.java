package Com.Facebook.Pages;

import org.openqa.selenium.WebDriver;

import Com.CustomActions.Element;
import Com.ObjectRepository.FOR;

public class FacebookHomePage {

	WebDriver driver;
	Element webElement;

	public FacebookHomePage(WebDriver driver) {
		this.driver = driver;
		webElement = new Element(driver);
	}

	/**
	 * <p> Function to click ExistingAccount button.</p>
	 */
	public FacebookHomePage clickOnExistingAccountButto() {
		webElement.click(FOR.loginToExistingAccountButton);
		return this;
	}

	/**
	 * <p> Function to enter User name.</p>
	 *   @param username
	 */
	public FacebookHomePage enterUserName(String username) {
		webElement.sendKeys(FOR.usernameInput, username);
		return this;
	}

	/**
	 * <p> Function to enter password.</p>
	 *   @param password
	 */
	public FacebookHomePage enterPassword(String password) {
		webElement.sendKeys(FOR.passwordInput, password);
		return this;
	}

	/**
	 * <p> Function to click Login button.</p>
	 */
	public FacebookHomePage clickLoginButton() {
		webElement.click(FOR.loginButton);
		return this;
	}

	/**
	 * <p> Function to provide login functionality.</p>
	 *   @param username
	 *   @param password
	 */
	public FacebookHomePage loginToFacebook(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLoginButton();
		return this;
	}

}
