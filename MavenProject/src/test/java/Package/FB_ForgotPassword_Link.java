package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class FB_ForgotPassword_Link 
	{

		public static void main(String[] args) throws InterruptedException 
		{
			
		//chrome
	System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
				
			driver.get("https://www.fb.com");
			  Thread.sleep(5000);
			
		
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		  Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("sree_6544@yahoo.co.in");
		driver.findElement(By.id("u_0_2")).click();
		
		
		
		
		}}