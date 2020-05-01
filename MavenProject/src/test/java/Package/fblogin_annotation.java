/*package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fblogin_annotation
{
  @Test
  public void f() 
  
   {
	  
	@Test	
	//System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
				
			driver.get("https://www.fb.com");
			//FB Login page:UserName_Column, Password and Submit Buttion		
			driver.findElement(By.id("email")).sendKeys("sree_6544@yahoo.co.in");
			driver.findElement(By.id("pass")).sendKeys("9705223221@Kumar");
			driver.findElement(By.id("u_0_b")).click();
			
  }
}
*/