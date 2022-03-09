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

	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[5]/div[1]/div/button[2]")
	private WebElement increasecart;
	
	@FindBy(xpath="//div[@class='Ob17DV _3X7Jj1']")
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
