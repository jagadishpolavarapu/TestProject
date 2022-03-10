package flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazoncartpage
{
	WebDriver ldriver;
	public Amazoncartpage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement amazonaddtocart;
	
	
	@FindBy(id="attach-accessory-cart-subtotal")
	private WebElement cartMoney;
	public void cartPageamazon()
	{
		amazonaddtocart.click();
		cartMoney.getText();
		
	}

}

