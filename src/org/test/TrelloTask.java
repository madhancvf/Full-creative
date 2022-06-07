package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Software\\SeleniumDaa\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/en/login");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.id("user"));
		email.sendKeys("madhancvf17@gmail.com");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Poda@123");
		WebElement login2 = driver.findElement(By.id("login-submit"));
		login2.click();
		
		Thread.sleep(4000);
		WebElement trello = driver.findElement(By.xpath("//div[@class='_2ft40Nx3NZII2i']"));
		trello.click();

		Thread.sleep(3000);
		WebElement board = driver.findElement(By.xpath("//div[@class='board-tile mod-add']"));
		board.click();
		
		WebElement p = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		p.sendKeys("Project");
		
		WebElement create= driver.findElement(By.xpath("(//button[@type='button'])[33]"));
		create.click();
		
		WebElement addlist = driver.findElement(By.name("name"));
		addlist.sendKeys("LIST A");
	
		WebElement s= driver.findElement(By.xpath("//input[@type='submit']"));
		s.click();;
		
		
		WebElement addlist1 = driver.findElement(By.name("name"));
		addlist1.sendKeys("LIST B");
		
		WebElement s1= driver.findElement(By.xpath("//input[@type='submit']"));
		s1.click();;
		
		WebElement addcard = driver.findElement(By.xpath("//span[text()='Add a card']"));
		WebElement a1= driver.findElement(By.xpath("(//textarea[@dir='auto'])[2]"));
		a1.sendKeys("yoyo");
		s1.click();
		
		WebElement a2 = driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[2]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(a1,a2).build().perform();
		
		int X=a2.getLocation().getX();
		int Y=a2.getLocation().getY();
		System.out.println("x and y co-ordinates of moved card");
		System.out.println("x co-ordinates are"+X);
		System.out.println("Y co-ordinates are"+Y);
		
		WebElement sett = driver.findElement(By.xpath("(//span[@title='Madhan R (madhanr5)'])[1]"));
		sett.click();
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log out']"));
		logout.click();
	}
}
