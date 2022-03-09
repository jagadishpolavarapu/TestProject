package flipkartestcases;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import flipkartpom.Amazoncartpage;
import flipkartpom.Amazonitemclickpage;
import flipkartpom.Amazonsearchpage;
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
		  FlipkartplaceorderPage o1=new FlipkartplaceorderPage(driver);
		  o1.amount();
		  FlipkartCartpage c1=new FlipkartCartpage(driver);
		  c1.cartPage();
		  o1.increaseitemPage();
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(2000);
		  Set<String> s3 = driver.getWindowHandles();
		  Iterator<String> i3=s3.iterator();
		  String amazonparentWindow=i3.next();
		  String amazonchildWindow=i3.next();
		  Thread.sleep(3000);		  
		  driver.switchTo().window(amazonchildWindow);
		  Amazonsearchpage a1=new Amazonsearchpage(driver);
		  a1.amazonsearchitem("tv"+Keys.ENTER);
		  Amazonitemclickpage c2=new Amazonitemclickpage(driver);
		  c2.amazonitem();
		  Amazoncartpage c3=new Amazoncartpage(driver);
		  c3.cartPageamazon();
}
	}

