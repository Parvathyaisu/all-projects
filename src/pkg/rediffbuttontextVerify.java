package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffbuttontextVerify {
	EdgeDriver driver;
	
@Before
	public void setUp()
	  {
		  driver=new EdgeDriver();
	      driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	 }
@Test
    public void test()
	  {
	      String buttontext= driver.findElement(By.xpath("//*[contains(@name,'btnchkavail')]")).getAttribute("value");
	      if(buttontext.equals("Check availability"))
	       {
	         System.out.println("pass");	 
	       }
	      else
	       {
		     System.out.println("fail");	  
	       }
	  }
}
