package com.crm.comcasr.purchaseordertest;

import org.testng.annotations.Test;

import Com.crm.comcast.Objectrepository.CreateNewPurchaseOrder;
import Com.crm.comcast.Objectrepository.Home;
import Com.crm.comcast.Objectrepository.PurcHaseOrder;
import Comvrtigercrmgenericutilities.BaseClass;

public class TestcaseID_16 extends BaseClass{
	@Test
	public void createPurchase() throws Throwable
	{
		Home hm=new Home(driver);
		hm.getNavigateOnMore().click();
		hm.clickonPurchaseOrder();
		PurcHaseOrder Ph=new PurcHaseOrder(driver);
		Ph.getClickOnCreateNewPurchase().click();
		//Create new Purchase order
		CreateNewPurchaseOrder CP=new CreateNewPurchaseOrder(driver);
		String Subject = elib.readDatafromExcel("Sheet1",7,2)+jLib.generateRandomNum();
		CP.getSubjectTB(Subject);


		
		
}}
