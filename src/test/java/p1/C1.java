package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class C1 {
	@Test
	public void maventestexample()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("The test is completed");
		System.out.println("There is a change in the code");
		System.out.println("There is version 1.3 added to the code");
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void maventestexample1()
	{
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://google.com");
		driver1.manage().window().maximize();
		driver1.close();
		System.out.println("The test is completed");
		System.out.println("There is a change in the code");
		System.out.println("There is version 1.3 added to the code");
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void maventestexample2()
	{
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("http://google.com");
		driver2.manage().window().maximize();
		driver2.close();
		System.out.println("The test is completed");
		System.out.println("There is a change in the code");
		System.out.println("There is version 1.3 added to the code");
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}

}
