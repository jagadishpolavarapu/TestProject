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

	@FindBy(xpath="//button[@text()="+"])[1]")
	private WebElement increasecart;
	
	@FindBy(xpath="(//span[contains(text(),'₹')])[1]/following::span[1])")
	private WebElement totalPrice;
	
	
	public void increaseitemPage()
	{
		increasecart.click();
	}
	public void amount()
	{
		System.out.println(totalPrice.getText());
	}

}
