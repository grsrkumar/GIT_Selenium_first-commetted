package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotationTest 
{
	  
	  WebDriver d1;

	
	  @Test
	  public void f1() 
	  {
		  
			d1.get("https://www.fb.com");
			//FB Login page:UserName_Column, Password and Submit Buttion		
			d1.findElement(By.id("email")).sendKeys("sree_6544@yahoo.co.in");
			d1.findElement(By.id("pass")).sendKeys("9705223221@Kumar");
			d1.findElement(By.id("u_0_b")).click();
			  System.out.println("executing FB"); 
		//---------------------------------------------------------------------------------------------------------------	  
		 			
		    //Thread.sleep(5000);
	  }
			   
	  @AfterMethod
	  public void f() 
	  {
	  d1.close();
	  System.out.println("executing After"); 
	  }
	  
	  //-------------------------
	  
	  
	  @BeforeMethod
	  public void f2() 
	  {
	  	
	  //chrome
	  System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
	  d1 = new ChromeDriver();
	  d1.manage().window().maximize();
	  System.out.println("executing before");
	  
}



}