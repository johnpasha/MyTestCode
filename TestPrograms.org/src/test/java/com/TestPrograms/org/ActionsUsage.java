package com.TestPrograms.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsUsage {
	
	private ActionsUsage() {
		
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Actions action = new Actions(driver);
		
//		WebDriverWait firstResult = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		action.moveToElement(driver.findElement(
				By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input[@name='btnK'][@class='gNO89b']")))
		.contextClick().build().perform();
//		action.doubleClick(target);
//		action.moveToElement().contextClick()
//		action.moveToElement(driver.findElement(
//				By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input[@name='btnK'][@class='gNO89b']")));
//		driver.findElement(By.xpath("")).isSelected();
	}

}
