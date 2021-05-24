package com.TestPrograms.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot ts = (TakesScreenshot) driver;

		File f = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("C:\\Users\\johnpasha.shaik\\eclipse-workspace\\TestPrograms.org\\src\\test\\output\\TestScreenshot.jpg"));
	}

}
