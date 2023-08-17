package selenium.pratices;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class HowToHandleAlearts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
//	    driver.get(Utility.getproperty("url"));
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//input[@id='confirm']")).click();
	    Alert al =driver.switchTo().alert();
	    // sendkeys command not working for alerts in few cases 
	    // al.sendKeys("Hello Everyone");
	    System.out.println(al.getText());
	    al.accept();
	    al.dismiss();
	    
	    

	    
	   
	    

	}

}
