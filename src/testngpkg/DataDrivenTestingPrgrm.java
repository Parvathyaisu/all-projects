package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTestingPrgrm {
	EdgeDriver driver;

@BeforeTest
		public void setup()
		 {
			driver=new EdgeDriver();
		 }
@Test
	public void datadriven() throws IOException 
	 {	
	       driver.get("https://www.facebook.com");
	 
	       FileInputStream f=new FileInputStream("C:\\Users\\parva\\OneDrive\\Desktop\\Book1.xlsx");
	       
	       XSSFWorkbook wb=new  XSSFWorkbook(f); //return workbook details
	       XSSFSheet sh=wb.getSheet("Sheet1");  //returns sheet details
	       
	       int rowcount=sh.getLastRowNum(); //returns row count
	       System.out.println("rowcount:"+rowcount);
	       
	       for(int i=1;i<=rowcount;i++)
	        {
	    	  String username=sh.getRow(i).getCell(0).getStringCellValue();
	    	  String password=sh.getRow(i).getCell(1).getStringCellValue();
	    	 
	    	  System.out.println("username:"+username+"\n"+"password:"+password);  
	    	 
	    	  driver.findElement(By.name("email")).clear();
	    	  driver.findElement(By.name("email")).sendKeys(username);
	    	  driver.findElement(By.name("pass")).sendKeys(password);  
	    	  driver.findElement(By.name("login")).click();  
              driver.navigate().refresh();
              // driver.navigate().back();
            }
	
	        String exp="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzAzNzYwNTE5LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		    String actualtitle=driver.getCurrentUrl();
		    
		    Assert.assertEquals(actualtitle, exp);
	       
	 } 
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
