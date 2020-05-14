package Com.CustomActions;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Element {
	public WebDriver driver;

	public Element(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * <p> Function perform wait for element.</p>
	 *   @param by
	 *   @return webelement
	 */
	public WebElement waitForElement(final By by) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(by);
			}
		});
		return element;
	}
	

	/**
	 * <p> Function perform wait for page load.</p>
	 */
	public void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			//Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}
	

	/**
	 * <p> Function simulate click action.</p>
	 *   @param by
	 */
	public void click(By by) {
		waitForElement(by).click();
		System.out.println(by.toString());
	}
	
	/**
	 * <p> Function to simulate sendkeys action.</p>
	 *   @param by
	 *   @param text
	 */
	public void sendKeys(By by, String text) {
		waitForElement(by).sendKeys(text);
	}

	/**
	 * <p> Function simulate isDisplayed action.</p>
	 *   @param by
	 *   @return boolean
	 */
	public boolean IsDisplayed(By by) {
		return waitForElement(by).isDisplayed();
	}

	/**
	 * <p> Function simulate isDisplayed action.</p>
	 *   @param by
	 *   @return text
	 */
	public String getText(By by) {
		return waitForElement(by).getText();
	}

}
