package Com.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Com.Utils.TestListener;

public class Base {

	protected WebDriver driver = null;

	/**
	 * <h1>launchbrowser</h1>
	 * <p>
	 * This function is used as pre-requisite for test This function is used to
	 * initialize setup Like: 1. WeDriver instance
	 * </p>
	 *
	 * @author Deepak Kumar
	 * @version 1.0
	 * @since 2020-04-25
	 * @param NA
	 */
	@Parameters({ "browser" })
	@BeforeTest
	public void launchbrowser(@Optional("chrome") String browser) {
		switch (browser) {
		case "chrome": {
			String driverPath = System.getProperty("user.dir") + "\\Resources";
			System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			break;
		}

		case "firefox": {
			// TODO
			break;
		}

		case "ie": {
			// TODO
			break;
		}

		default:
			//TestListener.logger.info("Execution will not start. Please provide browser name in TestNG.xml");

		}

	}

	public void accessURL(String url) {
		driver.get(url);
	}

	/**
	 * <h1>teardown</h1>
	 * <p>
	 * This function is used as post-requisite for test This function can be used to
	 * dispose footprints of script Like: 1. Quite browser
	 * </p>
	 *
	 * @author Deepak Kumar
	 * @version 1.0
	 * @since 2020-04-25
	 * @param NA
	 */
	//@AfterTest
	public void teardown() {
		driver.quit();
	}

}
