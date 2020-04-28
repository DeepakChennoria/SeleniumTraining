package Com.ObjectRepository;

import org.openqa.selenium.By;

public class FOR {
	
	public static final By loginToExistingAccountButton = By.cssSelector("input[value='Log In to Existing Account']");
    public static final By usernameInput = By.id("email");
    public static final By passwordInput = By.id("pass");
    public static final By loginButton = By.cssSelector("input[aria-label='Log In']");

    
    public static final By statusText = By.xpath("//textarea[contains(@title,'Write something here')]");
    public static final By postButton = By.xpath("//span[text()='Post']//parent::button[@type='submit']");
}
