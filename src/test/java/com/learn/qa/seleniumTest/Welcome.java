package com.learn.qa.seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.flipkart.com/");
		dr.findElement(By.cssSelector("input.Pke_EE")).sendKeys("mobiles");
		dr.findElement(By.cssSelector("button._2iLD__")).click();
		
		List<WebElement> list= dr.findElements(By.cssSelector("a._1fQZEK"));
		for(WebElement li:list) {
			String prize=li.findElement(By.cssSelector("div._30jeq3")).getText();
			String modPrize=prize.replaceAll("\\W", "");
			
			
			double priz=Double.parseDouble(modPrize);
			
			if((priz<10000)) {
				String name=li.findElement(By.cssSelector("div._4rR01T")).getText();
				System.out.println(priz);
				System.out.println(name);
			}
		}


	}

}
