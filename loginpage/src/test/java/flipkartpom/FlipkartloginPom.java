package flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartloginPom 
{

	WebDriver ldriver;
	public FlipkartloginPom(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginButton;
	
    public void enterUsername(String username)
	{
    	userName.sendKeys(username);
	}
    
    public void enterPassword(String password)
    
    {
    	
    passWord.sendKeys(password);
    }
    public void clicklogin()
    {
      loginButton.click();
    }
   
}

