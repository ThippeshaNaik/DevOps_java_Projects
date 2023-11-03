package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.metrics.data.Data;

public class Day5 {
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-username and pass
		//2nd combination -username and password
		//3rd combination -username and password
		Object [][] data = new Object[3][2];
		
		//1st combination
		data[0][0]="naiklambani";
		data[0][1]="naik2011";
		
		//2nd combination
		data[1][0]="lambaninaik";
		data[1][1]="naik2021";
		
		//3rd combination
		data[2][0]="naiknaik";
		data[2][1]="naik2031";
		return data;
	}

	
	@Test(dataProvider="getData")
	public void TC_01(String username, String password)
	{
		System.out.println("Ahello");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void TC_02()
	{
		System.out.println("Bhii");
	}
	@Test
	public void TC_03()
	{
		System.out.println("Clove");
	}
	@Test(enabled=false)
	public void TC_04()
	{
		System.out.println("Dking");
	}
	@Test(dependsOnMethods= {"TC_02","TC_03"})
	public void TC_05()
	{
		System.out.println("Elion");
	}
	@Test(timeOut=5000)
	public void TC_06()                 
	{
		System.out.println("Ftiger");
	}
	

	
}
