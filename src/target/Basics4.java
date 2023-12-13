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
			System.out.println("Before Class1");
			System.out.println("Before Class2");
			System.out.println("Before Class3");
			System.out.println("Before Class4");
			//ARchitect Changes
			System.out.println("Before Class5");
			System.out.println("Before Class6");
			System.out.println("Before Class7");
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
		public void MobileLoginhomeLoan1() {
			//Appium
			System.out.println("mobileloginhome1");
		}
		
		@Test
		public void LoginAPIhomeLoan() {
			//REST API automation
			System.out.println("loginapihome");
		}

	}


