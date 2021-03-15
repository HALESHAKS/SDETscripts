package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProducts {

	public CreateNewProducts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement ProductNameTB;

	public WebElement getProductNameTB() {
		return ProductNameTB;
	}
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement SaveBTN;

	public WebElement getClickonSaveBTN(String productName) {
		return SaveBTN;
	}

	public void createnewproduct(String ProductName)
	{
	
		ProductNameTB.sendKeys(ProductName);
		SaveBTN.click();
		}

	
}
