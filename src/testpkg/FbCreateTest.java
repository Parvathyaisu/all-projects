package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FbCreatePage;

public class FbCreateTest extends BaseClass{
	 
/*	public static WebDriver driver;

@BeforeTest
	 public void setup()
	  {
	     driver=new EdgeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  }*/
@Test
	public void testlogin()
	{ 
		FbCreatePage fb=new FbCreatePage(driver);
		fb.createpageclick();
		fb.titleverification();
		fb.fbgetstartedbutton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
