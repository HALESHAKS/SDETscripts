package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendorssearch {
	public Vendorssearch(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="//input[@name='search_text']")
private WebElement VendorsNameSearchTB;

public WebElement getVendorsNameSearchTB() {
	return VendorsNameSearchTB;
	
}
@FindBy(xpath="//input[@name='search']")
private WebElement SeacrhBTN;

public WebElement getSeacrhBTN() {
	return SeacrhBTN;
}
@FindBy(xpath="//a[.='bigbazar']")
private WebElement VendorNameLK;

public WebElement getVendorNameLK() {
	return VendorNameLK;
}
}

