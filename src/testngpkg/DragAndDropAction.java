package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropAction {
	 EdgeDriver driver;
		
@BeforeTest
	 	   public void setup()
	 	 	 {
	 	 	 	 	driver=new EdgeDriver();
	 	 	 	 	driver.get("https://demo.guru99.com/test/drag_drop.html");  
	 	 	 }

@Test	 	
	      public void test()
	         {	
	 	            Actions act=new Actions(driver);
//amount	               
	 	            WebElement source=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	                WebElement destination=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));    
	 	            act.dragAndDrop(source, destination).build().perform();    
	 	                
	 	                
//account	 	           
	 	            WebElement name=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));    
	 	            WebElement acc=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	 	            act.dragAndDrop(name, acc).build().perform();
	 	            
	         }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
