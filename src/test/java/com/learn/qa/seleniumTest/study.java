package com.learn.qa.seleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class study {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		// Broken links in a web page
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver= new ChromeDriver();
		       // driver.get("https://www.swiggy.com/");
		        driver.get("https://www.ilovepdf.com/excel_to_pdf");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		        	
		/*List<WebElement> list= driver.findElements(By.xpath("//a[contains(@href,'.')]"));
		for(WebElement li:list) {
			String url=li.getAttribute("href");
			System.out.println(" *******************************");
			if(url==" " || url.isEmpty()) {
				System.out.println(" Empty URL");
				continue;
			}
			
			try {
				HttpURLConnection huc= (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int code=huc.getResponseCode();
				if(code>=400) {
					System.out.println(   url + "Broken URL with"+ code );
				}else {
					System.out.println(   url +"valid");
				}
				
				
				
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}*/
		        driver.findElement(By.id("pickfiles")).click();
		        String file= "C:\\Users\\PARVATHI KISHOR\\Desktop\\Preperation.xlsx";
		        StringSelection s= new StringSelection(file);
		        java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		        Robot r= new Robot();
		        r.keyPress(KeyEvent.VK_CONTROL);
		        r.keyPress(KeyEvent.VK_V);
		        r.keyRelease(KeyEvent.VK_V);
		        r.keyRelease(KeyEvent.VK_CONTROL);
		        r.keyRelease(KeyEvent.VK_ENTER);
		        
		
	}

	private static Object Toolkit() {
		// TODO Auto-generated method stub
		return null;
	}

}
