package flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage
{

	
	WebDriver ldriver;
	public FlipkartHomePage(WebDriver driver) 
	{
	
		ldriver=driver;
		PageFactory.initElements(driver, this);
			
	}

	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement searchIcon;
	
	public void enterSearch(String searchitem)
	{
    	searchIcon.sendKeys(searchitem);
	}
    
	
}
