package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clicknextmonth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("FromTag")).sendKeys("BOM");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']"))).click();
		
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='New Delhi, IN - Indira Gandhi Airport (DEL)']"))).click();
		//driver.findElement(By.xpath("//td[@data-month='2' and data-year='2021']/a[text()='2']")).click();
//select a future date
		int count=0;
		while(count<24)
		{
			try
			{
			driver.findElement(By.xpath("//td[@data-month='11' and data-year='2021']/a[text()='2']")).click();
	
	}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
				count++;
			}
}
	}

}
