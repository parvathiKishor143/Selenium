package selfPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> rows= dr.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		 int Row_count =dr.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		 System.out.println("rows size" + Row_count);
		 
		 
		int count=0;
		
		for(WebElement row: rows) {
			count++;
			if(count==1) {
				continue;
			}
			
			System.out.println("rows are" + row.getText());
			List<WebElement> cells= row.findElements(By.xpath("td"));
			
			for(WebElement cell: cells) {
				System.out.println("cells are" + cell.getText());
			}
			
		
			 
		}
	}
	}


