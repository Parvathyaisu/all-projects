package pkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExercisePgm {
	EdgeDriver driver;

@Before
	  public void setUp()
		 {
			  driver=new EdgeDriver();
			  driver.get("https://automationexercise.com/");
			 
	     }		

@Test	
	  public void logo()
	       {
//title
	          String actualtitle=driver.getTitle();
              String title="Automation Exercise - Signup/Login";
	          if(title.equals(actualtitle)) 
                {
 	              System.out.println("title is same");
                }
              else
                {
 	              System.out.println("not same title"); 
                }
//total links       
	           List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
 	           System.out.println("Total no of links="+linkdetails.size());
	           
	       
	       }
@Test	
	  public void webpagedetails()	
	     {
//sign up	           
	           driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
 	           driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("parvathy");
 	           driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("parvathy004@gmail.com");
 	           driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	      
               driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	           driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Parvathy21");
	          
	           WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
			   Select daydetails=new Select(day);
			   daydetails.selectByValue("7");
			 
			   WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
			   Select monthdetails=new Select(month);
			   monthdetails.selectByValue("12");
			
			   WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
			   Select yeardetails=new Select(year);
			   yeardetails.selectByValue("2021");
             
	           driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("parvathy");
               driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("r");
               driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("luminar, Ernakulam");
               driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("luminartechnolab, Ernakulam");
               
               WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
               Select countryname=new Select(country);
			   countryname.selectByVisibleText("India");
	           
			   driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
			   driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Ernakulam");
			   driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("682035");
			   driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9562170342");
			   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
       }

@After
      public void teardown()
       {
	     driver.quit();
       }
}
