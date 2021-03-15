package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contatcs {
	public Contatcs(WebDriver driver) {             
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createOrgImg;

	public WebElement getCreateOrgImg() {
		return createOrgImg;
	}
	

}
