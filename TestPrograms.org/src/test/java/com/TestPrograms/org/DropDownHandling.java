package com.TestPrograms.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id = 'select-demo']")));
		
		Select select = new Select(we);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("Monday");
		Thread.sleep(2000);
		select.selectByVisibleText("Tuesday");
//		List<WebElement> we = select.getOptions();
//		we.get(1).getAttribute("value")

	}

}
