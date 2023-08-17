package omayo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BaseTestCase {
	
	 WebDriver driver;
	  @BeforeMethod
	  public void setup() throws IOException
	  {
		 Utility utility= new Utility();
		 driver =utility.getdriver();
	  }
	  @AfterMethod
	  public void teardown()
	  {
		  driver.quit();
	  }

}
