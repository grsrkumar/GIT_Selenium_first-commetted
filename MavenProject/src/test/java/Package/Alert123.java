
package Package;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Alert123
{
WebDriver d;
@Test
public void testBrowserHistory() throws Exception
{

d.get("https://www.abhibus.com/");
d.manage().window().maximize();
d.findElement(By.xpath("//a[text()='Offers']")).click();

d.findElement(By.xpath("//input[@id='source']")).sendKeys("Hyderabad");
Alert alert=d.switchTo().alert();
alert.accept();
//alert.dismiss();
 Thread.sleep(30000);
}
@BeforeMethod
public void setUp()
{
// Launch browser
System.setProperty("webdriver.chrome.driver",  "G:\\\\Selenium softwares\\\\Browser Drivers\\\\chromedriver.exe");
d=new ChromeDriver();
d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
d.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
d.manage().deleteAllCookies();
}
@AfterMethod
public void tearDown()
{
// Close browser
//d.close();
}
}