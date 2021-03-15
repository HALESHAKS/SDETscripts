package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Comvrtigercrmgenericutilities.WebDriverUtility;

public class Home {
	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[contains(@src,'user.PNG')]")
	private WebElement adminstrationImg;
	@FindBy(linkText="Sign Out")
	private WebElement signOutLnk;
	@FindBy(linkText = "Organizations")
    private WebElement orgLnk;
	
	@FindBy(linkText = "Leads")
    private WebElement leadsLnk;
	
	@FindBy(linkText = "Products")
    private WebElement productlnk;
	@FindBy(linkText = "Contacts")
	
    private WebElement contactLnk;
	
	public WebElement getProductlnk() {
		return productlnk;
	}

	public WebElement getContactLnk() {
		return contactLnk;
	}

	

	public WebElement getOrgLnk() {
		return orgLnk;
	}

	public WebElement getLeadsLnk() {
		return leadsLnk;
	}
	
	
	@FindBy(linkText="More")
	private WebElement navigateOnMore;
	
	@FindBy(name="Purchase Order")
	private WebElement navigateOnPurchaseOrder;
	 
	@FindBy(name="Vendors")
	private WebElement navigateToVendor;

	public WebElement getNavigateToVendor() {
		return navigateToVendor;
	}

	public WebElement getNavigateOnMore() {
		return navigateOnMore;
	}

	public WebElement getNavigateOnPurchaseOrder() {
		return navigateOnPurchaseOrder;
	
	}
	public void clickonPurchaseOrder()
	{
		navigateOnMore.click();
		navigateOnPurchaseOrder.click();
		
		

	}
	public void More(WebDriverException driver)
	{
		navigateOnMore.click();
	}
	public void clickonProducts(WebDriver driver)
	{
		productlnk.click();
	}
	public void clickOntoVendor(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.moveToElement(navigateOnMore).build().perform();;
		navigateToVendor.click();
		//navigateToVendor.click();
		
	}}
	//public void logout() {
		//WebElement ele = driver.findElement(By.xpath("//a[.='Sign Out']"));
		//Actions a=new Actions(driver);
		//a.moveToElement(adminstrationImg).build().perform();;
		//signOutLnk.click();
	//}


//public void logout() {
//	WebElement ele = driver.findElement(By.xpath("//a[.='Sign Out']"));
//	Actions a=new Actions(driver);
//	a.moveToElement(adminstrationImg);
//	signOutLnk.click();
//}



 