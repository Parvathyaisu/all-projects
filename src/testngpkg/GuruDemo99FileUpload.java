package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GuruDemo99FileUpload {
	EdgeDriver driver;

@BeforeTest
		public void setup()
		 {
				driver=new EdgeDriver();
			    driver.get("https://demo.guru99.com/test/upload/");
		        driver.manage().window().maximize();
					 
		 } 	  
@Test
	    public void test()
	     {	
	            
	            driver.findElement(By.xpath("//*//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\parva\\OneDrive\\Desktop");
	         
	            driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	            driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	            
	            String t = "Submit File";
	            WebElement cont= driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
	           
	            if (driver.getPageSource().contains("Submit File")) 
	            {
	                System.out.println("Text: " + t + " is present. ");
	            } else {
	                System.out.println("Text: " + t + " is not present. ");	  
	  	       }
	            
	            
	             
	            
	            
	            
	            
	            
	     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
