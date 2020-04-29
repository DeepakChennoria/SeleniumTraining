package com.commonfunctions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


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
/*public void draganddrop(By by,By byfordrop)
{
Actions ac = new Actions(driver);
ac.dragAndDrop(waitForElement(by),waitForElement(byfordrop));
	
}*/


public void draganddrop(By by,By byfordrop)
{
	try {
		
		WebElement drag = waitForElement(by);
		WebElement drop = waitForElement(byfordrop);
		
		Actions ac= new Actions(driver);
		
		ac.dragAndDrop(drag, drop).build().perform();
		System.out.println("drag and drop successful");
	} catch (Exception e) {
		System.out.println("drag and drop not successful");
		// TODO: handle exception
	}
}

public boolean IsDisplayed(By by)
{
	return waitForElement(by).isDisplayed();
	}


public String getText(By by)
{
	return waitForElement(by).getText();
	}


public void dismissAlert()
{
driver.switchTo().alert().dismiss();
}

public void acceptAlert()
{
driver.switchTo().alert().accept();
}



/*public void mousehoverandclick(By by)
{                               
	
	Actions ac = new Actions(driver);
	ac.moveToElement(waitForElement(by)).click().build().perform();
	}*/

public void mousehoverAndClick(By by)
{
	
		Actions actions = new Actions(driver);
		WebElement mouseHover = waitForElement(by);
		actions.moveToElement(mouseHover).click(mouseHover).build().perform();
		System.out.println("mouse hovered");
	
	System.out.println("mouse not hovered");
	
	
}



//multiple(checkbox,radiobutton,buttons,links)
public void selectmultiplecheckbox(By by)
{
try {
 List<WebElement> li = waitForElement(by);
	for(int i=0; i<li.size();i++ )
	{
		
		boolean flag=li.get(i).isSelected();
		if(flag)
		{
			System.out.println("already clicked checkbox");
			
		}
		else {
	 li.get(i).click();
	System.out.println("successfully checked on multiple checkbox");
	 
		}
	}
} catch (Exception e) {
	System.out.println("couldnot click on checkbox");
	// TODO: handle exception
}	
}


public void dropdown(By by,String data)
{
	try {
		WebElement wb = waitForElement(by);
		Select s = new Select(wb);
		s.selectByValue(data);
		System.out.println("Dropdown Value Selected "+data);
	} catch (Exception e) {
		
		System.out.println("Dropdown Value is not Selected "+data+""+e.getMessage());
		e.printStackTrace();
	}
}


public String geturl()
{
	return driver.getCurrentUrl();
	}

public void accessurl(String text)
{
	driver.get(text);
	}



public String getattribute(By by, String name)
{
	return waitForElement(by).getAttribute(name);
	}


/*public void multiplecheckbox(By by)
{
List<WebElement> list= waitForElement(by);
list.size();


}*/

	public void handleAlert()
	{
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());

	alert.accept();
	System.out.println("Alert is displayed");

	}

	

public void contextclick1(By by)
{
WebElement ele=	waitForElement(by);
Actions ac = new Actions(driver);
ac.moveToElement(ele).contextClick().build().perform();
	
	}



public void clickbypressingtabkey(By by,String data)
{
	try {
		WebElement ele= waitForElement(by);
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).sendKeys(Keys.TAB).click().build().perform();
	} catch (Exception e) {
		// TODO: handle exception
	}
}


public void clickbypressingtabandeneterkey(By by)
{
	
		WebElement ele= waitForElement(by);
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	
	}
public void navigatebackpage()
{
	
		driver.navigate().back();
	System.out.println("successfully moved backward");
	
		
	
}



public void navigateforwardpage()
{
	
		driver.navigate().forward();
		System.out.println("successfully moved forward");
		
	
}


public boolean IsImageaccessible(By by) throws ClientProtocolException, IOException
{
	boolean display= false;
	HttpClient client = HttpClientBuilder.create().build();
	HttpGet request = new HttpGet(waitForElement(by).getAttribute("src"));
	HttpResponse response = client.execute(request);
	// verifying response code he HttpStatus should be 200 if not,
	// increment as invalid images count
	if (response.getStatusLine().getStatusCode() == 200)
		display=true;
	return display;
} 

	
	
	
}
