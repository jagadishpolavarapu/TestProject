package flipkartestcases;
import java.io.IOException;
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

		  FlipkartloginPom f1;
		  FlipkartHomePage s1;
		  public TestCase2() throws IOException 
		  {
				super();
			}

		@Test(priority=1)
		  public void loginMethod() throws InterruptedException
		  {
			  f1=new FlipkartloginPom(driver);
			  Thread.sleep(4000); 
			  f1.enterLogincredentilas(prop.getProperty("username"),prop.getProperty("password"));
			  
		  }
		@Test(dependsOnMethods="loginMethod")
		public void homePageMethod() throws InterruptedException
		{
			  s1=new FlipkartHomePage(driver);
			  s1.enterSearch(prop.getProperty("search")+Keys.ENTER);
		}
		@Test(dependsOnMethods="homePageMethod") 
		public void searchItemclicable()throws InterruptedException
		{
		      Thread.sleep(4000);
			  FlipkartsearchItem i1=new FlipkartsearchItem(driver);
			  i1.item();
		}
		@Test(dependsOnMethods="searchItemclicable") 
		public void cartMethod() throws InterruptedException
		{
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
		}
		@Test(dependsOnMethods="cartMethod") 
		public void getMoneyMethod() throws InterruptedException
		{
		  FlipkartplaceorderPage o1=new FlipkartplaceorderPage(driver);
		  Thread.sleep(3000);
		  o1.amount();
		  driver.get(prop.getProperty("url1"));
		}
		@Test(dependsOnMethods="getMoneyMethod") 
		public void amazonItemSearch() throws InterruptedException
		{
		  Thread.sleep(2000);
		  Set<String> s3 = driver.getWindowHandles();
		  Iterator<String> i3=s3.iterator();
		  String amazonparentWindow=i3.next();
		  String amazonchildWindow=i3.next();
		  Thread.sleep(3000);		  
		  driver.switchTo().window(amazonchildWindow);
		  Amazonsearchpage a1=new Amazonsearchpage(driver);
		  a1.amazonsearchitem(prop.getProperty("search1")+Keys.ENTER);
		}
		@Test(dependsOnMethods="amazonItemSearch")
		public void amazonItemclick() throws InterruptedException
		{
		  Amazonitemclickpage c2=new Amazonitemclickpage(driver);
		  c2.amazonitem();
		  
		  	 }
		@Test(dependsOnMethods="amazonItemclick")
		public void amazoncartPage() throws InterruptedException
		{
			Amazoncartpage c1=new Amazoncartpage(driver);
			c1.cartPageamazon();
		}
		
}


	

