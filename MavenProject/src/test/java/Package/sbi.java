package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sbi 
{
  @Test
  public void f() 
  {
	  
		//chrome
				System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
						
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
		
	  driver.get("https://www.onlinesbi.com/"); 
	  Actions act= new Actions(driver);
	  WebElement SBI = driver.findElement(By.xpath("//a[@id='sm-1587192886695586-3']"));
	  WebElement SBI1=driver.findElement(By.xpath("//a[text()='SBA Saral']"));
	 Action ac1=act.moveToElement(SBI).moveToElement(SBI1).build();
	 ac1.perform();
	  
  }
}
