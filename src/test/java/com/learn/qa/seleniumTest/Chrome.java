package com.learn.qa.seleniumTest;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver dr= new ChromeDriver();

// To print all the displayed links:

//dr.get("https://www.google.com/"); // To print all the displayed links:
//dr.get("https://www.amazon.com/");// To print webelements within another webeleemnt
//dr.get("https://www.facebook.com/");//To select the value and print the values from a drop down, // CSS selector, // is enabled or vissibility
//dr.get("https://www.linkedin.com/"); // multi select boxes
//dr.get("https://www.redbus.com/");// date picker

//dr.get("https://www.dezlearn.com/webtable-example/");// webtable
//dr.get("https://www.dezlearn.com/multiple-browser-windows/");// Browsers
dr.get("https://www.dezlearn.com/iframe-example/"); // iframes
dr.manage().window().maximize();
dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*System.out.println(dr.getTitle());
System.out.println(dr.getPageSource());
System.out.println(dr.getWindowHandle());
System.out.println(dr.getCurrentUrl());
dr.navigate().to("https://www.facebook.com");
dr.navigate().back();
dr.navigate().forward();
dr.navigate().refresh();
dr.quit();

List<WebElement> list= dr.findElements(By.cssSelector("a"));
for(WebElement ls:list) {
	if(ls.isDisplayed()) {
		System.out.println(ls.getText());
	System.out.println("link is:" + ls.getAttribute("href"));
}
	}
// To print webelements within another webeleemnt
dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Women shoes");
dr.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

List<WebElement> ls=dr.findElements(By.cssSelector("div.s-overflow-hidden"));

for(WebElement list:ls) {
	String prize=list.findElement(By.cssSelector("span.a-price-whole")).getText().trim();
	System.out.println("prize is:" + prize);
	double prize1=Double.parseDouble(prize);// converts string to double
	System.out.println("prize is:" + prize1);
	if((prize1<20||prize1>50)) {
		String productName=list.findElement(By.cssSelector("span.a-size-base-plus")).getText().trim();
		System.out.println("productName is:" + productName);
	}
}

// CSS selector

String color=dr.findElement(By.cssSelector("button._42ft")).getCssValue("color");
String background=dr.findElement(By.cssSelector("button._42ft")).getCssValue("background-color");
String font=dr.findElement(By.cssSelector("button._42ft")).getCssValue("font");
String fontsize=dr.findElement(By.cssSelector("button._42ft")).getCssValue("font-size");
String fontfamily=dr.findElement(By.cssSelector("button._42ft")).getCssValue("font-family");
String height=dr.findElement(By.cssSelector("button._42ft")).getCssValue("height");
String width=dr.findElement(By.cssSelector("button._42ft")).getCssValue("width");

System.out.println("color is:" + color);
System.out.println("background is:" + background);
System.out.println("font is:" + font);
System.out.println("fontsize is:" + fontsize);
System.out.println("fontfamily is:" + fontfamily);
System.out.println("height is:" + height);
System.out.println("width is:" + width);


// is enabled or vissibility

boolean displayed= dr.findElement(By.cssSelector("button._42ft")).isDisplayed();
boolean enabled= dr.findElement(By.cssSelector("button._42ft")).isEnabled();
boolean selected= dr.findElement(By.cssSelector("button._42ft")).isSelected();
System.out.println("displayed:" + displayed);
System.out.println("enabled:" + enabled);
System.out.println("selected:" + selected);

//To select the value and print the values from a drop down

dr.findElement(By.cssSelector("div._6ltg>a")).click();

List<WebElement> ele= dr.findElements(By.cssSelector("select#month>option"));

for(WebElement el: ele) {
	System.out.println(el.getText().trim());
	if(el.getText().trim().equals("Nov")) {
		el.click();
		break;
	}
}


// multi select boxes
dr.findElement(By.xpath("//span[contains(text(),'Jobs')]")).click();
dr.findElement(By.xpath("//button[contains(text(),'Experience level')]")).click();

List<WebElement> drop= dr.findElements(By.xpath("(//div[@class='filter-values-container'])[6]/div/div"));

for(WebElement dro: drop) {
	if(dro.getText().trim().contains("Internship")||dro.getText().trim().contains("Associate ")) {// contains used when we have multiple attributes under the parent to match the word
		dro.click();
	}
	
}

// select date from date picker// trivago

String expectedDate="March 2024";
dr.findElement(By.cssSelector("button.sc-fjdhpX")).click();
dr.findElement(By.cssSelector("div#date-box")).click();


List<WebElement> rows= dr.findElements(By.xpath("//div[@class='elementor-widget-container']/table/tbody/tr"));
int c=0;
for(WebElement row: rows) {
	c++;
	
	if(c==1) {
		continue;
	}
	String x=row.findElement(By.xpath("td[1]")).getText();
	String y=row.findElement(By.xpath("td[2]")).getText();
	System.out.println(x);
	System.out.println(y);
	
}


// To handle objects within the page

//dr.findElement(By.xpath("(//button[@class='close'])[1]/span")).click();
List<WebElement> rows= dr.findElements(By.xpath("//div[@class='elementor-widget-container']/table/tbody/tr"));
int c=0;
for(WebElement r: rows) {
c++;
	
	if(c==1) {
		continue;
	}
	String s= r.findElement(By.xpath("td[1]")).getText();
	
	if(s.contains("Alvin Rogers")) {
	r.findElement(By.xpath("td[3]/input")).click();
	r.findElement(By.xpath("td[4]/input")).click();
	
	List<WebElement> select= r.findElements(By.xpath("td[5]/select/option"));
	
	for(WebElement s1: select) {
		
		if(s1.getText().contains("Sedan")) {
			s1.click();
			break;
		}
	}
	r.findElement(By.xpath("td[6]/input")).sendKeys("Test comment");
	break;
}



}
dr.findElement(By.xpath("//button[@id='demo']")).click();


// WINDOWS //
dr.findElement(By.cssSelector("button#u_7_8")).click();

Set<String> windows= dr.getWindowHandles();

for(String window :windows ) {
	
	System.out.println(window);
	dr.switchTo().window(window);
	System.out.println(dr.getTitle());
	System.out.println(dr.getCurrentUrl());
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
	if(dr.getCurrentUrl()=="https://www.facebook.com/") {
		break;
	}
	
	
}
dr.findElement(By.id("input#email")).sendKeys("Maya maa");

dr.findElement(By.cssSelector("button#u_7_8")).click();
String parent=dr.getWindowHandle();
Set<String> childs=dr.getWindowHandles();

for(String child:childs) {
	if(!child.equals(parent)) {
		dr.switchTo().window(child);
		dr.close();
	}
}
dr.switchTo().window(parent);
dr.quit();


//dr.switchTo().frame(1);
dr.switchTo().frame("iframe2");
dr.findElement(By.id("u_5_6")).click();

dr.switchTo().frame("demo_parent_iframe");

dr.switchTo().frame("demo_frame1");

dr.findElement(By.id("u_5_6")).click();

Thread.sleep(2000);

dr.switchTo().parentFrame();

dr.findElement(By.id("u_5_5")).click();

dr.switchTo().defaultContent();*/

























}
	}
