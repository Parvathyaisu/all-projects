package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonprgrm {
	EdgeDriver driver;

@BeforeTest
		 public void setup()
			{
				 driver=new EdgeDriver();
				 driver.get("https://www.amazon.in/");
	             driver.manage().window().maximize();
				 
			} 	  
@Test
        public void test1()
           {	
	            
//search mobile phones	            
	             
	             driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
	             driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();           

//title verification
	             
	             String actualtitle=driver.getTitle();
	             String title="Amazon.in : mobilephones";
	     	     if(title.equals(actualtitle)) 
	              {
	         	    System.out.println("title is same");
	              }
	             else
	              {
	         	    System.out.println("not the same title"); 
	              }
           }
@Test
public void test2()
  {		   
    String currentwindow =driver.getWindowHandle(); //current window
    	        
    System.out.println("current window title:"+driver.getTitle());
    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();     	    
    	       
    Set<String> allWindowHandles=driver.getWindowHandles();
    	   
    for(String handle :allWindowHandles)
     {
       if(!handle.equalsIgnoreCase(currentwindow))
    	 {
    	   driver.switchTo().window(handle);
           driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click(); //add to cart
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span")).click(); //select cart
           driver.close();
         }
    	   driver.switchTo().window(currentwindow);
     }	    
    	 
                

	 
	    
               
                
                
                
                
                
                
                
                
           }
	
}
