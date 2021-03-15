package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactinfopage {
	public Contactinfopage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}
	
	

}
