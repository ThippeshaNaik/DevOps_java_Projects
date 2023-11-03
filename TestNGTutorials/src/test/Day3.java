package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day3 {

	@Parameters({"URL","API KEY"})
	@Test
	public void webLogInCarLoan(String google,String key)
	{
		//selenium
		//WebDriver driver = new ChromeDriver();
		System.out.println("webLogInCar");
		System.out.println(google);
		System.out.println(key);
	}
	@BeforeSuite
	public void bSuite()
	{
		System.out.println("iam number one");
	}
	@Test(groups= {"smoke"})
	public void mobileLogIncarLoan()
	{
		//Appium
		System.out.println("mobileLogIncar");
	}
	@BeforeTest
	public void loginAPICarLoan()
	{
		//rest api automation
		System.out.println("i will execute first");
	}
}
