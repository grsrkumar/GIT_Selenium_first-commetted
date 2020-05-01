package Package;

import org.testng.annotations.Test;

public class TestNG_dependsonMethods
{
  
	  @Test
	  public void OpenBrowser()
	    {
	        System.out.println("Test case Open the browser");
	    }

	   //---------------------  
	    
	    @Test(dependsOnMethods= {"SignIn"})
	   public void Logout()
	    {       
	        System.out.println("Test case Logout");   
	    }

	    //----------------------
	    
	    @Test(dependsOnMethods= {"OpenBrowser"})
	   public void SignIn()
	    {       
	    	System.out.println("Test case  SignIn"); 
	    }

	
  }

