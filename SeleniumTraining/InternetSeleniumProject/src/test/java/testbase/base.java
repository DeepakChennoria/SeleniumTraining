package testbase;
/*
 * prerequisite
 * browserlaunch
 * postrequisite
 * 
 *  * 
 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class base {

	public static WebDriver driver= null;
	
		
	@BeforeTest
public void launchbrowser()
{
		String driverPath=System.getProperty("user.dir")+"\\Resources";
		System.setProperty("webdriver.chrome.driver",driverPath+"\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
}
/*@AfterTest
	public void teardown()
	{
		driver.quit();
	}*/
	
}
