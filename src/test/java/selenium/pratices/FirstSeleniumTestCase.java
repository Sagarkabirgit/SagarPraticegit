package selenium.pratices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		//driver.close();
		driver.get("http://omayo.blogspot.com/");
		// to find Web Element by Name
        WebElement element =driver.findElement(By.name("userid"));
        element.sendKeys("Example");
        Thread.sleep(3000);
        element.clear();
        
        // to find web element by id
        WebElement element2 = driver.findElement(By.id("but2"));
        System.out.println(element2.getText());
        
        // to find element using linktext
        driver.findElement(By.linkText("Posts (Atom)")).click();
        // to find element using partial link text
        driver.findElement(By.partialLinkText("(Atom)")).click();
        // to find elements using tagname
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println("list of links" + link.size());
	}

}
