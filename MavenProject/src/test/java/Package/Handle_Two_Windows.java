package Package;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_Two_Windows 
{
	  @Test

	public void testing1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("terms-link")).click();
		
		String mainWindow=driver.getWindowHandle();//Only one Window
		Set<String> allWindow=driver.getWindowHandles();//All The Window
		Iterator<String> it=allWindow.iterator();
		while(it.hasNext())
		{
			String childWindow=(String) it.next();
			if(!mainWindow.equals(childWindow))
			//if(!mainWindow=childWindow)
			{
				driver.switchTo().window(childWindow);
				Thread.sleep(4000);
				WebElement txt=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']"));
				txt.click();
				//driver.close();
			
				String val=txt.getText();
				System.out.println(val);
		}
		
			driver.quit();
	}

}
}
