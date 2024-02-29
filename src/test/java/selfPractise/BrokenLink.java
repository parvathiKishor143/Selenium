package selfPractise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		List<WebElement> links= dr.findElements(By.xpath("//a[contains(@href,'.')]"));
		
		for(WebElement link:links) {
			String url= link.getAttribute("href");
			System.out.println(url);
			if(url==null||url.isEmpty()) {
				System.out.println("empty");
				continue;
			}
			try {
				HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int cod= huc.getResponseCode();
				if(cod>=400){
					System.out.println(url + "broken");
				}else {
					System.out.println(url + "good");
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
