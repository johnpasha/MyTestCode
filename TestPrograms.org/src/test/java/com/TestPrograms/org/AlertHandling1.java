package com.TestPrograms.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling1 {
	
	//Bootstrap Modal Example for Automation
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait  wait = new WebDriverWait(driver,20);
		By by = By.xpath("//div/div[@class='panel-body']/div[@id='myModal0']/preceding-sibling::a");
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		button.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(driver.switchTo().alert().getText());
		
//		("//div[@class='modal-header']/h4[text()='Modal Title']/../following-sibling::div[3]/a[@class='btn btn-primary']")
		WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-header']/h4[text()='Modal Title']/../following-sibling::div[3]/a[@class='btn btn-primary']")));
		save.click();
		
		
	}

}
