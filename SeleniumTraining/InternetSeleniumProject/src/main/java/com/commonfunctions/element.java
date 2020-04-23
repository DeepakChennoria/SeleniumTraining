package com.commonfunctions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class element {
public WebDriver driver;
public WebElement element;




public element(WebDriver driver)
{
	this.driver=driver;
	}

public WebElement waitForElement(final By by) {
	
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(30))
			  .pollingEvery(Duration.ofSeconds(5))
			  .ignoring(NoSuchElementException.class);

			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			  public WebElement apply(WebDriver driver) {
			    return driver.findElement(by);
			  }
			});
			
			return element;
}
  
public void click(By by)
{
	waitForElement(by).click();
}


public void sendKeys(By by,String text)
{
	waitForElement(by).sendKeys(text);
}

public void selectbyvisibleText(By by, String text)
{
	
	
	Select s = new Select(waitForElement(by));
	s.selectByVisibleText(text);
	
}
public void selectbyvalue(By by, String value)
{
Select s1 = new Select(waitForElement(by));
s1.selectByValue(value);

}

public void selectbyIndex(By by,int Index)
{
	Select s2= new Select(waitForElement(by));
	s2.selectByIndex(Index);
	}


public void mousehoverelement(By by)
{
	
	Actions ac = new Actions(driver);
	ac.moveToElement(waitForElement(by)).build().perform();
	}

public void mousehovermoveandclick( By by, By byforclick)
{
	Actions ac = new Actions(driver);
	ac.moveToElement(waitForElement(by)).moveToElement(waitForElement(byforclick)).build().perform();
	}

public void contextclick(By by)
{
	Actions ac = new Actions(driver);
	ac.moveToElement(waitForElement(by)).contextClick().build().perform();
	}

public void doubleclick(By by)
{
Actions ac = new Actions(driver);
ac.moveToElement(waitForElement(by)).doubleClick().build().perform();

}
public void draganddrop(By by,By byfordrop)
{
Actions ac = new Actions(driver);
ac.dragAndDrop(waitForElement(by),waitForElement(byfordrop));
	
}

public boolean IsDisplayed(By by)
{
	return waitForElement(by).isDisplayed();
	}


public String getText(By by)
{
	return waitForElement(by).getText();
	}


public void dismissAlert(By by)
{
	waitForElement(by).click();
Alert alert = driver.switchTo().alert();
alert.getText();
alert.dismiss();

	}

public void mousehoverandclick(By by)
{                               
	
	Actions ac = new Actions(driver);
	ac.moveToElement(waitForElement(by)).click().build().perform();
	}

}
