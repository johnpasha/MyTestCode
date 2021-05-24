package com.test.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.get("https://www.qa.way2automation.com");
		driver.navigate().to("https://www.qa.way2automation.com");
//		driver.navigate
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("TestName");
		
		Select s = new Select(driver.findElement(By.tagName("select")));
		s.selectByValue("Afghanistan");
		
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input")).submit();
		
		Actions a = new Actions(driver);
//		a.move
//		driver.manage().window().
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(".//abc/test.jpg"));
//		driver.switchTo().wind
	}

}
