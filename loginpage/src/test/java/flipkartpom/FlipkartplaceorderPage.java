package flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartplaceorderPage 
{
	WebDriver ldriver;
	public FlipkartplaceorderPage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//div[@class='nZz3kj _1hNI6F']//following::div[3]//button[2]")
	private WebElement increasecart;
	
	@FindBy(xpath="//div[@class='_1dqRvU']")
	private WebElement totalPrice;
	
	
	public void increaseitemPage()
	{
		increasecart.click();
	}
	public void amount()
	{
		System.out.println(totalPrice.getTagName());
	}

}
