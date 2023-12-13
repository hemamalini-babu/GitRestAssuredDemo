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
		System.out.println("Good1");
		System.out.println("Good2");
		System.out.println("Good3");
		System.out.println("Good4");
		System.out.println("Good5");
		System.out.println("Post Jira 2");
		System.out.println("Post Jira 3");
		
		
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
	@Test
	public void lastExecution1() {
		System.out.println("Last Executed1");
	}
	
}

