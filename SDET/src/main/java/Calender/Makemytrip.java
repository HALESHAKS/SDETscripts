package Calender;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip {
	public static void main(String[] args) {
		Date d = new Date();
		String currentDate = d.toString();
		String[] arr = currentDate.split(" ");
		String date = arr[2];
		String year = arr[5];
		String month = arr[1];
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.makemytrip.com");
Actions act = new Actions(driver);
act.moveByOffset(20, 30).click().perform();
driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
driver.findElement(By.xpath("//input[@data-cy='fromCity']")).sendKeys("DEL");
WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[.='Delhi, India']"))).click();
driver.findElement(By.xpath("//input[@data-cy='toCity']")).sendKeys("BOM");
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[.='Mumbai, India']"))).click();
	driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	driver.findElement(By.xpath("//div[@aria-label='Wed Mar 03 2021']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//p[@data-cy='returnDate']")).click();
driver.findElement(By.xpath("//div[@aria-label='Fri Apr 02 2021']")).click();
}
}