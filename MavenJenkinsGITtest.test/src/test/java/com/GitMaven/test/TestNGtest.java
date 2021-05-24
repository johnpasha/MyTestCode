package com.GitMaven.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGtest extends BaseClass {

	WebDriver driver= BaseClass.driver;

//	@BeforeTest
//	public void intiBrowser() {
//		BaseClass b = new BaseClass();
//		driver = b.driver;
//	}

	@Test
	public void Navigate() throws InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/");
		Assert.assertEquals(driver.getTitle(),"Selenium Easy - Best Demo website to practice Selenium Webdriver Online");
		Thread.sleep(5000);
		driver.quit();
	}

}
