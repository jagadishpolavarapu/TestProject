package flipkartestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import qa.util.Timeout_Util;

public class BaseClass

{  
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() throws IOException
	{
		try
		{
	       prop=new Properties();
	       FileInputStream fis= new FileInputStream("C:\\Users\\jagadish\\git\\TestProject\\loginpage\\src\\main\\java\\qa\\config\\config.properties");
	       prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		}
	
	@SuppressWarnings("deprecation")
	@BeforeClass()
	public void setup()
	{	
	 String browserName=prop.getProperty("browser");
	 if(browserName.equals("Chrome"))
	 {
		
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();	  
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
     driver.get(prop.getProperty("url"));
	 driver.manage().timeouts().pageLoadTimeout(Timeout_Util.pageLoad,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(Timeout_Util.timeOuts, TimeUnit.SECONDS);
		
	}
	}
	//@AfterClass()
	public void tearDown()
	{
	driver.quit();
	}


}
