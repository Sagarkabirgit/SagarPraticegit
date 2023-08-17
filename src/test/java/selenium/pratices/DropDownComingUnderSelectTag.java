package selenium.pratices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownComingUnderSelectTag {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement multiselect = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select multiselectdropdown = new Select(multiselect);

		System.out.println(multiselectdropdown.isMultiple());
		List<WebElement> options = multiselectdropdown.getOptions();

		for (WebElement opt : options) 
		{
			System.out.println(opt.getText());

		}
		multiselectdropdown.selectByIndex(2);
		multiselectdropdown.selectByValue("audix");
		multiselectdropdown.selectByVisibleText("Volvo");
		
		System.out.println("######################################");
		
		List<WebElement> Selectedoptions = multiselectdropdown.getAllSelectedOptions();
		
		for(WebElement opt :Selectedoptions) 
		{
			System.out.println(opt.getText());
		}
		
		System.out.println("######################################");
		multiselectdropdown.getFirstSelectedOption().getText();
		multiselectdropdown.deselectByIndex(0);
		multiselectdropdown.deselectByValue("audix");
		multiselectdropdown.deselectByVisibleText("Hyundai");
		
		
		System.out.println("######################################");
		
		multiselectdropdown.selectByIndex(2);
		multiselectdropdown.selectByValue("audix");
		multiselectdropdown.selectByVisibleText("Volvo");
		
		multiselectdropdown.deselectAll();
		
		
		
	}

}
