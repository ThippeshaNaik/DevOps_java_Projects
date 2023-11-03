package Demo.demoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersDemo.class)
public class Demo {

@Test
public void testOne()
{
	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Your tore"); //string actual string expected from TestNG
}
}
