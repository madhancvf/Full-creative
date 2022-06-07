package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Java Software\\Selenium_Feb7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//			driver.get("https://adactin.com/HotelApp/index.php");
//			driver.manage().window().maximize();
//		WebElement x = driver.findElement(By.id("username"));
//			x.sendKeys("vengatram");
//			
//			WebElement x1 = driver.findElement(By.name("password"));
//			Actions a=new Actions(driver);
//			a.doubleClick(x).perform();
//		x.sendKeys(Keys.CONTROL,"c");
//			x1.sendKeys(Keys.CONTROL,"v");
//		String attribute = x1.getAttribute("value");
//			System.out.println(attribute);
//			
			
			
			
//			driver.get("https://demo.actitime.com/login.do");
//			WebElement un = driver.findElement(By.id("username"));
//			//To get the size of an element; height & width
//			Dimension s = un.getSize();
//			int h = s.getHeight();
//			int w = s.getWidth();
//			System.out.println("Height: "+h);
//			System.out.println("Width: "+w);
//			//To get location of an element; x-axis & y-axis
//			Point l = un.getLocation();
//			int x = l.getX();
//			int y = l.getY();
//			System.out.println("x-axis: "+x);
//			System.out.println("y-axis: "+y);
//			Thread.sleep(1000);
//			driver.close();
//			
			
			
//			driver.get("https://adactin.com/HotelApp/index.php");
//			driver.manage().window().maximize();
//			WebElement x = driver.findElement(By.xpath("//td[@class='build_title']"));
//			String x1 = x.getCssValue("font-size");
//			System.out.println(x1);
//			String x2 = x.getCssValue("color");
//			System.out.println(x2);
//			String x3 = x.getCssValue("font-weight");
//			System.out.println(x3);
//			String x4 = x.getCssValue("font-family");
//			System.out.println(x4);
//			String x5 = x.getCssValue("background");
//			System.out.println(x5);
//			
			
//			driver.get("https://www.google.com/");
//			driver.manage().window().maximize();
//			List<WebElement> x = driver.findElements(By.xpath("//a"));
//			// To find the count of the link
//			System.out.println(x.size());
//			// To print all links
//			for (WebElement x1 : x) {
//			System.out.println(x1.getAttribute("href"));
//			
			
//			driver.get("https://www.google.com/");
//			driver.manage().window().maximize();
//			driver.findElement(By.name("q")).sendKeys("selenium");
//			Thread.sleep(2000);
//			// To get address of all the suggestions
//			//String xp = "//span[contains(text(),'selenium')]";
//			List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
//			// To count number of suggestions
//			int count = allSuggestions.size();
//			System.out.println(count);
//			// To print all the suggestions
//			for (int i = 0; i < count; i++) {
//			WebElement suggestion = allSuggestions.get(i);
//			String text = suggestion.getText();
//			System.out.println(text);
//			}
//			// To click on last suggestion
//			allSuggestions.get(count - 1).click();
//			
			
			
			
			
			
			
			driver.get("http://ironspider.ca/forms/dropdowns.htm");
			WebElement w = driver.findElement(By.name("coffee"));
			Select s=new Select(w);
			List<WebElement> o = s.getOptions();
			for (WebElement x:o) {
			System.out.println(x.getAttribute("value"));
			}
			
			
			
			
			
			
			
			
			
			
			
			
			}
			}
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	