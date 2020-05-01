package Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Absolute_xpath
{
  @Test
  public void f()
  {
	  
	//chrome
		System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
				
				ChromeDriver driver = new ChromeDriver();
				  driver.manage().window().maximize();
					
				  driver.get("https://www.fb.com"); 
				  ///html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr/[2]/td/input
				  
				  
	  
	  
	  
	  
  }
} 