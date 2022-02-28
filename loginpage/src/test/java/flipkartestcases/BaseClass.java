package flipkartestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass

{  
	WebDriver driver;
	@BeforeClass()
	public void setup()
	{
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//@AfterClass()
	public void tearDown()
	{
	driver.quit();
	}


}
