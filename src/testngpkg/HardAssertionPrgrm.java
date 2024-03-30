package testngpkg;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertionPrgrm {
	EdgeDriver driver;

@BeforeTest
			public void setup()
			 {
				 driver=new EdgeDriver();
				 driver.get("https://www.google.com");
			 }
@Test
    public void test() 
     {	
	    String exp="google";
	    String actualtitle=driver.getTitle();
	    
	    Assert.assertEquals(actualtitle, exp);
	    
	    System.out.println("hello");
	
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
