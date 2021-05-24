package com.test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	static WebDriver driver = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
	//*******************	//click, contextclik, Doubleclick()
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
//		
//		driver.switchTo().frame("iframeResult");
//		
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(driver.findElement(By.xpath("//input[@id='vehicle1']")))
//		.contextClick().build().perform();
//		
//		System.out.println(driver.findElement(By.xpath("//input[@id='vehicle1']")).isSelected());
		
		
		//*******************//DRAG and DROP
//		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
//		Actions action = new Actions(driver);
//		
//		action.dragAndDrop(driver.findElement(By.xpath("//span[text()='Draggable 1']")), driver.findElement(By.xpath("//div[@id='mydropzone']")))
//		.perform();
		
		//*******************//switch to alert
//		driver.switchTo().alert().getText();
		
		//*******************check radio button or check box is selected or not
//		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='panel-body']/label[@class='radio-inline']/input[@type='radio' and @value='Male']")));
//		boolean b = driver.findElement(By.xpath("//div[@class='panel-body']/label[@class='radio-inline']/input[@type='radio' and @value='Male']"))
//		.isSelected();
//		
//		System.out.println(b);
//		
//		if (b==false)
//		{
//			driver.findElement(By.xpath("//div[@class='panel-body']/label[@class='radio-inline']/input[@type='radio' and @value='Male']")).click();
//		}
//		System.out.println(driver.findElement(By.xpath("//div[@class='panel-body']/label[@class='radio-inline']/input[@type='radio' and @value='Male']"))
//		.isSelected());
		
		//************* Drop down selection
//		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//		Select s = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
//		s.selectByIndex(1);
//		s.selectByValue("");
//		s.selectByVisibleText("");
		
		//*********************** Java Script executor
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		WebElement e = driver.findElement(By.xpath("//*[@id=\"user-message\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='abcd'", e);
		
		e= driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
		js.executeScript("arguments[0].click()", e);
		
		
	}

}
