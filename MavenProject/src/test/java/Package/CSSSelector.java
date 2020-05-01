package Package;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.firefox.FirefoxDriver;

	public class CSSSelector 
	{

		public static void main(String[] args) 
		{
			
		//chrome
	System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
				
			driver.get("https://www.fb.com");
			/*WebElement w= driver.findElement(By.cssSelector("input[id=\"email\"]"));
						w.sendKeys("helo");
		*/
			
	driver.findElement(By.id("email")).sendKeys(("sree_6544@yahoo.co.in"));
	
	driver.findElement(By.id("pass")).sendKeys(("9705223221@Kumar"));

	driver.findElement(By.cssSelector("input[id='u_0_4']")).click();
		
		}}