package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPaste {
	   EdgeDriver driver;
		
@BeforeTest
          public void setup()
	 	     {
	 	 	     driver=new EdgeDriver();
	 	 	     driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  
	 	     }
	
@Test
          public void test()
             {
       	        Actions act=new Actions(driver);    
	            WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	            WebElement rediffid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	            fullname.sendKeys("arya");
	            act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL); //select
	            act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL); //copy
	            act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL); //paste
	            act.perform();
             }
	
	
	
	
	
	
	
	
	
	
	
}
