package Package;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
	

	public class FB_Login 
	{

		public static void main(String[] args) 
		{
			
		//chrome
	System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
				
			driver.get("https://www.fb.com");
			//FB Login page:UserName_Column, Password and Submit Buttion		
			driver.findElement(By.id("email")).sendKeys("sree_6544@yahoo.co.in");
			driver.findElement(By.id("pass")).sendKeys("9705223221@Kumar");
			driver.findElement(By.id("u_0_b")).click();
			//--------------------------------------------------------------------------------------------------------------
			
			//driver.findElement(By.name("email")).sendKeys("sree_6544@yahoo.co.in");
			//driver.findElement(By.name("pass")).sendKeys("9705223221@Kumar");
			//driver.findElement(By.id("u_0_b")).click();

			
		//fb_login	
			/*driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sree_6544@yahoo.co.in");
			driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("9705223221@Kumar");
			driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).click();*/
			//---------------------------------------------------------------------------------------------------		
			
			
			
			
			
			
			
			
			
			
			//driver.close();
			 
			  
			  //driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[1]/a")).click();
			  
			  
			  //driver.findElement(By.id("email")).sendKeys("sree_6544@yahoo.co.in");
			  
			  //driver.findElement(By.xpath("//*[@id=\"js_14\"]/div/div/ul/li[17]/a/span/span]")).click();
			  
			
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		}
	}