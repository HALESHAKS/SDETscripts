package com.crm.comcasr.purchaseordertest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.crm.comcast.Objectrepository.CreateNewProducts;
import Com.crm.comcast.Objectrepository.CreateNewPurchaseOrder;
import Com.crm.comcast.Objectrepository.CreateNewVendor;
import Com.crm.comcast.Objectrepository.Home;
import Com.crm.comcast.Objectrepository.Products;
import Com.crm.comcast.Objectrepository.PurcHaseOrder;
import Com.crm.comcast.Objectrepository.Vendor;
import Comvrtigercrmgenericutilities.BaseClass;

public class TestcaseID_17 extends BaseClass
{
@Test
public void createPurchase() throws Throwable

{
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


}}
