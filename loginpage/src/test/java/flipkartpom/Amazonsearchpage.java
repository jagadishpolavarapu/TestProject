package flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonsearchpage 
{
	WebDriver ldriver;
	public Amazonsearchpage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//input[@class='nav-input nav-progressive-attribute']")
	private WebElement searchitemname;

	
	public void amazonsearchitem(String itemname)
	{
		searchitemname.sendKeys(itemname);
	}

	
}

