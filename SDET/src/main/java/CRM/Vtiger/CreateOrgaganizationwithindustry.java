package CRM.Vtiger;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class CreateOrgaganizationwithindustry {

	public static void main(String[] args) throws InterruptedException {
		//step1:login to CRM
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		Random random = new Random();
		int ran=random.nextInt(1000);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Step2:navigate to organization
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Organizations']")).click();;

		//step3:create organization with industry
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("sdfy"+ran);
		WebElement element = driver.findElement(By.xpath("(//select[@class='small'])[2]"));
		element.click();
		Select s = new Select(element);
		s.selectByValue("Education");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		//step4:verify the organization.
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Organizations']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		List<WebElement> eles = driver.findElements(By.xpath("//table/tbody/tr[*]/td[3]/a[@title='Organizations']"));
		String exprs = "TCS";
		for(WebElement we:eles)
		{
			String text = we.getText();
			if(text.equals(exprs))
			{
				System.out.println("text is present");
			}
			else
			{
				System.out.println("text is not present");
			}


		}
		//step5:logout

		WebElement ele2 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		Actions a = new Actions(driver);
		a.moveToElement(ele2).perform();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement ele3 = driver.findElement(By.xpath("//a[.='Sign Out']"));
		ele3.click();	
	}

}
