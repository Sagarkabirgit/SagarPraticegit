package selenium.pratices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='selenium143']")).click();

		String currentwindlowhandle = driver.getWindowHandle();
		Set<String> allwindowhandles = driver.getWindowHandles();
		
		
		    //        for(String handle : allwindowhandles) {
		    //      if(handle.equals(currentwindlowhandle)) {
		    //	                  continue;
		    //      } 
		    //      esle {
		    //          driver.switchTo().window(handle);
		    //      }
		    
            // }
		for (String handle : allwindowhandles) {

			if (!(handle.equals(currentwindlowhandle))) {
			
			
				driver.switchTo().window(handle);
			}

		}

		System.out.println(driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());
		// method is used to get back to the current window
		driver.switchTo().window(currentwindlowhandle);
		driver.findElement(By.cssSelector("input#radio1")).click();

	}

}
