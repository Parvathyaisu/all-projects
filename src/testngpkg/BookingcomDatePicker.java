package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingcomDatePicker {
	 EdgeDriver driver;
		
@BeforeTest
	       public void setup() throws InterruptedException 
	  	     {
	  	 	     driver=new EdgeDriver();
	  	 	     driver.get("https://www.booking.com/");  
	  	 	   Thread.sleep(3000);
	  	     }	
	
@Test	
public void datepickertest()
     {
	     driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]/span")).click();
	     datepickermethod("December 2023" ,"20");
     }

public void datepickermethod(String expmonth, String expdate) {
	
	while(true)
	{
	   String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
	   System.out.println("month:"+month);
	   if(month.equals(expmonth))
	 {
		 break;
	 }
	 else
	 {
		driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/h3")).click(); 
	 }
   }
	
	
	List <WebElement> alldates= driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr[4]/td[6]/span"));
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
