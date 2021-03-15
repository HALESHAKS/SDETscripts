package practive;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseid_14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//step1: Login to CRM
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://localhost:8888/index.php");
				driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(2000);
				WebElement ele = driver.findElement(By.xpath("//a[.='More']"));
				Actions a=new Actions(driver);
				a.moveToElement(ele).perform();
				driver.findElement(By.xpath("//a[.='Purchase Order']")).click();
				driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
				driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("HI");
				driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
				WebDriverWait wait = new WebDriverWait(driver,10);
				Set<String> wh = driver.getWindowHandles();
				Iterator<String> itr = wh.iterator();
				String pid = itr.next();
				String cid = itr.next();
				driver.switchTo().window(cid);
				driver.findElement(By.xpath("//a[.='bigbazar']")).click();
				driver.switchTo().window(pid);
			driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("#52,RAJAJINAGAR_560010");
			driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("#52,RAJAJINAGAR_560010");
				//Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
   Thread.sleep(2000);

	}

}
