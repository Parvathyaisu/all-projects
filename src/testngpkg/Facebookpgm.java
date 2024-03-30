package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebookpgm {
	 EdgeDriver driver;
		
@BeforeTest(alwaysRun = true)
	    public void setup()
	       {
	 	         driver=new EdgeDriver();
	 	          
	       }

@BeforeMethod(alwaysRun = true)
	    public void urlloading()
	        {
	 	         driver.get("https://www.facebook.com/");
	        }

@Parameters({"emailid","password"})
@Test
	    public void test1(String emailid,String password)
	    {
	             
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailid);
                driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
                    
	        }
	
	
	
	
	
	
	
	
}
