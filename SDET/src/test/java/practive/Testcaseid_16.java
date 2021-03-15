package practive;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.crm.comcast.Objectrepository.Login;
import Comvrtigercrmgenericutilities.FileUtility;
import Comvrtigercrmgenericutilities.JavaUtility;
import Comvrtigercrmgenericutilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcaseid_16 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//step1: Login to CRM
		FileUtility fUtil=new FileUtility();
		JavaUtility jutil = new JavaUtility();
		WebDriverUtility wUtil=new WebDriverUtility();
		String browser = fUtil.getPropertykeyvalues("browser");
                String username = fUtil.getPropertykeyvalues("username");
                String password = fUtil.getPropertykeyvalues("password")	;	
                		String url = fUtil.getPropertykeyvalues("url");
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
			driver.manage().window().maximize();
			wUtil.waitForElement(driver);
				driver.get(url);
				
				Login lp=new Login(driver);
				lp.loginToAPP();
				
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
				WebElement ele1 = driver.findElement(By.name("postatus"));
				Select s=new Select(ele1);
				s.selectByVisibleText("Approved");
				driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();

	Alert a1=driver.switchTo().alert();
	a1.accept();
	//logout
	WebElement ele2 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

	Actions a2 = new Actions(driver);
	a2.moveToElement(ele2).perform();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement ele3 = driver.findElement(By.xpath("//a[.='Sign Out']"));
	ele3.click();	

				
	}

}

	
