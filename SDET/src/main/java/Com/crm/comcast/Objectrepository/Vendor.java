package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendor {
	public Vendor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Vendor...']")
	private WebElement CreateNewVendor;

	public WebElement getCreateNewVendor() {
		return CreateNewVendor;
	}
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement VendorsNameTB;

	public WebElement getVendorsNameTB(String vendor) {
		return VendorsNameTB;
	}
	
	
	
}
