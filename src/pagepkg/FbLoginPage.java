package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLoginPage {
  WebDriver driver;
                                             //WITHOUT PAGE FACTORY
  
    By fbemail=By.id("email");        
    By fbpswd=By.id("pass");
    By fbloginbutton=By.name("login");
   
	public FbLoginPage(WebDriver driver)
	 {
		this.driver=driver;
	 }
	
    public void setvalues(String email,String pswd)	
     {
	    driver.findElement(fbemail).sendKeys(email);
	    driver.findElement(fbpswd).sendKeys(pswd);
     }
	
    public void login()	
     {
	    driver.findElement(fbloginbutton).click();
     }
	
	
	
	
	
}
