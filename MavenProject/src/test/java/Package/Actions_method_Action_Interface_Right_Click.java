package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_method_Action_Interface_Right_Click {
  @Test
  public void f() 
  {
	//chrome
		System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
				
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
driver.manage().deleteAllCookies();

driver.get("https://www.guru99.com/"); 
Actions act= new Actions(driver);
WebElement testing=driver.findElement(By.xpath("//span[text()='Testing']"));
WebElement etl_testing = driver.findElement(By.xpath("//span[text()='ETL Testing']"));
Action int1= act.moveToElement(testing).moveToElement(etl_testing).contextClick().build();
int1.perform();

  }
}
