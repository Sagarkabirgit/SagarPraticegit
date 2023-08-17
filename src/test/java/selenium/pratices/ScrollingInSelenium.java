package selenium.pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		// Scroll Down
		javascriptExecutor.executeScript("window.scrollBy(0, 1000)", "");

		Thread.sleep(3000);
		// Scroll up
		javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);

		// scroll horizontally right

		javascriptExecutor.executeScript("window.scrollBy(100,0)", "");

		Thread.sleep(3000);

		// scroll horizontally left

		javascriptExecutor.executeScript("window.scrollBy(-100,0)", "");

		Thread.sleep(2000);
		
		// scroll into view

		WebElement dropdownbutton = driver.findElement(By.xpath("//button[text()='Dropdown']"));

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", dropdownbutton);

		// click using JS

		javascriptExecutor.executeScript("arguments[0].click();", dropdownbutton);

		// scroll till end of the page

		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

}
