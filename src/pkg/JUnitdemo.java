package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitdemo {
     ChromeDriver driver;
       
 @Before
 public void setUp()
  {
	 driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com");
  }
   
 @Test
 public void titleVerification()
  {
	 String title=driver.getTitle();
	 System.out.println(title);
  }

 @After
 public void tearDown()
  {
	 driver.quit();
  }

}





