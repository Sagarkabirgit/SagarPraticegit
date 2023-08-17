package selenium.pratices;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class ExcelDrivenTest {

	public static void main(String[]args) throws IOException {
		
		List<String> datafromexcel = Utility.ReadExcel();


		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.getproperty("demourl"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(datafromexcel.get(0));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(datafromexcel.get(1));
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(datafromexcel.get(2));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(datafromexcel.get(3));
		
		

		
	}

}
