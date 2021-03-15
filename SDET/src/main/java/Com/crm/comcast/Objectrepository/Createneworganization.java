package Com.crm.comcast.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Comvrtigercrmgenericutilities.WebDriverUtility;

public class Createneworganization extends WebDriverUtility{
		WebDriver driver;
		public  Createneworganization(WebDriver driver) { 
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(name = "accountname")
		private WebElement orgNameEdt;
		
		@FindBy(name = "industry")
		private WebElement industriesLst;
		
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement saveBtn;
		
		@FindBy(name = "accounttype")
		private WebElement typeLst;
		
		@FindBy(name = "rating")
		private WebElement ratinglst;

		public WebElement getOrgNameEdt() {
			return orgNameEdt;
		}

		public WebElement getIndustriesLst() {
			return industriesLst;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
		
		
		
		public void selectDropDown(WebElement element,int index) {
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		
		public void selectDropDown(WebElement element, String value) {
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		
		public void selectDropDown(String visibleText,WebElement element) {
			Select sel=new Select(element);
			sel.selectByVisibleText(visibleText);;
		}
		public void creatOrganization(String orgName) {
			orgNameEdt.sendKeys(orgName);
			saveBtn.click();
		}
		
	}
