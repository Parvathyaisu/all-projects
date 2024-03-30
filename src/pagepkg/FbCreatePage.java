package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FbCreatePage {
	WebDriver driver;
                                                              //WITH PAGE FACTORY

@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
WebElement fbcreatepage;

@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
WebElement fbgetstartedbutton;


     public FbCreatePage(WebDriver driver)
      {
          this.driver=driver;
          PageFactory.initElements(driver,this);
      }

     public void createpageclick()	
     {
        
         fbcreatepage.click();
         
     }
	
     
     public void titleverification()
       {
    	 String exp="Create a Page";
	       String Actualtitle=driver.getTitle();
	       if(Actualtitle.contains(exp)) 
	       {
	    	System.out.println("Text is present");   
	       }
	       else
	       {
	    	   System.out.println("Text is not present");
	       }
       }
     public void fbgetstartedbutton()	
      {
         
         
          fbgetstartedbutton.click();
      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
