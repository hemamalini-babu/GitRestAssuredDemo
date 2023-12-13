package target;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// testNG itself acts as a java compiler and executes the java program for us , no need of main function


public class TestNGBasicsClass1 {
	
	@Parameters({"URL","APIkey/username"})
	@Test
	public void Demo(String urlName, String apiKey) {
	System.out.println("hello");
	System.out.println(urlName);
	System.out.print(apiKey);
	}
	
	@Test
	public void Demo2() {
		System.out.println("bye");
		Assert.assertTrue(false);
	}
	@Test
	public void Demo21() {
		System.out.println("bye1");
		Assert.assertTrue(false);
	}
	@Test
	public void Demo22() {
		System.out.println("bye2");
		Assert.assertTrue(false);
	}
}
