package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_method_Action_Interface_Mouse_Hower {
  @Test
  public void f() throws Exception
  {
	  
	  
		//chrome
				System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
						
	ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
	  driver.manage().deleteAllCookies();
		
	  driver.get("https://www.guru99.com/"); 
	  Actions act= new Actions(driver);
	  
//Idividual Actions
	  /*  
	   WebElement testing=driver.findElement(By.xpath("//span[text()='Testing']"));
	  act.moveToElement(testing).perform();
	  Thread.sleep(1000);
	         //Here "perform"
	          
	  WebElement etl= driver.findElement(By.xpath("//span[text()='ETL Testing']"));
	  act.moveToElement(etl).perform();	  
	  Thread.sleep(1000);
	  
	  WebElement R_programming= driver.findElement(By.xpath("//span[text()='R Programming']"));
	  act.moveToElement(R_programming).perform();
	  */
	  
	  
	  
//Combine Actions
	  
		/*  
		  WebElement testing=driver.findElement(By.xpath("//span[text()='Testing']"));
		  WebElement etl_testing = driver.findElement(By.xpath("//span[text()='ETL Testing']"));
		  WebElement R_programming= driver.findElement(By.xpath("//span[text()='R Programming']"));
		  act.moveToElement(testing).moveToElement(etl_testing).moveToElement(R_programming).build().perform();
		  // here "build" combined all actions
          */		  
	

//Using Action Interface
	  
	  WebElement testing=driver.findElement(By.xpath("//span[text()='Testing']"));
	  WebElement etl_testing = driver.findElement(By.xpath("//span[text()='ETL Testing']"));
	  WebElement R_programming= driver.findElement(By.xpath("//span[text()='R Programming']")); 
	  Action int1= act.moveToElement(testing).moveToElement(etl_testing).moveToElement(R_programming).click().build();
			 // 
	  
	  //Action int1= act.moveToElement(testing).moveToElement(etl_testing).moveToElement(R_programming).build();
	     //Here "Action" is Interface
	  int1.perform();
	  R_programming.click(); 	
	  
	  
	  Thread.sleep(50000);
	  //driver.close();
  }
}
