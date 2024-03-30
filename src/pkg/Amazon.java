package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		ChromeDriver driver;

@Before
		public void setUp()
	     {
	  	   driver=new ChromeDriver();
	  	
	     }		
@Test
       public void amazonLogin() throws InterruptedException
        {		
	      driver.get("https://www.amazon.in");
	      driver.findElement(By.xpath("//*[@id='nav-search']//input[@placeholder='Search Amazon.in']")).sendKeys("mobiles");
	      driver.findElement(By.xpath("//div[@id='nav-search']//input[@id='twotabsearchtextbox']")).click();
	      driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span[2]")).click();
	      driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
	      driver.findElement(By.xpath("//*[@id='s-refinements']/div[2]/ul/li/span/a/span")).click();
       }



}
