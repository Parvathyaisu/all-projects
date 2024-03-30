package pkg;

import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		
     EdgeDriver driver=new  EdgeDriver();
     driver.get("https://www.facebook.com");
     String actualtitle=driver.getTitle();
     System.out.println("title="+actualtitle);
     
     String title="Facebook";
	 
     if(title.equals(actualtitle)) 
     {
    	 System.out.println("title is same");
     }
     else
     {
    	 System.out.println("not same title"); 
     }
     driver.quit();
	}

}
