package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FbLoginPage;

public class FbLoginTestPrgrm extends BaseClass{

	                                                  //WITHOUT PAGE FACTORY
	
/*
 	 public static WebDriver driver;

@BeforeTest
	 public void setup()
	  {
	     driver=new EdgeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  }
*/
@Test
     public void testlogin()
      {
	     FbLoginPage ob=new FbLoginPage(driver);
	     ob.setvalues("ammu@gmail.com","ammuz4");
	     ob.login();
	     driver.navigate().back();
      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
