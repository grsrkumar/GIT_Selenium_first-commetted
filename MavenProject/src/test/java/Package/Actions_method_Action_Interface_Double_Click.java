package Package;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class Actions_method_Action_Interface_Double_Click {
  @Test
  public void f()
  {
	  
	//chrome
		System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
				
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
driver.manage().deleteAllCookies();

driver.get("https://www.facebook.com/"); 
//Actions act= new Actions(driver);


driver.findElement(By.id("u_0_q")).sendKeys("Kumar");


//act.perform();





  }
}
