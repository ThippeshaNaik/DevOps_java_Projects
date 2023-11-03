package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups= {"smoke"})
	public void TC_04()
	{
		System.out.println("india");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	
	
}
