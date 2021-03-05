package CRM.Vtiger;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Comvrtigercrmgenericutilities.FileUtility;
import Comvrtigercrmgenericutilities.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CreateOrganizationtest {
static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		FileUtility futil = new FileUtility();
		JavaUtility jutil = new JavaUtility();
		String browsername = futil.getPropertykeyvalues("browser");
		String username = futil.getPropertykeyvalues("username");
		String url = futil.getPropertykeyvalues("url");	
		String password = futil.getPropertykeyvalues("password");
		String orgName = "IBM"+jutil.generateRandomNum();
		String contactname = "Halesh"+jutil.generateRandomNum();
		
		//launch browser
	if(browsername.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver ();
	}
	else {
		System.out.println("provide valid browser name!!");
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//navigate to vtiger
	driver.get("http://localhost:8888/index.php");
	//login
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	

//click on org
driver.findElement(By.linkText("Organizations")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	//create on org
	driver.findElement(By.name("accountname")).sendKeys(orgName);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
	 String orginfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	 Assert.assertTrue(orginfo.contains(orgName));
	 //assert
	 //click on contact
	 driver.findElement(By.linkText("Contacts")).click();
	 driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	driver.findElement(By.name("lastname")).sendKeys(contactname);
	 
	 //create contact by selecting org
	driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	 
	 //capture the sessionid
	 Set<String> windowIDs = driver.getWindowHandles();
	 Iterator<String> itr = windowIDs.iterator();
	 String pid = itr.next();
	 String cid = itr.next();
	 //switch to child window
	 driver.switchTo().window(cid);
	
	 // search for org
	 driver.findElement(By.name("search_text")).sendKeys(orgName);
	 driver.findElement(By.name("search_field")).click();
	 
	 driver.findElement(By.linkText(orgName)).click();
	 //switch back to parent window
	 driver.switchTo().window(pid);
	// save contact
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}}	 
	 
	 
	 
	
	
	


