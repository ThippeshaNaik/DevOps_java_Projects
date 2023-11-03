package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {  

	@Parameters({"URL"})
	@Test
	public void HomewebLogInCarHomeLoan(String google1)
	{
		//selenium
		System.out.println("webLogInHome");
		System.out.println(google1);
	}
	private Object enable(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test
	public void HomemobileLogInHomeLoan()
	{
		//Appium
		System.out.println("mobileLogInHome");	
	}
	@AfterTest
	public void HomeloginAPIHomeLoan()
	{
		//rest api automation
		System.out.println("I will execute at the end");
	}
	@AfterSuite
	public void aSuite()
	{
		System.out.println("i am the number last");
	}
	@BeforeMethod
	public void Bmethod()
	{
		System.out.println("before method ");
	}
}
