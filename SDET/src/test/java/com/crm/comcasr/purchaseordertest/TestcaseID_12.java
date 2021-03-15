package com.crm.comcasr.purchaseordertest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;

import Com.crm.comcast.Objectrepository.CreateNewProducts;
import Com.crm.comcast.Objectrepository.CreateNewPurchaseOrder;
import Com.crm.comcast.Objectrepository.CreateNewVendor;
import Com.crm.comcast.Objectrepository.Home;
import Com.crm.comcast.Objectrepository.Products;
import Com.crm.comcast.Objectrepository.PurcHaseOrder;
import Com.crm.comcast.Objectrepository.SearchBasicMode;
import Com.crm.comcast.Objectrepository.Vendor;
import Comvrtigercrmgenericutilities.BaseClass;
import Comvrtigercrmgenericutilities.WebDriverUtility;

public class TestcaseID_12 extends BaseClass
{
	@Test
	public void createPurchase() throws Throwable
	{
		/*step1:create vendors*/
		/*  navigate to vendors
		 *  create vendor and save
		 *  Validate whether vendor is created
		 *  locate the web
		 *  expected condition
		 *  actual condition
		 *  */
		/*step2:create products
		 *   navigate to products
		 *  create products and save
		 *  Validate whether product is created*/
		/*step3:
		 * create purchase order
		 * navigate to po
		 * click on create po
		 * create po and save
		 * validate whethere po is created*/
		
		
		/*step1:create vendors*/
		/*navigate to vendor*/
		Home hm=new Home(driver);
		//creating vendor
		hm.clickOntoVendor(driver);
		Vendor vn=new Vendor(driver);
		vn.getCreateNewVendor().click();
		CreateNewVendor cv=new CreateNewVendor(driver);
		String vendorName=elib.readDatafromExcel("Sheet1", 1, 2)+jLib.generateRandomNum();
		cv.createNewVendor(vendorName);
		String actual = driver.findElement(By.xpath("//span[contains(text(),'"+vendorName+"')]")).getText();
		String expected=vendorName;
		boolean flag=actual.contains(expected);
		assertTrue(flag);
	//*step2:create products
		hm.clickonProducts(driver);
Products p=new Products(driver);
p.getClickonCreateProductimg().click();
		
CreateNewProducts cp=new CreateNewProducts(driver);
String ProductName=elib.readDatafromExcel("Sheet1", 4, 2)+jLib.generateRandomNum();
cp.createnewproduct(ProductName);
String actual1 = driver.findElement(By.xpath("//span[contains(text(),'"+ProductName+"')]")).getText();
String expected1=ProductName;
boolean flag1=actual1.contains(expected1);
assertTrue(flag1);
hm.getNavigateOnMore().click();
hm.clickonPurchaseOrder();
PurcHaseOrder Ph=new PurcHaseOrder(driver);
Ph.getClickOnCreateNewPurchase().click();

//Create new Purchase order
CreateNewPurchaseOrder CP=new CreateNewPurchaseOrder(driver);
String Subject = elib.readDatafromExcel("Sheet1",7,2)+jLib.generateRandomNum();
CP.getSubjectTB(Subject);


//PurcHaseOrder PO=new PurcHaseOrder(driver);
//PO.getClickOnCreateNewPurchase().click();



//CreateNewPurchaseOrder Cp=new CreateNewPurchaseOrder(driver);
//Cp.getSubjectTB(Subject);
//Vendor V=new Vendor(driver);
//String vendorName1=elib.readDatafromExcel("Sheet1", 1, 2)+jLib.generateRandomNum();
//V.getVendorsNameTB(vendorName1);

//Cp.getCreateNewVendor(vendor);
//String cid=driver.getWindowHandle();
//driver.switchTo().window(cid);
//Vendor V=new Vendor(driver);
//V.getVendorsNameTB(vendor)

//String cid=driver.getWindowHandle();
//driver.switchTo().window(cid);
//Vendor V=new Vendor(driver);
//String vendor=elib.readDatafromExcel("Sheet1", 1, 2)+jLib.generateRandomNum();

//V.getVendorsNameTB(vendor);
	//	cp.getProductNameTB(ProductName);

		
		
//		 //String purchaseorder=elib.readDatafromExcel("Sheet1", 1, 2)+jLib.generateRandomNum();
//		String ProductName=elib.readDatafromExcel("Sheet1", 4, 2)+jLib.generateRandomNum();
//		String BillingTxt = elib.readDatafromExcel("Sheet1", 10,2)+jLib.generateRandomNum();
//		String shippingTxt = elib.readDatafromExcel("Sheet1",13,2 )+jLib.generateRandomNum();
//		
//		
//		
//		vn.getVendorNameTB().sendKeys("sham");
//		vn.getSaveBTN().click();
//		//create products
//				Products p1=new Products(driver);
//				p1.getClickOnCreateNewProduct().click();
//				p1.getClickOnCreateNewProduct().sendKeys("xxx");
//			p1.getClickonSaveBtn();	
//			
//			
//		//click on purchase order
//		
//		PurcHaseOrder pd=new PurcHaseOrder(driver);
//		pd.getClickOnCreateNewPurchase().click();
//		pd.getSubjectTB().sendKeys("hi");
//		pd.getBillingTxt().sendKeys("BillingTxt");
//		pd.getShippingTxt().sendKeys("shippingTxt");
//		pd.getItemnameimg().click();
//		pd.getClickonSaveBtn();
//		//SearchProductBasicMode
//		SearchBasicMode sp=new SearchBasicMode(driver);
//		sp.getSearchproductTB().sendKeys("a");
//		sp.getClickonSearchNow();
//		sp.getClickoncheckboxBtn();
//		sp.getClickonSearchProductsBtn();
//	
	}

	//private CreateNewProducts CreateNewProducts(WebDriver driver) {
		// TODO Auto-generated method stub
		//return null;
	}
	
//}