package flipkartestcases;



import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import flipkartpom.FlipkartCartpage;
import flipkartpom.FlipkartHomePage;
import flipkartpom.FlipkartloginPom;
import flipkartpom.FlipkartplaceorderPage;
import flipkartpom.FlipkartsearchItem;

public class Testcase1 extends BaseClass
{
	FlipkartloginPom f1;
	FlipkartHomePage s1;
  public Testcase1() throws IOException 
  {
		super();
	}

@Test()
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
	  o1.increaseitemPage();
	  Thread.sleep(3000);
	  o1.amount();
  }
}

