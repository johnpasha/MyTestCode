package com.TestPrograms.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUsingMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		WebElement we = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
		
		//to scroll top and to element again
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.id("site-name"))).perform();
		Thread.sleep(2000);
		action.moveToElement(we).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.id("site-name"))).perform();
		Thread.sleep(2000);
//		action.moveToElement(we).build().perform();
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",we);
		
	}

}
