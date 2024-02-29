package RahulsCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Static drop down -> select class
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		int times=1;
		dr.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement select= dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s= new Select(select);
		s.selectByIndex(2);
		String selected= s.getFirstSelectedOption().getText();
		System.out.print(selected);
	 //***********************************
		dr.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		/*for(int i=0;i<=times;i++) {
		dr.findElement(By.id("hrefIncAdt")).click();
		
		}*/
		
		while(times<5) {
			dr.findElement(By.id("hrefIncAdt")).click();
			times++;
		}
        dr.findElement(By.id("btnclosepaxoption")).click();
        System.out.print(dr.findElement(By.id("divpaxinfo")).getText());
	
	

	
	
	
	
	
	
	
	
	
	}}
