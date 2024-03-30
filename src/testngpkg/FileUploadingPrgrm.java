package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadingPrgrm {
EdgeDriver driver;

@BeforeTest
		public void setup()
			 {
					driver=new EdgeDriver();
				   
			 }
@Test
      public void test() throws Exception
       {
	         driver.get("https://www.ilovepdf.com/word_to_pdf");
	         driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();  // button click
	         
	         fileUpload("C:\\Users\\parv\\Downloads\\Management.docx");
       }

     public void fileUpload(String p) throws AWTException, InterruptedException
       {
	      StringSelection strSelection =new StringSelection(p);
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);// stored in clipboard
	      
	      Robot robot = new Robot();
	      
	      robot.delay(3000);
	      
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      
	      Thread.sleep(2000);
	      
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
         
	      robot.delay(2000);

       }

     









}