import java.net.HttpURLConnection;
import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;


public class Brocken_URL {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//step 1 - get all urls tied up to the links using selinium
		//java methods will call URL and get you the status code
		// if status codes >400 then the url is broken
		
		String url= driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
	     
	       
		
		
		
		
		
		
	}
	
}
