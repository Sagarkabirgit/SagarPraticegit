package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import omayoblog.pages.HomePage;
import utilities.Utility;




public class VerifyMultiSelectFunctionlityOfDropDown extends BaseTestCase {
	   HomePage page;
	  @Test
	  public void verifyMultiSelectFunctionlityOfDropDown() 
	  {
		  page = new HomePage(driver);
		  String[] options = {"Audi","Volvo"};
		  ArrayList<String> selectedoptions =Utility.selectOptionFromDropDown(page.getMultiSelectDropDownLocator(), options);
		  
		  assertEquals(selectedoptions, Arrays.asList("Volvo","Audi"));
	  }
		
	  
	}
	


