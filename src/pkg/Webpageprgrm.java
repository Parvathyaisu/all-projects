package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Webpageprgrm {
	EdgeDriver driver;

@Before
		public void setUp()
		   {
		  	   driver=new EdgeDriver();
		  	   driver.get("file:///C:/Users/parva/OneDrive/Desktop/webpage.html");
           }		

@Test	
      public void webpagedetails()
       {
             driver.findElement(By.xpath("/html/body/input[1]")).click();
             Alert a=driver.switchTo().alert();
             String alerttext=a.getText();
             a.accept();
             System.out.println("alert text="+alerttext);
             driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("parvathy");
             driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("r");
       }      

@After
     public void webpagequit()
      {
            driver.quit();
      }
	
	
}
