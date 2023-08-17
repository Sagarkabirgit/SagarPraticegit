package b6.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Utility;

public class TestCases {
	Utility util ;
	@Test
	public void verifypagetitle() throws IOException 
	{
		util= new Utility();
		WebDriver driver= util.getdriver();
		
		Assert.assertEquals(driver.getTitle(),"omayo (QAFox.com)");
	}

}
