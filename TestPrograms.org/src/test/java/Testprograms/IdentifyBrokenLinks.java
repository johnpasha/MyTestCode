package Testprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdentifyBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		int responseCode=0;
		driver.get("https://www.google.com");
		
		HttpURLConnection huc =null;
		String url = null;
		List<WebElement> webElementList = driver.findElements(By.tagName("a"));
//		webElementList.get(0)
		for(WebElement w:webElementList) {
//			System.out.println(w.getAttribute("href"));
			url=w.getAttribute("href");
			if(url!=null && !url.isEmpty()) {
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("GET");
				huc.connect();
				responseCode = huc.getResponseCode();
				if(responseCode >= 400){
                    System.out.println(responseCode+"	"+url+" is a broken link");
                }
                else{
                    System.out.println(responseCode+"	"+url+" is a valid link");
                }
				
			}
		}
		System.out.println("===========================");
		System.out.println(huc);
		System.out.println("===========================");
		System.out.println(huc.getContent());
		System.out.println("===========================");
		
//		ArrayList l;
//		l.get(0);
		
	}

}
