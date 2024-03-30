package rishitestpkg;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import rishipagepkg.RishiHerbalLoginPage;

public class RishiHerbalTestPrgrm extends BaseClass{
	/*public static WebDriver driver;

	@BeforeTest
		 public void setup()
		  {
		     driver=new EdgeDriver();
		     driver.get("https://rishiherbalindia.linker.store/");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  }*/
	@Test
		public void testlogin()
		{ 
		RishiHerbalLoginPage rh =new RishiHerbalLoginPage(driver);
		rh.myaccountclick();
		rh.loginclick();
		rh.setvalues("parvathyaisu@gmail.com","ammu345Z");
		rh.loginbutton();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
