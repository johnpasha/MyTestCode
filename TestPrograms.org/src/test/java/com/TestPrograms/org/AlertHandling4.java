package com.TestPrograms.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][@onclick='myPromptFunction()']")).click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.sendKeys("Sample text message");
		alert.accept();
		
		System.out.println(driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][@onclick='myPromptFunction()']/following-sibling::p")).getText());
//		wait.until(ExpectedConditions.stalenessOf(element))
	}

}
