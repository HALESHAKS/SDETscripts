package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPurchaseOrder {

	public CreateNewPurchaseOrder(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='subject']")
	private WebElement SubjectTB;
	public WebElement getSubjectTB(String subject) {
		return SubjectTB;

	}
	@FindBy(xpath="//img[@title='Create Vendor...']")
	private WebElement CreateNewVendor;

	public WebElement getCreateNewVendor(String vendor) {
		return CreateNewVendor;
	}
		
		@FindBy(xpath="//textarea[@name='bill_street']")
private WebElement Billing_AddressTB;
		public WebElement getBilling_AddressTB() {
			return Billing_AddressTB;
		}
		@FindBy(xpath="//textarea[@name='ship_street']")
		private WebElement Shipping_AddressTB;
		public WebElement getShipping_AddressTB() {
			return Shipping_AddressTB;
		}
				
		@FindBy(xpath="//img[@id='searchIcon1']")
		private WebElement ItemSeacrhicon;
		public WebElement getItemSeacrhicon() {
			return ItemSeacrhicon;
		}
		
		public void clickonSearchitem()
		{
			ItemSeacrhicon.click();
		}
		

	}


