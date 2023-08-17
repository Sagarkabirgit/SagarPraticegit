package selenium.pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationImp {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://omayo.blogspot.com/");
		    driver.manage().window().maximize();
		    
			//is selected 
		    WebElement Maleradiobutton = driver.findElement(By.xpath("//input[@id='radio1']"));
		    WebElement FeMaleradiobutton = driver.findElement(By.xpath("//input[@id='radio2']"));
		    Maleradiobutton.click();
		    System.out.println("MaleRadiobutton is selected :"+Maleradiobutton.isSelected());
		    System.out.println("FeMaleRadiobutton is selected :"+FeMaleradiobutton.isSelected());
		    System.out.println("FeMaleRadiobutton is Displyed :"+FeMaleradiobutton.isDisplayed());
		    
		    WebElement Orangecheckbox = driver.findElement(By.xpath("//input[@id= 'checkbox1']"));
		    WebElement Bluecheckbox = driver.findElement(By.xpath("//input[@id= 'checkbox2']"));
		    
		    System.out.println("Orange checkbox is selected :" +Orangecheckbox.isSelected());
		    System.out.println("Blue checkbox is selected :"   +Bluecheckbox.isSelected());
		    System.out.println("Blue checkbox is Displyed : "  +Bluecheckbox.isDisplayed());
		    
		    
              // is enabled 
		    System.out.println("Button one is = "+ driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
		    System.out.println("Button one is = "+ driver.findElement(By.xpath("//button[@id='but2']")).isEnabled());
 
	}

}
