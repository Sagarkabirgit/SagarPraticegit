package selenium.pratices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    
	    WebElement searchTextbox =driver.findElement(By.xpath("//input[@title='search' and @name='q']"));
	    //sendKeys is used to send text on the text fileds
	    searchTextbox.sendKeys("Mobile");
	    Thread.sleep(5000);
	    //clear();method is used to clear the data 
	    searchTextbox.clear();
	    //it will get value of the specified attribute
	    System.out.println(searchTextbox.getAttribute("Class"));
	    
	    //it is used to verify that specified element is displayed on webpage or not
	    System.out.println(searchTextbox.isDisplayed());
	    
	    searchTextbox.getAccessibleName();
	    searchTextbox.getAriaRole();
	    System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color"));
	    System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("border"));

	    Point p= searchTextbox.getLocation();
	    System.out.println(p.getX());
	    System.out.println(p.getY());
	    
	    File file =searchTextbox.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("src/test/resources/Screenshots/textboxscreenshot.png"));
	    
	    System.out.println(searchTextbox.getTagName());
	    System.out.println(driver.findElement(By.xpath("//button[@name='samename' and @type='button'][1]")).getText());
	    
	      Dimension d =searchTextbox.getSize();
	      System.out.println(d.getHeight());
	      System.out.println(d.getWidth());
	      
	      
	    		
	    
	    
	}
}
