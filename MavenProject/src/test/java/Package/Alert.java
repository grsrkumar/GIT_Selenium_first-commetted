package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
  @Test
  public void f() throws InterruptedException
  {
	  //chrome
		System.setProperty("webdriver.chrome.driver","G:\\Selenium softwares\\Browser Drivers\\chromedriver.exe");
				
				ChromeDriver d = new ChromeDriver();
				  d.manage().window().maximize();
					
				d.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
				d.findElement(By.xpath("//button[text()='Try it']")).click();
				Thread.sleep(5000);
					
			/*	Alert alert=d.switchTo().alert();
				alert.accept();
				*/
  }
}
