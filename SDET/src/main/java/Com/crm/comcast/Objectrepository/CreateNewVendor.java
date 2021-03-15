package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewVendor {
public CreateNewVendor(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


@FindBy(name="vendorname")
private WebElement vendorNameTB;

public WebElement getVendorNameTB() {
	return vendorNameTB;
}
@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
private WebElement saveBTN;

public WebElement getSaveBTN() {
	return saveBTN;
}

public void createNewVendor(String vendorName)
{
	vendorNameTB.sendKeys(vendorName);
	saveBTN.click();
}


}
