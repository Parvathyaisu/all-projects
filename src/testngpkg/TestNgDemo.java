package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	  EdgeDriver driver;
	
@BeforeTest
       public void setup()
        {
	          driver=new EdgeDriver();
	          
        }

@BeforeMethod
       public void urlloading()
        {
	          driver.get("https://automationexercise.com/");
        }

@Test(enabled=false)
       public void test1()
         {
	            String actualtitle=driver.getTitle();
                String title="Automation Exercise";
                if(title.equals(actualtitle)) 
                 {
                    System.out.println("title is same");
                 }
                 else
                  {
                     System.out.println("not same title"); 
                  }
           }
	
@Test(priority = 2,invocationCount=3)
       public void test2()
         {
	            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
         }	

@Test(priority = 1)
       public void test3()
          {
	            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
                driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("parvathy");
                driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("parvathy005@gmail.com");
          }	

@AfterMethod
        public void aftermthd()
          {
	              System.out.println("after method details");
          }	
	
@AfterTest
          public void teardown()
            {
	             driver.quit();
            }	
	
}