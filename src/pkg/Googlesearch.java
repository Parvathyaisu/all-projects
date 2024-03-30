package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	
@Before
	 public void setUp()
	  {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	  }
@Test
	 public void titleVerification()
	 {
	    driver.get("https://www.google.com");
	    driver.findElement(By.xpath("//*[contains(@id,'APjFqb')]")).sendKeys("rediffmail",Keys.ENTER);
	   // driver.findElement(By.xpath("//input[@name='btnK']")).click();
	 }
}
