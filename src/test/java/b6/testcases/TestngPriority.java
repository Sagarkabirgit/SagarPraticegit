package b6.testcases;

import org.testng.annotations.Test;

public class TestngPriority {
	
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test (groups = {"sanity"})
	public void ab()
	{
		System.out.println("ab");
	}
	@Test(groups = {"smoke" , "Regression"})
	public void cd()
	{
		System.out.println("cd");
	}
	@Test(groups = {"sanity" , "system"})
	public void ef()
	{
		System.out.println("ef");
	}

}
