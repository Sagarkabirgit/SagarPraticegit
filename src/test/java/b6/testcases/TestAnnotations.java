package b6.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@BeforeSuite
	public void beforesuite () 
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void beforetest () 
	{
		System.out.println("before test plan");
	}
	@BeforeClass
	public void beforeclass () 
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforemethod () 
	{
		System.out.println("before Method");
	}

	@Test
	public void test () 
	{
		System.out.println("test case");
	}
	@AfterMethod
	public void aftermethod () 
	{
		System.out.println("after Method");
	}
	@AfterClass
	public void afterclass () 
	{
		System.out.println("after class");
	}

	@AfterTest
	public void afterTest () 
	{
		System.out.println("after Test plan execute");
	}
	@AfterSuite
	public void aftersuite () 
	{
		System.out.println("after suite execute");
	}

}
