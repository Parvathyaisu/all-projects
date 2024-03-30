package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitAndExplicitWaits {
        EdgeDriver driver;

@BeforeTest
	   public void setup()
		 {
		 	  driver=new EdgeDriver();
		 	  driver.get("https://www.ebay.com/");  
		 }
		
@Test
	   public void test()
	     {
	         
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicit wait
	          
	          WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); //Explicit wait
	      	  Actions act=new Actions(driver); 
	      	  
	      	  WebElement name=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	      	  act.moveToElement(name).perform();
	     
	     //explicit wait
	      	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
	    //explicit wait
	      	  
	      	  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	                
	      }
	
	
	
	
	
	
	
	
	
	
	
	
}
