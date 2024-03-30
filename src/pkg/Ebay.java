package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;
	
@Before
	 public void setUp()
	  {
	     driver=new ChromeDriver();
		 driver.get("https://www.ebay.com");
	}	
	
@Test
     public void titleVerification()
      {
        String actualtitle=driver.getTitle();
        String title="Ebay.com";
	if(title.equals(actualtitle)) 
      {
    	 System.out.println("title is same");
      }
    else
      {
    	 System.out.println("not same title"); 
      }
	}
@Test
    public void ebayPage()
      {
	   driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	   driver.findElement(By.xpath("//table[@id='gh-sbc']//a[@href='https://www.ebay.com/b/Art/550/bn_1853728']")).click();
	   String src=driver.getPageSource();   
       String name="Shop by category";
   if(src.equals(name)) 
    {
        System.out.println("contains shop by category");
    }
   else
    {
       System.out.println("doesn't contain"); 
    }
     driver.findElement(By.xpath("//*[@class='b-visualnav__title']")).click();
	 driver.findElement(By.xpath("//a[@href='https://cart.payments.ebay.com/sc/view']")).click();
	 driver.findElement(By.xpath("//div[@id='mainContent']//a[2]")).click();
	 driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("books",Keys.ENTER);
	}  
}
