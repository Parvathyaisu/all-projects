package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkResponsecode {
	ChromeDriver driver;
	
@Before
	  public void setUp()
		{
		     driver=new ChromeDriver();
		     driver.get("https://www.facebook.com");
		}

@Test
	 public void linkDetails()
	   {
		 List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		 System.out.println("Total no of links="+linkdetails.size());
	    
		 for(WebElement element:linkdetails)
           {
			 String link=element.getAttribute("href");
			 verify (link);
           }
	
	   }

	private void verify(String link)
	 {
		
		try
		{
		   URL u=new URL(link);
		   HttpURLConnection con= (HttpURLConnection)u.openConnection();
		   int code=con.getResponseCode();
		   if(code==200)
		    {
			   System.out.println("Response code is 200-----"+link);
		    }
		   else if(code==404)
		    {
			   System.out.println("Response code is 404-----"+link);
		    }
		   else
		    {
			   System.out.println("Other code"+link);	
		    }
	     }
		
		catch(Exception e)
		 {
			
		 }
		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
