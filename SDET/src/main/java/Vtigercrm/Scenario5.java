package Vtigercrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scenario5 {

	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[.='Contacts']")).click();
	 List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr[*]/td[4]/input[@name='selected_id']"));
String expectedresult = "Arun";
int count=0;
for(WebElement we:list)	
{
	String actual=we.getText();
	if(expectedresult.equals(actual))
	
	{
		System.out.println("yes");
	count++;
}
	else
	{
System.out.println("no");

	}
}}
}