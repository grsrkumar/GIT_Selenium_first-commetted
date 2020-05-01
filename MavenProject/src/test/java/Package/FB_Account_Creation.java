package Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_Account_Creation {
  @Test
  public void f() 
  {
	  
	//chrome
		System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
				
				ChromeDriver driver = new ChromeDriver();
				  driver.manage().window().maximize();
					
				driver.get("https://www.fb.com");
				//-------------------------
				
  }
}
