package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Anno_SOP_Reporter {
  @Test
  public void f() 
  
   {
	  
/*	//chrome
		System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
				System.out.println("Browser lanched successful");
	ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  System.out.println("Window maximised");
	driver.get("https://www.fb.com");
	System.out.println("FB URl taking successfully");
	//FB Login page:UserName_Column, Password and Submit Buttion		
	driver.findElement(By.id("email")).sendKeys("sree_6544@yahoo.co.in");
	System.out.println("User name taken successfully");
	driver.findElement(By.id("pass")).sendKeys("9705223221@Kumar");
	System.out.println("password taken successfully");
	driver.findElement(By.id("u_0_b")).click();
	System.out.println("Login button clicked successfully");
	System.out.println("login Successfully");*/
	
	//-----------------------------------------------------------------------------------------------
	
	//chrome
			System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
					//System.out.println("Browser lanched successful");
					  Reporter.log("Browser Lanched successful");
		ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  		  //System.out.println("Window maximised");
		  Reporter.log("Window Maximised");
		driver.get("https://www.fb.com");
		          //System.out.println("FB URl taking successfully");
		Reporter.log("FB URl taking successfully");
		//FB Login page:UserName_Column, Password and Submit Buttion		
		driver.findElement(By.id("email")).sendKeys("sree_6544@yahoo.co.in");
		         //System.out.println("User name taken successfully");
		Reporter.log("User name taken successfully");
		driver.findElement(By.id("pass")).sendKeys("9705223221@Kumar");
		         //System.out.println("password taken successfully");
		Reporter.log("password taken successfully");
		driver.findElement(By.id("u_0_b")).click();
		         //System.out.println("Login button clicked successfully");
		Reporter.log("Login button clicked successfully");
		          
		         //System.out.println("login Successfully");
		Reporter.log("login Successfully");
		
  }
}
