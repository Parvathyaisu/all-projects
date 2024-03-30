package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Flipkart {
      ChromeDriver driver;
	
@Before
     public void setUp()
     {
	   driver=new ChromeDriver();
     }
	
@Test
    public void flipkartLogin()
     {
       driver.get("https://www.flipkart.com");
	   driver.findElement(By.xpath("//div[@id='container']//input[@title='Search for Products, Brands and More']")).sendKeys("toys");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	   
     }
}
