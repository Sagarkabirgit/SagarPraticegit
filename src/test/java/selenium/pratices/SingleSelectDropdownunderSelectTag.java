package selenium.pratices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdownunderSelectTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
		Select singleselectdropdown = new Select(dropdown);

		List<WebElement> options = singleselectdropdown.getOptions();

		for (WebElement opt : options) {
			System.out.println(opt.getText());

		}

		System.out.println(singleselectdropdown.isMultiple());
		singleselectdropdown.selectByIndex(4);
		singleselectdropdown.selectByValue("mno");
		singleselectdropdown.selectByVisibleText("doc 3");
		System.out.println(singleselectdropdown.getFirstSelectedOption().getText());

	}

}
