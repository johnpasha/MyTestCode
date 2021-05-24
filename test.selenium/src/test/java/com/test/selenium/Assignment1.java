package com.test.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	

	@FindBy(xpath="//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3/span")
	public WebElement test;
	public static WebDriver driver;
	
	public Assignment1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) {
		
		Assignment1 a = new Assignment1();	
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("way2automation", Keys.ENTER);
		a.test.click();
		
		List<WebElement> elements= driver.findElements(By.tagName("a"));
		
		System.out.println("totla number of links --> "+elements.size());
		
		System.out.println("Printing links");
		
//		Iterator itr = elements.iterator();
		for(WebElement e:elements) {
			System.out.println(e.getAttribute("href"));
		}
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.
		
	}

}
