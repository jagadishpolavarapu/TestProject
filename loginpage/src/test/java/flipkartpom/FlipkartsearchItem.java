package flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartsearchItem
{ 
	WebDriver ldriver;
	public FlipkartsearchItem(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//div[@data-id=\"TVSFP6FJZGV4YM5A\"]//following::a")
	private WebElement itemEntered;
	
	public void item()
	{
    	itemEntered.click();
	}

}
