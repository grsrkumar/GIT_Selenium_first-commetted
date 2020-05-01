package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Methods 
	{

		public static void main(String[] args) 
		{
			
		//chrome
	System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
				
			driver.get("https://www.fb.com");
			
			driver.getTitle();
			WebElement button= driver.findElement(By.id("u_0_13"));
			button.getText();
			
			
			
			
			driver.close();
		    
		}
	}
	