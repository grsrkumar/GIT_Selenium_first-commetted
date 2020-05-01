package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpath_text_function {
  @Test
  public void f() 
  {
	  

		//chrome
				System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
						
						ChromeDriver driver = new ChromeDriver();
						  driver.manage().window().maximize();
							
						  driver.get("https://www.fb.com"); 
						  
		//Links:
			
					     // driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
						 //driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
						 //driver.findElement(By.xpath("//a[text()='Messenger']")).click();
						 // driver.findElement(By.xpath("//a[text()='Instagram']")).click();
  }
}
