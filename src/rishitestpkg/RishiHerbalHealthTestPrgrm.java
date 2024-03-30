package rishitestpkg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import rishipagepkg.RishiHerbalHealthPage;


public class RishiHerbalHealthTestPrgrm extends BaseClass{
 
	/*	public static WebDriver driver;

	@BeforeTest
		 public void setup()
		  {
		     driver=new EdgeDriver();
		     driver.get("https://rishiherbalindia.linker.store/");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  }*/
	@Test
		public void test()
		{ 
		RishiHerbalHealthPage rhh=new RishiHerbalHealthPage(driver);
		rhh.healthpageclick();
		rhh.sortbyclick();
		rhh.sendenqiries();
		rhh.setvalues("More about the product");
		rhh.send();
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
