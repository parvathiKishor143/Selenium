package com.learn.qa.seleniumTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Broken links in a web page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver dr= new ChromeDriver();
        dr.get("https://www.swiggy.com/");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        List<WebElement> links=dr.findElements(By.xpath("//a[contains(@href,'.')]"));
        
        for(WebElement link : links) {
        	String url=link.getAttribute("href");
        	System.out.println("***************************");
        	
        	if(url==null || url.isEmpty()) {
        		System.out.println(" Emply url ");
        		continue;
        	}
        	
        	try {
				HttpURLConnection huc= (HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");	
			huc.connect();
			int responsecode=huc.getResponseCode();
			if(responsecode>=400) {
				System.out.println(url +" is Broken url "+ responsecode);
			} 
				
				
				
				
				
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        	
        }
        
        
        
	}

}
