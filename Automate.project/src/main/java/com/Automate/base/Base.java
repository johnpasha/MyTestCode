package com.Automate.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automate.utils.ReadProperties;
import com.Automate.utils.ReadTestData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	ReadProperties readProps = new ReadProperties();
	public static Properties OR, config;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public ReadTestData rtd = new ReadTestData();
	public String excelPath;
	public static WebDriverWait wait=null;
	DesiredCapabilities cap;
	
	@BeforeSuite
	public void setUp() throws MalformedURLException {
		OR = readProps.ReadPropertyFile(".\\src\\main\\Resources\\OR.properties");
		config = readProps.ReadPropertyFile(".\\src\\main\\Resources\\config.properties");
		log.info("Loaded OR and Config files");
		if(config.getProperty("IsRemote").equals("1")) {
			getRemoteDriver(config.getProperty("browser"));
		}else {
			getDriver(config.getProperty("browser"));
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
	}
	
	
	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.quit();
		}
	}
	
	@BeforeMethod
	public void Nav(){
		driver.get(config.getProperty("url"));
	}
	
	public void getDriver(String browser) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.debug("Chrome initiated");
		}else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			log.debug("IE initiated");
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.debug("firefox initiated");
		}else {
			System.out.println("invalid driver details mentioned in config.properties file, browser="+browser);
		}
		
	}
	
public void getRemoteDriver(String browser) throws MalformedURLException {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
//			cap = DesiredCapabilities.chrome();
//			cap.setBrowserName(browser);
//			cap.setPlatform(Platform.WIN10);
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setCapability("platformName", "Windows 10");
			driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444/wd/hub"),chromeOptions);
			log.debug("Chrome initiated");
		}else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
//			DesiredCapabilities.firefox()
			driver = new InternetExplorerDriver();
			log.debug("IE initiated");
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444/wd/hub"), firefoxOptions);
			log.debug("firefox initiated");
		}else {
			System.out.println("invalid driver details mentioned in config.properties file, browser="+browser);
		}
		
	}
	
	public void click(String Locator) {
		driver.findElement(getLocator(Locator)).click();
	}
	
	public void sendKeys(String Locator, String keys) {
		driver.findElement(getLocator(Locator)).sendKeys(keys);
	}
	
	public By getLocator(String Locator) {
		By by=null;
		if(Locator.substring(0, 9).equals("By.xpath(")) {
			System.out.println(Locator.substring(10,Locator.length()-2));
			by = By.xpath(Locator.substring(10,Locator.length()-2));		
		}
		else if(Locator.substring(0, 6).equals("By.id(")) {
			System.out.println(Locator.substring(7,Locator.length()-2));
			by = By.id(Locator.substring(7,Locator.length()-2));
		}
		else if(Locator.substring(0, 8).equals("By.name(")) {
			System.out.println(Locator.substring(9,Locator.length()-2));
			by = By.name(Locator.substring(9,Locator.length()-2));
		}
		else if(Locator.substring(0, 13).equals("By.className(")) {
			System.out.println(Locator.substring(14,Locator.length()-2));
			by = By.className(Locator.substring(14,Locator.length()-2));
		}
		else if(Locator.substring(0, 11).equals("By.tagName(")) {
			System.out.println(Locator.substring(12,Locator.length()-2));
			by = By.tagName(Locator.substring(12,Locator.length()-2));
		}
		else if(Locator.substring(0, 12).equals("By.linkText(")) {
			System.out.println(Locator.substring(13,Locator.length()-2));
			by = By.linkText(Locator.substring(13,Locator.length()-2));
		}		
		else if(Locator.substring(0, 19).equals("By.partialLinkText(")) {
			System.out.println(Locator.substring(20,Locator.length()-2));
			by=By.partialLinkText(Locator.substring(20,Locator.length()-2));
		}
		else if(Locator.substring(0, 15).equals("By.cssSelector(")) {
			System.out.println(Locator.substring(16,Locator.length()-2));
			by = By.cssSelector(Locator.substring(16,Locator.length()-2));	
		}else {
			System.out.println("Invalid locator mentioned Locator="+Locator);
		}
	
		return by;
	}
	
//	@DataProvider(name="data")
//	public Object[][] getData(Method m) throws IOException {
		
//		String SuiteName = config.getProperty("SuiteName");
//		Workbook wb= rtd.readExcel(excelPath);
//		Sheet sheet = wb.getSheet("DataSuite");
		
//		excelPath = config.getProperty("TestDataExcelPath");
//		String sheetName = m.getName();
//		Workbook wb=rtd.readExcel(excelPath);
//		Sheet sheet = wb.getSheet(sheetName);
//		
//		int rows = sheet.getLastRowNum();
//		int cols = sheet.getRow(0).getLastCellNum();
//		
//		Object[][] obj = new Object[rows][cols];
//				
//		for(int i=2; i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				obj[i-2][j] = sheet.getRow(i).getCell(j).getStringCellValue();
//			}
//		}
//		return obj;
//	}

}
