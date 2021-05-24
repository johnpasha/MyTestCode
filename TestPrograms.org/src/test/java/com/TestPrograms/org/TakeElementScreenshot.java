package com.TestPrograms.org;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		
		WebElement we = driver.findElement(By.xpath("//img[@class='cbt']"));
		
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		BufferedImage fullImg = ImageIO.read(Screenshot);
		
		BufferedImage subImg = fullImg.getSubimage(we.getLocation().getX(), we.getLocation().getY(), we.getSize().width, we.getSize().height);
		
		ImageIO.write(subImg, "jpg", Screenshot);
		
		FileUtils.copyFile(Screenshot, new File("./src/test/output/ElementScreenshot.jpg"));
	}

}
