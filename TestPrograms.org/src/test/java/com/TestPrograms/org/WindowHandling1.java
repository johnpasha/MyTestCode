package com.TestPrograms.org;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy'][@title='Follow @seleniumeasy on Twitter']")).click();
		
		Set<String> windows= driver.getWindowHandles();
//		System.out.println(windows.iterator().next().toString());
		Iterator itr = windows.iterator();
		driver.switchTo().window(itr.next().toString());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//switching to second window
		driver.switchTo().window(itr.next().toString());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(windows.iterator().next());
		System.out.println(driver.getTitle());
	}

}
