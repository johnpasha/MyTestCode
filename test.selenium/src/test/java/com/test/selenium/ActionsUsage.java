package com.test.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsUsage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		Actions action = new Actions(driver);
//		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
//		driver.switchTo().defaultContent();
//		action.moveToElement();
//		action.click(driver.findElement(By.name("q")));
//		action.sendKeys("abcd").build().perform();
		//**************************java script executor
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementsByName('q').value='abcd'");
//		js.executeScript("arguments[0].click();", driver.findElement(By.name("q")));
//		driver.findElement(By.name("q")).se
		
//		driver.findElement(By.xpath("//button[@class = 'btn btn-default']")).click();
//		
//		Alert a = driver.switchTo().alert();
//		a.
//		Thread.sleep(5000);
//		a.dismiss();
//		a.sendKeys("dsdgfgdg");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('user-message').value='sdsafds'");
//		js.executeScript("showInput()");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./test.jpg"));
		
		Select select  = new Select(driver.findElement(By.id("")));
//		Assert.asserttr
		
	}


}
