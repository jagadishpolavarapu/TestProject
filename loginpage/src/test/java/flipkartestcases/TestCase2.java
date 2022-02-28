package flipkartestcases;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import flipkartpom.FlipkartCartpage;
import flipkartpom.FlipkartHomePage;
import flipkartpom.FlipkartloginPom;
import flipkartpom.FlipkartplaceorderPage;
import flipkartpom.FlipkartsearchItem;

public class TestCase2 extends BaseClass
{

	  @Test()
	  public void scenario1() throws InterruptedException
	  {
		  FlipkartloginPom f1=new FlipkartloginPom(driver);
		  Thread.sleep(4000);
		  f1.enterUsername("8341696877");
		  f1.enterPassword("jaggu420");
		  f1.clicklogin();
		  FlipkartHomePage s1=new FlipkartHomePage(driver);
		  s1.enterSearch("Tv"+Keys.ENTER);
		  Thread.sleep(3000);
		  FlipkartsearchItem i1=new FlipkartsearchItem(driver);
		  i1.item();
		  Thread.sleep(2000);
		  Set<String> s = driver.getWindowHandles();
		  Iterator<String> i2=s.iterator();
		  String parentWindow=i2.next();
		  String childWindow=i2.next();
		  Thread.sleep(3000);		  
		  driver.switchTo().window(childWindow);
		  Thread.sleep(3000);
		  FlipkartCartpage c1=new FlipkartCartpage(driver);
		  c1.cartPage();
		  FlipkartplaceorderPage o1=new FlipkartplaceorderPage(driver);
		  
	  }
	}

