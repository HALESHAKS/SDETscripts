package Vtigercrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://localhost:8888/index.php");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@type='submit']")).click();
//driver.findElement(By.xpath("//a[.='Contacts']")).click();

//to create contact
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("arun");
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vinay");
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vinutha");
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

driver.findElement(By.xpath("//a[.='Contacts']")).click();
}
}









