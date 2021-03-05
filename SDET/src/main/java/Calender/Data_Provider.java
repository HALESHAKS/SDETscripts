package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider="getData")
	public void dataprovider11(String src,String dest) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("FromTag")).sendKeys(src);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),"+src+")]"))).click();
		
		driver.findElement(By.id("ToTag")).sendKeys(dest);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),"+dest+")]"))).click();
	}
		

@DataProvider
public Object[][]getData()
{
	Object[][]objArr=new Object[5][2];
	objArr[0][0]="BLR";
	objArr[0][1]="GOI";
	
	objArr[1][0]="BLR";
	objArr[1][1]="NYC";

	objArr[2][0]="BLR";
	objArr[2][1]="NCL";

	objArr[3][0]="BLR";
	objArr[3][1]="NTL";

	objArr[4][0]="BLR";
	objArr[4][1]="EWR";
return objArr;
}
}