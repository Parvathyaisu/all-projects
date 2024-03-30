package rishipagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RishiHerbalLoginPage {
	WebDriver driver;
   
@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a/span")
WebElement myaccountdropdown ;

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
WebElement loginlink;

@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
WebElement loginemail;

@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
WebElement loginpswd;

@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/button[1]")
WebElement loginbutton;

   public RishiHerbalLoginPage(WebDriver driver)
    {
         this.driver=driver;
         PageFactory.initElements(driver,this);
    }
   public void myaccountclick()	
    {
         myaccountdropdown.click();
    }
   public void loginclick()	
    {
	     loginlink.click();
    }
   public void setvalues(String email, String pswd) 
    {
	     loginemail.sendKeys(email);
	     loginpswd.sendKeys(pswd); 
	}
   public void loginbutton() 
	{
		 loginbutton.click();
	}
   
   
   
}
