package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {
	ChromeDriver driver;

@Before
	 public void setUp()
     {
  	   driver=new ChromeDriver();
  	
     }
     
@Test
     public void fbLogin()
      {
	    driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdf45");
        driver.findElement(By.xpath("//button[@name='login']")).click();
      }


	

	
	
}
