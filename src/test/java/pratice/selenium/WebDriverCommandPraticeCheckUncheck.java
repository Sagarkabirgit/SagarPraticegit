package pratice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommandPraticeCheckUncheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@value='Bike']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Bicycle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Car']")).click();

		List<WebElement> link = driver.findElements(By.tagName("a"));

		System.out.println("Total links is " + link.size());

		System.out.println(" current url is " + driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());

	}

}
