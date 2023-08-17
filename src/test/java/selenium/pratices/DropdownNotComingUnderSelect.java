package selenium.pratices;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class DropdownNotComingUnderSelect {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.getproperty("url"));
//		driver.get("https://www.airvistara.com/in/en/");
		driver.manage().window().maximize();
	}
}
//		driver.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
//
//		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));
//
//		for (WebElement country : countries) {
//			if (country.getText().equalsIgnoreCase("nepal")) {
//				country.click();
//
//			}
//
//		}
//
//	}
//
//}
