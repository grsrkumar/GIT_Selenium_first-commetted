package Package;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Rajesh_Sample
{
WebDriver d;

@Test
public void testBrowserHistory() throws Exception
{
//Launch the browser
d.get("https://www.facebook.com/");
//maximize the browser window
d.manage().window().maximize();
//creating Actions class
Actions act=new Actions(d);
//identifying the web elements
WebElement userid=d.findElement(By.xpath("//input[@id='email']"));
WebElement password=d.findElement(By.xpath("//input[@id='pass']"));
Action all=act.sendKeys(userid, "seleniumlearning40@gmail.com").sendKeys(Keys.TAB).sendKeys(password, "Test@123").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build();
all.perform();
Thread.sleep(30000);
}


@BeforeMethod
public void setUp()
{
// Launch browser
System.setProperty("webdriver.chrome.driver",  "D:\\Selenium_Training\\SW\\chromedriver.exe");
d=new ChromeDriver();
d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
d.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
d.manage().deleteAllCookies();
}


@AfterMethod
public void tearDown()
{
// Close browser
d.close();
}




}
