package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgrm {
	
	
	
	EdgeDriver driver;

@Before
		public void setUp()
		 {
			 driver=new EdgeDriver();
			 driver.get("file:///C:/Users/parva/OneDrive/Desktop/webpage.html");
	     }		

@Test	
	   public void test() throws Exception
	     {
	
	         File name=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         FileHandler.copy(name, new File("C:\\Users\\parva\\OneDrive/screenshot.png"));
	
	         WebElement a=driver.findElement(By.xpath("/html/body/input[1]"));
	         File name2=a.getScreenshotAs(OutputType.FILE);
	         FileHandler.copy(name2, new File("./Screenshot/displayButton.png"));
	
	     }
	
	
	
}
