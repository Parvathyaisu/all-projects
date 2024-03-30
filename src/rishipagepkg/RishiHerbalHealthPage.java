package rishipagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RishiHerbalHealthPage {
	WebDriver driver;
	   
	@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement healthpage ;

    @FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement sendenquiries;
    
    @FindBy(xpath="//*[@id=\"Enquiry\"]")
	WebElement enqirytype;
    
    @FindBy(xpath="//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement enquirysendbutton;
    
	 public RishiHerbalHealthPage(WebDriver driver)
	    {
	         this.driver=driver;
	         PageFactory.initElements(driver,this);
	    }
     public void healthpageclick()	
	    {
		     healthpage.click();
	    }
     public void sortbyclick()	
	   {
		     Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
			 dropdown.selectByVisibleText("A-Z alphabetical order");
		}
	 public void sendenqiries() 
	  { 
			sendenquiries.click();
	  }
     public void setvalues(String values)
      {
			enqirytype.sendKeys(values);
		    enquirysendbutton.click();
      }
     public void send()
      {
		    enquirysendbutton.click();
	  }

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

