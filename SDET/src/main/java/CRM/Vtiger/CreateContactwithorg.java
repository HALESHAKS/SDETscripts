package CRM.Vtiger;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.http.entity.FileEntity;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Comvrtigercrmgenericutilities.FileUtility;

public class CreateContactwithorg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//a[.='Contacts']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pavan");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
driver.findElement(By.xpath("//a[.='Organizations']")).click();
driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
driver.findElement(By.xpath("//img[@title='Select']")).click();

WebDriverWait wait = new WebDriverWait(driver,10);
Set<String> wh = driver.getWindowHandles();
Iterator<String> itr = wh.iterator();
String pid = itr.next();
String cid = itr.next();
driver.switchTo().window(cid);
driver.findElement(By.xpath("//a[.='TCS']")).click();
Alert a = driver.switchTo().alert();
a.accept();
driver.switchTo().window(pid);

//driver.findElement(By.xpath("//input[@title='Save[Alt+S]']")).click();

}
}