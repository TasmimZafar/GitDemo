package SeleniumPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeMethod
	public void setUp()
	{
		System.out.println("Test");
	}
	
	@Test(priority = 1)
	public void runRes()
	{
		System.out.println("Run");
	
	}
	
	@Test(priority = 2)
	public void runRes1()
	{
		System.out.println("Run1");
	
	}
	
	@AfterMethod
	public void exit()
	{
		System.out.println("Run1");
	
	}
	
}
