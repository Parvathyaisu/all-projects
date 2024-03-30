package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandlePrgrm {
	EdgeDriver driver;

@BeforeTest
	  public void setup()
		 {
			 	  driver=new EdgeDriver();
		 } 	  
			
@Test
     public void test()
     {
	        driver.get("https://demo.guru99.com/popup.php");
	        String currentwindow =driver.getWindowHandle(); //current window
	        
	        System.out.println("current window :"+driver.getTitle());
	        driver.findElement(By.xpath("/html/body/p/a")).click();
	        
	        Set<String> allWindowHandles=driver.getWindowHandles();//multiple windows
	        
	        for(String handle :allWindowHandles)
	        {
	        	if(!handle.equalsIgnoreCase(currentwindow))
	        	{
	        		driver.switchTo().window(handle);
	        		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd@gmail.com");
	        		driver.close(); //close tab
	        	}
	       
	                driver.switchTo().window(currentwindow);
	        }
	        
	        
	        
	   }
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
