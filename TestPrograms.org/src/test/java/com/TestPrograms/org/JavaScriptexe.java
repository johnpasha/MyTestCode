package com.TestPrograms.org;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptexe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sum1']")));
		Wait waiter = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class,NoSuchElementException.class);
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("33");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("67");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementsByClassName(\"btn btn-default\")[1].click()");
		js.executeScript("return total();");// this works same as above
	}

}
