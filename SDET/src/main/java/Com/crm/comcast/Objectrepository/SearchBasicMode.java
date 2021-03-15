package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBasicMode {

	public SearchBasicMode(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchproductTB;
	public WebElement getSearchproductTB() {
		return searchproductTB;
	}
@FindBy(xpath="//input[@name='search']")	
private WebElement clickonSearchNow;
public WebElement getClickonSearchNow() {
	return clickonSearchNow;
}
@FindBy(xpath="//input[@name='select_all']")
private WebElement clickoncheckboxBtn;
public WebElement getClickoncheckboxBtn() {
	return clickoncheckboxBtn;
}
@FindBy(xpath="//input[@value='Select Products']")
private WebElement clickonSearchProductsBtn;
public WebElement getClickonSearchProductsBtn() {
	return clickonSearchProductsBtn;
}
}
