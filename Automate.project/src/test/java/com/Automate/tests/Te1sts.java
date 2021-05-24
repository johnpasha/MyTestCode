package com.Automate.tests;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Automate.base.Base;

public class Te1sts extends Base{

	@Test
	public void BankManagerLogin() {
//		driver.get(config.getProperty("url"));
		
		click(OR.getProperty("BankMngLogin_btn"));
		
		click(OR.getProperty("AddCust_btn"));
		
		sendKeys(OR.getProperty("FirstName_in"), "FirstName");
	}
	
//	@Test(dataProviderClass=Base.class,dataProvider="data")
	@Parameters({"fName","lName","pCode"})
	@Test
	public void addCustomerTest(String fName, String lName, String pCode) throws InterruptedException {
		
		click(OR.getProperty("BankMngLogin_btn"));
		
		click(OR.getProperty("AddCust_btn"));
		
		sendKeys(OR.getProperty("fName_in"), "fName");
		sendKeys(OR.getProperty("lName_in"), "lName");
		sendKeys(OR.getProperty("pCode_in"), "pCode");
		Thread.sleep(2000);
		click(OR.getProperty("AddCust_Submit"));
		
		Assert.assertTrue(wait.until(ExpectedConditions.alertIsPresent()).getText().contains("Customer added successfully with customer id :"));
	}
	
}
