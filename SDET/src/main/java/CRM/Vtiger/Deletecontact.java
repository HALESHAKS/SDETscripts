package CRM.Vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Deletecontact {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//a[.='Contacts']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
Thread.sleep(2000);
String text="Halesh";
WebElement ele = driver.findElement(By.xpath("//table/tbody/tr[*]/td/a[text()=' "+text+"']/following-sibling::td/a[text()='del']"));
	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//img[contains[@src,'status.gif')]"))));
	ele.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	}

}
