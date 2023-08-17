package selenium.pratices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://omayo.blogspot.com/");
    driver.manage().window().maximize();
    // It is used to close current instance of browser
    
    //WebElement maleRadioButton   = driver.findElement(By.xpath("//input[@id='radio1']"));
    //WebElement FemaleRadioButton = driver.findElement(By.cssSelector("input#radio2"));
   // maleRadioButton.click();
    
    //FemaleRadioButton.click();
    // WebElement FemaleRadioButton = driver.findElement(By.cssSelector("input#abc"));
     List <WebElement> Buttons = driver.findElements(By.tagName("button"));
     List <WebElement> Buttons1 = driver.findElements(By.tagName("but"));
     System.out.println("Total buttons on webpage is " +Buttons.size());
     System.out.println("Total buttons on webpage is " +Buttons1.size());
    
    Thread.sleep(5000);
    
    //driver.close();

	}

}
