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

	@FindBy(xpath="(//div[@class='MIXNux']/div)[1]")
	private WebElement itemEntered;
	
	public void item()
	{
    	itemEntered.click();
	}

}
