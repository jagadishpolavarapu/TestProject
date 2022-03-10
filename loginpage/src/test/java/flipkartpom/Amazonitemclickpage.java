package flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonitemclickpage 
{
	WebDriver ldriver;
	public Amazonitemclickpage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="(//div[@class='a-section a-spacing-none aok-relative s-image-overlay-grey s-list-status-badge-container']/following::span[1]/a[1]/div)[1]")
	private WebElement amazonitemEntered;
	
	public void amazonitem()
	{
    	amazonitemEntered.click();
	}

}

