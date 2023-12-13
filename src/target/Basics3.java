package target;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics3 {
	
	@Test(dataProvider="getData")
	public void Weblogin(String userName, String password) {// url name will have value from URL
		// selenium code
		System.out.println("weblogincar");
		System.out.println(userName);
		System.out.println(password);
		
		
	
	}
	
	@Test(enabled=false)
	public void MobileLogincarLoan() {
		//Appium
		System.out.println("mobilelogincar");
		System.out.println("mobilelogincar2");
		System.out.println("Web Automation");
	}
	@Test//(timeOut = 4000)
	public void MobileSignincarLoan() {
		//Appium
		System.out.println("mobilesignincar");
	}
	
	@Test(groups = {"Smoke"})
	public void MobileSignoutcarLoan() {
		//Appium
		System.out.println("mobilesignoutcar");
	}
	@AfterSuite
	public void afSuite() {
		System.out.println("I am Last 1");
	}
	@Parameters({"URL"})
	@Test(dependsOnMethods = {"Weblogin","MobileSignincarLoan"})
	public void LoginAPIcarLoan(String urlName) {
		//REST API automation
		System.out.println("loginapicar");
		System.out.println(urlName);
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination - username and passsword - good credit history
		//2nd - username and password - no credit history
		//3rd username and password - fraud credit history
		Object[][] data = new Object[3][2];// this is multidimensional object array, 3rows and 2 columns
		data[0][0] = "firstSetUsername";
		data[0][1] = "test@123";
		data[1][0] = "secondSetUsername";
		data[1][1] = "test@1234";
		data[2][0] = "thirdSetUsername";
		data[2][1] = "test@12345";
		return data;	
		
	}

}
