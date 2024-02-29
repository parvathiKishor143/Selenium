package RahulsCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver dr= new ChromeDriver();	
dr.get("https://rahulshettyacademy.com/locatorspractice/");
dr.findElement(By.linkText("Forgot your password?")).click();
dr.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ParvathiKrishna");
dr.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("xyz@gmail.com");
dr.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9809738574");
String password= dr.findElement(By.cssSelector("WebDriver dr")).getText(); 
//Please use temporary password 'rahulshettyacademy' to Login.

String[] formatPassword=password.split("'"); // 0->Please use temporary password  1->'rahulshettyacademy' to Login.
String[] formatPassword1=formatPassword[1].split("'"); //0->rahulshettyacademy 1->to Login

String password1=formatPassword1[0];





	
	}

	
		
	
}
