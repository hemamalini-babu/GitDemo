package target;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics2 {
	
	@Test(groups = {"Smoke"})
	public void personalLoan() {
		System.out.println("Good");
		
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I am no 1");
	
	}
	@BeforeTest
	public void prerequisite() {
		System.out.println("will execute first");
	}
	@AfterTest
	public void lastExecution() {
		System.out.println("Last Executed");
	}
	
}