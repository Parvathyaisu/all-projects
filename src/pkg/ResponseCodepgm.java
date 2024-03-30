package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class ResponseCodepgm {

	String link="https://www.google.com";
	
@Test
    public void test()
     {
	     try
	     {
	    	 URL u=new URL(link);
	    	 HttpURLConnection conn=(HttpURLConnection)u.openConnection();
	    	 int code=conn.getResponseCode();
	    	 
	    	 if(code==200) 
	    	  {
	    		 System.out.println("Response code is 200");
	    	  }
	    	 else
	    	  {
	    		 System.out.println("Response code is not 200");
	    	  }
	     }
	   
	     catch(Exception e)
	       {
		   
	       }
	
	
	
	
	
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
