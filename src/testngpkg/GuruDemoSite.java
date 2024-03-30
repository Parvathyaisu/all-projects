package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GuruDemoSite {
	 EdgeDriver driver;
		
@BeforeTest
	        public void setup()
	 	 	     {
	 	 	 	     driver=new EdgeDriver();
	 	 	 	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");  
	 	 	     }

@Test	 	
            public void test()
                {	
	                Actions act=new Actions(driver);
	                WebElement name=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	                act.contextClick(name);
	                act.perform();
                    driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click(); //edit click
                  
                 
                    Alert a=driver.switchTo().alert(); //converting to alert
                    String alerttext=a.getText();
                    a.accept();
                    System.out.println("alert text="+alerttext);
                  
                    WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
  	                act.doubleClick(doubleclick).perform();
	
  	                Alert text=driver.switchTo().alert(); 
                    String alerttext2=text.getText();
                    text.accept();
                    System.out.println("alert text shown is ="+alerttext2);
	
	
	
	
	
	
                }
	
	
}
