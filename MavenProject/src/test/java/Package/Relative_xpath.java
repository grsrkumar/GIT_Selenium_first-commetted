package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Relative_xpath {
  @Test
  public void f() {
	  
	  
	  
	//chrome
			System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
					
					ChromeDriver driver = new ChromeDriver();
					  driver.manage().window().maximize();
						
					  driver.get("https://www.fb.com"); 
					  
					  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sree_6544@yahoo.co.in");
					  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9705223221@Kumar");
					  driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
}
}