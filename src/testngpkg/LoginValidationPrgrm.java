package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginValidationPrgrm {
	EdgeDriver driver;

@BeforeTest
		public void setup()
		 {
			driver=new EdgeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
		 }
@Test
	public void test() 
	{	
	    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	
	    String exp="https://practicetestautomation.com/logged-in-successfully/";
	    String actualtitle=driver.getCurrentUrl();
	    
	    // Assert.assertEquals(actualtitle, exp);
	
	    if(exp.equals(actualtitle))
	     {
		   System.out.println("pass");
	     }
	    else
	     {
		   System.out.println("fail");
	     }
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
