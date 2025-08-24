package testng.framework.concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestNGAppCommons extends TestNGWebCommons {
	
	@BeforeMethod(dependsOnMethods= {"launchBrowserAndApplication"},alwaysRun=true)
	@Parameters({"USERNAME","PASSWORD"})
	public void loginIntoApplication(String username, String password) {
		System.out.println("Login process started for user: " + username);
		System.out.println("User logged in successfully with password: " + password);
	}
	
	@BeforeMethod(dependsOnMethods= {"loginIntoApplication"},alwaysRun=true)
	public void verifyApplicationHomePage() {
		System.out.println("Application home page is verified successfully.");
	}

	
	@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		System.out.println("User logged out successfully.");
	}


}
