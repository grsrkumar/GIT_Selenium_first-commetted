/*package Package;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class ScreenShot {
 // private static final String Takescreenshot = null;

@Test
  public void f()
  //{
	  
		
		//chrome
	//System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
	//		
//			ChromeDriver driver = new ChromeDriver();
//			  driver.manage().window().maximize();
				
//			driver.get("https://www.fb.com");
			
//FB Login page:UserName_Column, Password and Submit Buttion		
//			driver.findElement(By.id("email")).sendKeys("sree_6544@yahoo.co.in");
//			driver.findElement(By.id("pass")).sendKeys("9705223221@Kumar");
//			driver.findElement(By.id("u_0_b")).click(); 
			
			
			TakesScreenshot t = (Takescreenshot).driver;
			File srcfile= t.getScreenshotAs(OutputType<X>.FILE);
			FileUtils.copyFile(srcfile, new File("G:/Selenium softwares/FBscreenshot.jpg"))
			System.out.println("ok");
			
  }
//}
*/