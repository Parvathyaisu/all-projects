package testngpkg;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssertionPrgrm {
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
		    if(exp.equals(actualtitle))
		    {
		    	System.out.println("pass");
		    }
		    else
		    {
		    	System.out.println("fail");
		    }
	        System.out.println("hello");
	     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
