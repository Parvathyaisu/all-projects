package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DatePickerprgrm {
	  EdgeDriver driver;
	
@BeforeTest
      public void setup() throws InterruptedException
 	     {
 	 	     driver=new EdgeDriver();
 	 	     driver.get("https://www.trivago.com");  
 	 	     Thread.sleep(3000);
 	     }	
@Test	
public void datepickertest()
     {
	     driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]")).click();
	     datepickermethod("December 2023" ,"20");
     }

public void datepickermethod(String expmonth, String expdate) {
	
	while(true)
	{
	   String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
	   System.out.println("month:"+month);
	   if(month.equals(expmonth))
	 {
		 break;
	 }
	 else
	 {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click(); 
	 }
   }

      List <WebElement> alldates= driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
      for(WebElement datelement:alldates)
     {
	  String date=datelement.getText();
	  if(date.equals(expdate))
	  {
		 datelement.click();
		  break;
	  }
     }



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
