package omayoblog.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	WebElement MultiSelectDropDown;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getMultiSelectDropDownLocator() {

		MultiSelectDropDown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		return MultiSelectDropDown;
	}

	

}
