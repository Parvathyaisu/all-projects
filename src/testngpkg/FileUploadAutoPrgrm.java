package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadAutoPrgrm {
       WebDriver driver;

@BeforeTest
         public void beforetest()
	      {
			driver=new EdgeDriver();
		   
	      }	
	
@Test
        public void main() throws InterruptedException, Exception
         {
	       driver.get("https://www.ilovepdf.com/word_to_pdf");
           driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
           Thread.sleep(3000);
           Runtime.getRuntime().exec("C:\\Users\\parva\\OneDrive\\Documents\\autoitscripts\\T1.exe");
           Thread.sleep(3000);
         
         
         
         
         
         }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
