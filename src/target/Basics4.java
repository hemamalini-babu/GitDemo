package target;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basics4 {
	
		@BeforeClass
		public void bfClass() {
			System.out.println("Before Class");
		}

		@AfterClass
		public void afClass() {
			System.out.println("After Class");
		}

		@Test(groups = {"Smoke"})
		public void WebloginhomeLoan() {
			// selenium code
			System.out.println("webloginhome");
		}
		@BeforeMethod
		public void bfMethod() {
			System.out.println("Called before every method of 4th file");
		}
		@AfterMethod
		public void afMethod() {
			System.out.println("Called after every method of 4th file");
		}
		@Test
		public void MobileLoginhomeLoan() {
			//Appium
			System.out.println("mobileloginhome");
		}
		
		@Test
		public void LoginAPIhomeLoan() {
			//REST API automation
			System.out.println("loginapihome");
		}

	}


