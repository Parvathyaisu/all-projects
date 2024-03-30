package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;


public class  BaseClass  {

	 public static WebDriver driver;

@BeforeClass
	 public void setup()
	  {
	     driver=new EdgeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	  }
	

	
	
	
	
	
	
	
	
}
