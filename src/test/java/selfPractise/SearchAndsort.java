package selfPractise;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		dr.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		
		List<WebElement> rice= dr.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> rrice= rice.stream().filter(r->r.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(rice.size(), rrice.size());
	}

}
