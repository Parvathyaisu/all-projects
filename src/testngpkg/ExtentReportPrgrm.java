package testngpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportPrgrm {
  WebDriver driver;
  String baseurl="https://www.facebook.com";
  ExtentHtmlReporter reporter;
  ExtentTest test;
  ExtentReports extent;
  
@BeforeTest
       public void beforetest()
        {
	     reporter=new ExtentHtmlReporter("./reports/myreport1.html");
	     reporter.config().setDocumentTitle("Automation Report");
	     reporter.config().setReportName("Functional Test");
	     reporter.config().setTheme(Theme.DARK);
	     
	     extent=new ExtentReports();
	     extent.attachReporter(reporter);
	     extent.setSystemInfo("Hostname", "Localhost");
	     extent.setSystemInfo("os","Windows11");
	     extent.setSystemInfo("Tester Name","Mizhi");
	     extent.setSystemInfo("Browser Name","Edge");
	     driver=new EdgeDriver();
	     
       }
	
@BeforeMethod
    public void setup()
     {
	     driver.get(baseurl);
     }
	
@Test
    public void fbtitleverification()
     {
	     test=extent.createTest("Fb Title verification");
	     String Exp="facebook";
	     String actualtitle=driver.getTitle();
	     Assert.assertEquals(Exp, actualtitle);
	    // System.out.println("Hello");
     }

@Test
    public void fblogotest()
     {
	     test=extent.createTest("Fb Logo Test");
	     boolean logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	     Assert.assertTrue(logo);
     }
	
@AfterTest
     public void teardown()
     {
	      extent.flush();
     }

@AfterMethod
    public void browserclose(ITestResult result) throws IOException
    {
	   if(result.getStatus()==ITestResult.FAILURE)
	    {
		    test.log(Status.FAIL, "Test case failed is"+result.getName());
		    test.log(Status.FAIL, "Test case failed is"+result.getThrowable());
		    String screenshotpath=screenshotMethod(driver,result.getName());
		    test.addScreenCaptureFromPath(screenshotpath);
			
	    }
	   else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
	   else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case Passed is"+result.getName());
		}
	}
    

public static String screenshotMethod(WebDriver driver, String screenshotname) throws IOException 
 {
	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
       String destination="./Screenshot/"+screenshotname +".png";
	   //File finaldestination=new File(destination);
	   //FileHandler.copy(src, finaldestination);
       FileHandler.copy(src, new File(destination));

	   return destination;
	
}
	
}
