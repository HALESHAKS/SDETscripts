package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Comvrtigercrmgenericutilities.WebDriverUtility;

public class NavigateToPurchaseOrder extends WebDriverUtility {
	public NavigateToPurchaseOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="More")
	private WebElement navigateOnMore;
	
	@FindBy(name="Purchase Order")
	private WebElement navigateOnPurchaseOrder;

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
}
