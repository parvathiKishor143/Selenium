package selfPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		dr.findElement(By.className("ui-autocomplete-input")).sendKeys("au");
		Thread.sleep(3000);
		List<WebElement> list= dr.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for(WebElement country:list) {
			System.out.println(country);
			String name=country.getText();
			System.out.println(name);
			
			if(name.equals("Mauritius")) {
				country.click();
				
			}
			
		}
		
		
	}

}
