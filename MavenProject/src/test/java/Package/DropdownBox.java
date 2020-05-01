package Package;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
public class DropdownBox {
  @Test
  public void f() throws InterruptedException 
  {
	  
	  
	//chrome
			System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
					
ChromeDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
	
  driver.get("https://www.fb.com"); 
//----DAY-----------------------------------------------------------------------------						  
				  WebElement day = driver.findElement(By.id("day"));
						  Select s1 = new Select(day);
					//select by index
						  s1.selectByIndex(1);
						  Thread.sleep(5000);
						/*   //OR
				  //select by value
						  s1.selectByValue("2");
						  Thread.sleep(5000);
						   //OR
				//select by visible text
						  s1.selectByVisibleText("3");*/
//----MONTH--------------------------------------------------------------------------------
					WebElement week= driver.findElement(By.id("month"));
				 Select s2 = new Select(week);
				 
		/*//select by index
				 s2.selectByIndex(0);
				 Thread.sleep(5000);
				 */
				 
	   //select by value
				 s2.selectByValue("5");
				 Thread.sleep(5000);
				 
/*	   //select by visible text
				 s2.selectByVisibleText("Mar");
				 Thread.sleep(5000);*/
//----YEAR---------------------------------------------------------------------------------
			     WebElement year= driver.findElement(By.id("year"));
						 Select s3 = new Select(year);
						 
				/*//select by index
						 s3.selectByIndex(0);
						 Thread.sleep(5000);
						 
						 
			   //select by value
						 s3.selectByValue("2020");
						 Thread.sleep(5000);
						 */
			   //select by visible text
						 s3.selectByVisibleText("1914");
						 Thread.sleep(5000);	
						 //driver.close();
				
//-------------------------------------------------------------------------------------------						  
						  /*WebElement element = driver.findElement(By.id("day"));
                          Select abc= new Select(element);
                          List<WebElement> 
                       */
                         
			    
  //------------------------
						 
						 driver.findElement(By.id("day")).sendKeys("10");
  }
}