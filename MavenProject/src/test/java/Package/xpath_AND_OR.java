package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpath_AND_OR {
  @Test
  public void f() 
  {
	  
	  
		//chrome
				System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
						
						ChromeDriver driver = new ChromeDriver();
						  driver.manage().window().maximize();
							
						  driver.get("https://www.fb.com"); 
						  
	//AND-------FIRST CONDITION TRUE AND SECOND CONDITION TRUE				
			
		    //driver.findElement(By.xpath("//input[@id='email' and @type='email']")).sendKeys("sree_6544@yahoo.co.in");
			//driver.findElement(By.xpath("//input[@id='pass' and  @type='password']")).sendKeys("9705223221@Kumar");
			//driver.findElement(By.xpath("//input[@id='u_0_b' and @value='Log In']")).click();
						  
   
	//AND-------FIRST CONDITION TRUE AND SECOND CONDITION FALSE
						  
							//driver.findElement(By.xpath("//input[@id='email' and @type='eail']")).sendKeys("sree_6544@yahoo.co.in");
							//driver.findElement(By.xpath("//input[@id='pass' and  @type='pasword']")).sendKeys("9705223221@Kumar");
							//driver.findElement(By.xpath("//input[@id='u_0_b' and @value='Lo In']")).click();
			
	//OR-------FIRST CONDITION TRUE OR SECOND CONDITION TRUE
						  
		   driver.findElement(By.xpath("//input[@id='email' or  @type='eail']")).sendKeys("sree_6544@yahoo.co.in");
		   driver.findElement(By.xpath("//input[@id='pass' or @type='pssword']")).sendKeys("9705223221@Kumar");
		   driver.findElement(By.xpath("//input[@id='u_0_b' or value='Lo In']")).click();


  }
}
