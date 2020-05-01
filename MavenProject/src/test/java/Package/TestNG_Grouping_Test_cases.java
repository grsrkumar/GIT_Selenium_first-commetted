package Package;

import org.testng.annotations.Test;

public class TestNG_Grouping_Test_cases 
{
  
	
	@Test(groups= {"sanity","Smoke"})
  public void test1() 
   {
		System.out.println("sanity_Smoke");
   }
	  
//----------------------------------------------	  

	@Test(groups= {"sanity","Regressing"})
  public void test2() 
   {
		System.out.println("sanity_Regressing");
   }
//--------------------------------------------------	   
	  
 

	@Test(groups= {"Regression"})
  public void test3() 
   {
		System.out.println("Regression");
   }
	    
//------------------------------------------------	  
	  

	@Test(groups= {"sanity","Smoke"})
  public void test4() 
   {
		System.out.println("sanity_Smoke");
   }
	  	  
//---------------------------------------------	  
		  

	@Test(groups= {"sanity","Regressing"})
  public void test5() 
   {
		System.out.println("sanity_Regressing");
   }
	    
	//-------------------------------------------==  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

