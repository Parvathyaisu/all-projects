package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayPrgrm {
	EdgeDriver driver;

@BeforeTest
	    public void setup()
		  {
		 	 driver=new EdgeDriver();
		 	 driver.get("https://www.ebay.com/"); 
		 	 driver.manage().window().maximize();
		 }
@Test
	 public void ebay() 
	     {
		            
	      	  driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Toys"); //toys
	      	  driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click(); //search
	      	  
	      	  JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("window.scrollBy(0,750)", "");
	      	  
	      	  driver.findElement(By.xpath("//*[@id=\"item2d8a1767f0\"]/div/div[2]/a")).click(); //toy link
	      	  
	      	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		      js.executeScript("window.scrollBy(0,250)", "");
		      
		      driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[6]/ul/li[2]/div/a")).click(); //add to cart
	      	  
	      	  
		      driver.navigate().to("https://www.ebay.com/"); 
		     
		      driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
		      
		      driver.findElement(By.xpath("//*[@id=\"personalaccount-radio\"]")).click(); 
		      driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Parvathy");
		      driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("R");
		      driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("abc@gmail.com");
		      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcD#123");
		      driver.findElement(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")).click();
		     
	            
	     }
	
}
	
	
	

