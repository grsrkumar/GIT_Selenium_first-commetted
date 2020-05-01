package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Startwith_Endswith_Any 
{
  @Test
  public void f() 
  {
	  
	  
		//chrome
	System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
				
			driver.get("https://www.fb.com");
			//startwith
				//driver.findElement(By.cssSelector("input[id^='emai']")).sendKeys("kumar");
				
			
			
			//Endswith
			      //driver.findElement(By.cssSelector("input[id$='mail']")).sendKeys("gullapudi");
			    
			
			//Any
			driver.findElement(By.cssSelector("input[id*='ai']")).sendKeys("Gullapudi");  
			
  }
}

