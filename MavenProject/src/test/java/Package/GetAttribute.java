package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class GetAttribute 
	{

		public static void main(String[] args) 
		{
			
		//chrome
	System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
				
			driver.get("https://www.fb.com");
			//driver.findElement(By.id("u_0_m")).sendKeys("kumar123");
			WebElement w1 = driver.findElement(By.id("u_0_m"));
			w1.sendKeys("kumar123");
			System.out.println("display attribute: " +w1.getAttribute("aria-label"));
			
			
			
		
			
			
			
			
			
			}}