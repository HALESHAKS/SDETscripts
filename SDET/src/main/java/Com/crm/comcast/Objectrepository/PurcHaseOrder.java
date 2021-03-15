package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurcHaseOrder {
	public PurcHaseOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement clickOnCreateNewPurchase;
	public WebElement getClickOnCreateNewPurchase() {
		return clickOnCreateNewPurchase;
	}
	@FindBy(name="subject")
	private WebElement subjectTB;
	public WebElement getSubjectTB(String subject) {
		return subjectTB;}
@FindBy(xpath="//textarea[@name='bill_street']")
private WebElement  BillingTxt;
public WebElement getBillingTxt() {
	return BillingTxt;
}
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingTxt;
	public WebElement getShippingTxt() {
		return shippingTxt;
		
	}
	
	@FindBy(xpath="//img[@src='themes/images/products.gif']")
	private WebElement Itemnameimg;
	public WebElement getItemnameimg() {
		return Itemnameimg;
	}

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement clickonSaveBtn;
	public WebElement getClickonSaveBtn() {
		return clickonSaveBtn;
	}

	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]")
private WebElement VendorNameImg;
	public WebElement getVendorNameImg() {
		return VendorNameImg;
	}
}
	
	
	
