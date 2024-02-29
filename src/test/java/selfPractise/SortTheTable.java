package selfPractise;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

public class SortTheTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		dr.findElement(By.className("sort-icon")).click();
		
		List<WebElement> names= dr.findElements(By.xpath("// table[@class='table table-bordered']/tbody/tr/td[1]"));
		
		List<String> orginalList=names.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(orginalList) ;
		List<String> sortedList=orginalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList) ;
			Assert.assertTrue(orginalList.equals(sortedList));
			List<String> price;
		//names.stream().filter(s->s.getText().contains("Beans")).map(s->s.getPrice())
			do {
				
				List<WebElement> names1= dr.findElements(By.xpath("// table[@class='table table-bordered']/tbody/tr/td[1]"));
			price=names1.stream().filter(t->t.getText().contains("Rice")).map(t->getPrice(t)).collect(Collectors.toList());
			price.forEach(u->System.out.println(u));
			if(price.size()<1) {
				dr.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			}while (price.size()<1);
		}
		
private static String getPrice(WebElement t) {
	String price=t.findElement(By.xpath("following-sibling::td[1]")).getText();
	return price;
	
}
		
	}


