package selenium.pratices;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizatinInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor javascriptexecuter =(JavascriptExecutor)driver;
		
				
		WebElement checkthisbutton =driver.findElement(By.xpath("//button[text()='Check this']"));
		javascriptexecuter.executeScript("arguments[0].scrollIntoView(true);", checkthisbutton);
		
		checkthisbutton.click();
		// Explicit wait 
		
		/*
		 * WebElement mroption = driver.findElement(By.xpath("//input[@id=\"dte\"]"));
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11)) ;
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(mroption));
		 * 
		 * mroption.click();
		 */
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver) ;
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(org.openqa.selenium.net.UrlChecker.TimeoutException.class);
		wait.withTimeout(Duration.ofSeconds(11));
		wait.until(ExpectedConditions.elementToBeClickable(checkthisbutton));
		
		



		driver.findElement(By.xpath("//button[@Class='dropbtn']"));
		
		WebElement gmaillink =driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		wait.until(ExpectedConditions.invisibilityOf(gmaillink));
		
//		gmaillink.click();
		
		javascriptexecuter.executeScript("arguments[0].click();", gmaillink);

		
		
				

	}
	
	
}
